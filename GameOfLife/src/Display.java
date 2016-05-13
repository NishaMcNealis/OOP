/*
 * Created on May 24, 2004
 *
 * Latest update on April 21, 2011
 */
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComponent;

// Note that the JComponent is set up to listen for mouse clicks
// and mouse movement.  To achieve this, the MouseListener and
// MousMotionListener interfaces are implemented and there is additional
// code in init() to attach those interfaces to the JComponent.


public class Display extends JComponent implements MouseListener, MouseMotionListener {
	public static final int ROWS = 80;
	public static final int COLS = 100;
	public static Cell[][] cell = new Cell[ROWS][COLS];
	private final int X_GRID_OFFSET = 0; // 25 pixels from left
	private final int Y_GRID_OFFSET = 0; // 40 pixels from top
	private final int CELL_WIDTH = 8;
	private final int CELL_HEIGHT = 8;

	// Note that a final field can be initialized in constructor
	private final int DISPLAY_WIDTH;   
	private final int DISPLAY_HEIGHT;
	private StartButton startStop;
	private PauseButton pausePlay;
	private ClearButton clear;
	private StepButton step;
	private boolean paintloop = false;


	public Display(int width, int height) {
		DISPLAY_WIDTH = width;
		DISPLAY_HEIGHT = height;
		init();
	}


	public void init() {
		setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		initCells();

		addMouseListener(this);
		addMouseMotionListener(this);

		// Example of setting up a button.
		// See the StartButton class nested below.
		startStop = new StartButton();
		startStop.setBounds(120, 50, 100, 36);
		add(startStop);
		startStop.setVisible(true);
		repaint();
		
		//Pause Button
		pausePlay = new PauseButton();
		pausePlay.setBounds(220, 50, 100, 36);
		add(pausePlay);
		pausePlay.setVisible(true);
		repaint();
		
		//Clear Button
		clear = new ClearButton();
		clear.setBounds(320, 50, 100, 36);
		add(clear);
		clear.setVisible(true);
		repaint();
		
		//Step Button
		step = new StepButton();
		step.setBounds(420, 50, 100, 36);
		add(step);
		step.setVisible(true);
		repaint();
}




	private boolean green = false;
	public void paintComponent(Graphics g) {
		final int TIME_BETWEEN_REPLOTS = 100; // change to your liking
		/*
		if (green) {
			g.setColor(Color.GREEN);
			green = false;
		}
		else {
			g.setColor(Color.BLACK);
			green = true;
		}
		*/
		g.setColor(Color.BLACK);
		drawGrid(g);
		drawCells(g);
		drawButtons();

		if (paintloop) {
			try {
				Thread.sleep(TIME_BETWEEN_REPLOTS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			nextGeneration();
			repaint();
		}
	}


	public void initCells() {
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				cell[row][col] = new Cell(row, col);
			}
		}
		
		cell[36][22].setAlive(true); // sample use of cell mutator method
		cell[36][23].setAlive(true); // sample use of cell mutator method
		cell[36][24].setAlive(true); // sample use of cell mutator method
	}


	public void togglePaintLoop() {
		paintloop = !paintloop;
	}


	public void setPaintLoop(boolean value) {
		paintloop = value;
	}


