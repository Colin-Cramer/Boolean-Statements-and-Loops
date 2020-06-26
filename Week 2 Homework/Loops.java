
public class Loops {

	public static void main(String[] args) {
		
//		5a. while loop that prints all even numbers from 0 to 100
		
		int a = 0;
		
		while (a <= 100) {
			if (a % 2 == 0) {
				System.out.println(a);
			}a++;
		} 
		
//		5b. while loop that prints ever third number backwards from 100 until reaching 0
		  
		int b = 100;
		
		while (b > 0) {
			System.out.println(b);
			b -= 3;
		} 
		
//		5c. for loop that prints every other number from 1 to 100
		
		for(int c = 1; c <= 100; c++) {
			if (c % 2 != 0) {
				System.out.println(c);
			}
		} 
		
//		5d. for loop that prints every number from 0 to 100 but if the number is divisible by 3, it prints "Hello" instead of the number,
//		and if the number is divisible by 5, it prints "World" instead of the number and if it is divisible by both 3 and 5, it prints
//		"HelloWorld" instead of the number.
		
		for(int d = 0; d <= 100; d++) {
			if (d % 3 == 0 && d % 5 == 0) {
				System.out.println("HelloWorld");
			} else if (d % 3 == 0) {
				System.out.println("Hello");
			} else if (d % 5 == 0) {
				System.out.println("World");
			}else {
				System.out.println(d);
			}
		}
	}
}
