/*
Write a method called distance that accepts four integer coordinates x1, y1, x2, and y2 as parameters and computes the distance between points (x1, y1) and (x2, y2) on the Cartesian plane. The equation for the distance is:

distance equation
For example, the call of distance(1, 0, 4, 4) would return 5.0 and the call of distance(10, 2, 3, 5) would return 7.615773105863909.
*/
public class Distance {
	public static void main(String[] args){
		distance(1, 0, 4, 4);
		distance(10, 2, 3, 5);
	}

	public double distance(int x1, int x2, int y1, int y2){
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}