	void drawGrid(Graphics g) {
		for (int row = 0; row <= ROWS; row++) {
			g.drawLine(X_GRID_OFFSET,
					Y_GRID_OFFSET + (row * (CELL_HEIGHT + 1)), X_GRID_OFFSET
					+ COLS * (CELL_WIDTH + 1), Y_GRID_OFFSET
					+ (row * (CELL_HEIGHT + 1)));
		}
		for (int col = 0; col <= COLS; col++) {
			g.drawLine(X_GRID_OFFSET + (col * (CELL_WIDTH + 1)), Y_GRID_OFFSET,
					X_GRID_OFFSET + (col * (CELL_WIDTH + 1)), Y_GRID_OFFSET
					+ ROWS * (CELL_HEIGHT + 1));
		}
	}

	
	void drawCells(Graphics g) {
		// Have each cell draw itself
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				// The cell cannot know for certain the offsets nor the height
				// and width; it has been set up to know its own position, so
				// that need not be passed as an argument to the draw method
				cell[row][col].draw(X_GRID_OFFSET, Y_GRID_OFFSET, CELL_WIDTH,
						CELL_HEIGHT, g);
			}
		}
	}


	private void drawButtons() {
		
		startStop.repaint();
	}


	private void nextGeneration() {
		for (int i=0; i < ROWS; i++) {
			for (int a=0; a < COLS; a ++) {
				cell[i][a].calcNeighbors(cell);
				if (cell[i][a].getNeighbors() <= 1) {cell[i][a].setAliveNextTurn(false);}
				if (cell[i][a].getNeighbors() >= 4) {cell[i][a].setAliveNextTurn(false);}
				if (cell[i][a].getNeighbors() == 3) {cell[i][a].setAliveNextTurn(true);}
				if (cell[i][a].getNeighbors() == 2) {cell[i][a].setAliveNextTurn(true);}
			
			}
		}
		for (int i=0; i < ROWS; i++) {
			for (int a=0; a < COLS; a ++) {
				cell[i][a].setAlive(cell[i][a].getAliveNextTurn());
				//if (cell[i][a].getAliveNextTurn()) {cell[i][a].setAlive(true);}
				//else {cell[i][a].setAlive(false);}
			}
		}
	
	}


	public void mouseClicked(MouseEvent arg0) {
		double col = (arg0.getX())/9;
		double row = (arg0.getY())/9;
		int col1 = (int) Math.floor(col) ;
		int row1 = (int) Math.floor(row) ;

				
		cell[row1][col1].setAlive(!cell[row1][col1].getAlive());
		System.out.println("Clicked at row:" + row1 + " col:" + col1);
				repaint();
	}


	public void mouseEntered(MouseEvent arg0) {

	}


	public void mouseExited(MouseEvent arg0) {

	}


	public void mousePressed(MouseEvent arg0) {

	}


	public void mouseReleased(MouseEvent arg0) {

	}


	public void mouseDragged(MouseEvent arg0) {

	}


	public void mouseMoved(MouseEvent arg0) {

	}
	

	private class StartButton extends JButton implements ActionListener {
		StartButton() {
			super("Start");
			addActionListener(this);
		}
		public void actionPerformed(ActionEvent arg0) {
			nextGeneration(); // test the start button
			if (this.getText().equals("Start")) {
				togglePaintLoop();
				setText("Stop");
			} else {
				togglePaintLoop();
				setText("Start");
			}
			repaintTheDisplay();
		
	}
	}
	public class PauseButton extends JButton implements ActionListener {
		PauseButton() {
			super("Pause");
			addActionListener(this);
		}
		public void actionPerformed(ActionEvent arg0) {
			nextGeneration(); // test the button
			if (this.getText().equals("Pause")) {
				togglePaintLoop();
				setText("Play");
			} else {
				togglePaintLoop();
				setText("Pause");
			}
			repaintTheDisplay();
	}
	}
	public class ClearButton extends JButton implements ActionListener {
		ClearButton() {
			super("Clear");
			
			addActionListener(this);
		}
		public void actionPerformed(ActionEvent arg0) {
			nextGeneration(); // test the button
			if (this.getText().equals("Clear")) {
				for (int i=0; i < ROWS; i++) {
					for (int a=0; a < COLS; a ++) {
						cell[i][a].setAlive(false);
					}
				} 
			} 
			repaintTheDisplay();
		
	}
	}
	public class StepButton extends JButton implements ActionListener {
		StepButton() {
			super("Step");
			addActionListener(this);
			}
		public void actionPerformed(ActionEvent arg0) {
			nextGeneration(); // test the button
			if (this.getText().equals("Step")) {
				nextGeneration();
			}
			repaintTheDisplay();
		}
	}



	public void repaintTheDisplay() {
		repaint();
		
	}
}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}