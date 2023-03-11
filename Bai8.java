import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int n, sum = 0;
		do {
			System.out.println("Nhap vao so n phan tu cua mang: ");
			n = T.nextInt();
		} while ( n < 0 );
	
		int A[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap vao phan tu thu " + i + " : ");
			A[i] = T.nextInt();
			sum = sum + A[i];
		}
		float tbc = (float)sum/n;
		System.out.println("Trung binh cong cua n so nguyen vua nhap la: " + tbc);
	}

}
