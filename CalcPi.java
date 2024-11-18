// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int range = Integer.parseInt(args[0]);
		double sum = 0;
		boolean minus = false;
		for (int i = 1; i < 2 * range; i = i +2){
			if (minus) {
				sum = sum - (1.0 / i);
			}else{
				sum = sum + (1.0 / i);
			}
			minus = !minus;
		}
		sum = sum * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum);
	}
}
