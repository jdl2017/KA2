package week2;

import acm.program.*;

/* This class will list the Fibonacci Sequence up to the
 * maximum value of 10,000, starting with 0 and 1.
 */
public class Fibonacci extends ConsoleProgram {

	private static final int MAXIMUM_TERM_VALUE = 10000;
	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		
		int Fib1 = 0;
		int Fib2 = 1;
		
		while (Fib1 <= MAXIMUM_TERM_VALUE) {
			println(Fib1);
			int Fib3 = Fib1 + Fib2;
			Fib1 = Fib2;
			Fib2 = Fib3;
		}
	}
}
