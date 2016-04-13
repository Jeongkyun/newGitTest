public class Fractal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mandelbrot m = new Mandelbrot();
		m.colorAt(0, 0);
		new FractalWindow(m);
	}

}
