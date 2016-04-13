public class Complex {
	private double real;
	private double img;

	public Complex() {
		real = 0;
		img = 0;
	}

	public Complex(double real) {
		this.real = real;
	}

	public Complex(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public void setImg(double img) {
		this.img = img;
	}

	public double getReal() {
		return this.real;
	}

	public double getImg() {
		return this.img;
	}

	@Override
	public String toString() {
		return this.real + " + " + this.img + "i";
	}

	public void add(double real) {
		this.real += real;
	}

	public void add(Complex c) {
		add(c.real);
		this.img += c.img;
	}

	public void multiply(double real) {
		this.real *= real;
		this.img *= real;
	}

	public void multiply(Complex c) {
		double tmpReal = this.img * c.img;
		double tmpImg = this.real * c.img;
		multiply(c.real);
		this.real -= tmpReal;
		this.img += tmpImg;
	}

	public Complex square() {
		multiply(this);
		return this;
	}

	public double norm() {
		return Math.sqrt(this.real * this.real + this.img * this.img);
	}

}
