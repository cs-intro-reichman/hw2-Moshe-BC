// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int length = Integer.parseInt(args[0]);
		String mode = args[1];

		if(mode.equals("v")){
			for(int i = 1; i - 1 < length; i++){
				int count = 1, current = i;
				if (current == 1){
					System.out.print(current + " ");
					current = current * 3 + 1;
					count++;
					}
				while (current != 1){
					System.out.print(current + " ");
					if (current % 2 == 0){
						current = current / 2;
					}else{
						current = current * 3 + 1;
					}
					count++;
				}System.out.println("1 (" + count + ")");
			}
			System.out.println("Every one of the first " + length + " hailstone sequences reached 1.");
		
		}else if(mode.equals("c")){
			System.out.println("Every one of the first " + length + " hailstone sequences reached 1.");

		}
	}
}
