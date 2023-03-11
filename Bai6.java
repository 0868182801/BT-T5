import java.util.Scanner;

public class Bai6 {
public static void main(String[] args) {
	Scanner scaner = new Scanner(System.in);
	int n;
	long giaithua = 1; // dùng kiểu dữ liệu lớn hơn int để tính giai thừa //
	do {
		System.out.println("\nNhap vao mot so nguyen dung bat ki: ");
		n = scaner.nextInt();
		if( n < 0 ) {
			System.out.println("So vua nhap khong phai la so nguyen duong vui long nhap lai");
		}
		else {	
			for( int i = 1; i <= n; i++) {
			giaithua = giaithua*i;
			}
		}
	} while ( n < 0 );
	System.out.println("Giai thua cua so nguyen duong " + n + " : " + n + " = " + giaithua);
	}
}
