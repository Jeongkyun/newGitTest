import java.awt.Color ;

public class Mandelbrot {
	
	public int repetitions ( Complex c , int max ) {
		int count = 0 ;
		Complex d = new Complex ( ) ;
		while ( d.norm() <= 2 && count != max ) {
			d.square ( ) ;
			d.add ( c ) ;
			count ++ ;
		}
		return count ;
	}
	
	public Color colorAt ( double x, double y ) {
		Complex c = new Complex ( x, y ) ;
		double q = repetitions ( c, 50 ) / (double) 50 ;
		int r = (int) ( 255 * Math.max( Math.min( 3*q - 1 , 3 - 3*q ), 0 ) ) ;
		int g = (int) ( 255 * Math.max( Math.min( 3*q , 2 - 3*q ), 0 ) ) ;
		int b = (int) ( 255 * Math.max( 1 - 3*q , 0 ) ) ;
		Color color = new Color ( r, g, b ) ;
		return color ;
	}
	
}
