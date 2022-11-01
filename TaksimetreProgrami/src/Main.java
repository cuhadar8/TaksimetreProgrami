import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Km değerini giriniz: ");
		int km = scanner.nextInt();
		double perKm = 2.20;
		
		double tutar = 10 + (km * perKm);
		
		tutar = (tutar < 20) ? 20 : tutar;
		System.out.println("Toplam tutar: " + tutar);
		
	}

}
