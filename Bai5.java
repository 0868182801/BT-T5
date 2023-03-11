import java.util.Scanner;

public class Bai5 {
public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		int sum = 0, n;
		do {
			System.out.println("Nhap vao so phan tu cua mang: ");
			n = scaner.nextInt();		
		} while( n < 0 );
		int T[] = new int[n];
		System.out.println("Nhap vao cac so nguyen can tinh tong: ");
		for( int i = 0; i < n; i++) {
			System.out.println("Nhap vao phan tu thu " + i + " : ");
			T[i] = scaner.nextInt();
			sum += T[i];
			if( sum > 100 ) break;
		}
		System.out.println("Tong cac so nguyen vua nhap la : " + sum );			
	}
}
