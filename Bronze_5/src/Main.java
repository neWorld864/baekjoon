import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		// 1000번
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(0 < a && b < 10) {
//			System.out.println(a+b);
//		}
		
		
		// 1001번
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(0 < a && b < 10) {
//			System.out.println(a-b);
//		}
		
		
		// 1271번
//		Scanner sc = new Scanner(System.in);
//		BigInteger n = sc.nextBigInteger();
//		BigInteger m = sc.nextBigInteger();
//		
//		System.out.println(n.divide(m));
//		System.out.println(n.remainder(m));
		
		
		// 1550번
		/* String binaryString = Integer.toBinaryString(i); 		// 2진수
		String octalString = Integer.toOctalString(i);   			// 8진수
		String hexString = Integer.toHexString(i);       			// 16진수 
		
		int binaryToDecimal = Integer.parseInt(binaryString, 2);	// 10진수
		int binaryToOctal = Integer.parseInt(octalString, 8);		// 10진수
		int binaryToHex = Integer.parseInt(hexString, 16); 			// 10진수 */
		
//		Scanner sc = new Scanner(System.in);
//		int hex = Integer.parseInt(sc.nextLine(), 16);
//		System.out.println(hex);
		
		
		// 2338번
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		
	}
}
