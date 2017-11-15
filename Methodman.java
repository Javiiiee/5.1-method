import java.util.Scanner;

public class Methodman {
	public static void main(String[] args){
		System.out.println(" Methodman: Enter any number");
		Scanner one = new Scanner(System.in);
		long x = one.nextLong();

		System.out.println("\n Methodman: the absolute value of "+x+" is "+absolute(x));
		System.out.println(" Methodman: "+x+"^10 equals "+tenth(x));
		System.out.println("\n Methodman: very well, first input is x next input is Y");
		long y = one.nextLong();
		System.out.println(" Methodman: the sum of x+y is " +f(x,y));
		System.out.println(" Methodman: enter last number, z");
		long z = one.nextLong();
		System.out.println(" Methodman: My last trick, the square root of x + the absolute value of y + z^y power is\n.....\n.....\nis "+g(x,y,z));
	}

	public static long tenth(long x) {
		long h = 1;
		for (int i = 0; i<10; i++)
			h *= x;
			return(h);
	}
	public static long absolute(long num) {
		return (num>=0)?num:(-1*num);
	}
	public static long f(long x,long y) {
		long sum = (x+y);
		return (sum);
	}
	public static double root(long num) {
		double t;
		double sroot = num / 2;
	
		do{
			t = sroot;
			sroot = (t + (num/2))/2;
		}while((t - sroot) !=0);
				return root;

	}
	public static long g(long x,long y, long z){
		long x2 = (root(z));
		long y2 = (absolute(y));
		long z2 = (z^y);
		long g = (x2+y2+z2);
		return(g);
		
	}
}
