package Ch1;

public class MyComplex {
	private double real;
	private double imag;
	public MyComplex(double real, double imag){
		this.real = real;
		this.imag = imag;	
	}
	//setters
	public void setReal(double real) {
		this.real = real;
	   }
	public void setImag(double imag) {
		this.imag = imag;
	   }
	public void setComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	   }
	//getters
	public double getReal() {
		return real;
	   }
	public double getImag() {
		return real;
	   }
	//toString method
	public String toString(){
		return "(" + real +" + " + imag + "i)";
	}
	// isReal()
	public Boolean isReal() {
		return (imag == 0); 
	}
	public Boolean isImaginary() {
		return (imag != 0); 
	}
	public Boolean equals(double real, double imag){
		return (this.real == real && this.imag == imag);
	}
	public Boolean equals(MyComplex another){
		return (another.real == real && another.imag == imag);
	}
	public double magnitude() {
		return (Math.sqrt(real * real + imag * imag));
	}
	public double argumentInRadians() {
		 return (Math.atan2(imag, real));
	}
	public double argumentInDegrees() {
		double a = 2 * Math.PI * 360 / argumentInRadians();
		return (a);
	}
	public MyComplex conjugate() {
		return new MyComplex(real, 0 - imag);
	}
	}

