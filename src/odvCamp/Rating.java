package odvCamp;

import java.util.Scanner;

public class Rating {
	private char[] rattingAdds1;


	public Rating() {
		
	}
	Scanner scan = new Scanner(System.in);

	public void addRating(Footballer footballer1, Footballer footballer2, Footballer footballer3) {
		
		
		System.out.print(footballer1.name+ ": "+footballer1.id+" ");
		System.out.print(footballer2.name+ ": "+footballer2.id+" ");
		System.out.println(footballer3.name+ ": "+footballer3.id+" ");
		System.out.println(" ");
		System.out.println("Hangi futbolcuyu de�erlendirmek istiyorsunuz? ");
		System.out.print("Cevap: ");
		int edit = scan.nextInt();
		if(edit==1) {
			System.out.println(" ");
			System.out.println("�u anda de�erlendirdi�iniz futbolcu "+footballer1.name);
			System.out.print("L�tfen vermek istedi�iniz de�eri giriniz: ");
			int player1 = scan.nextInt();
			if(player1>=1 && player1<=5) {
				System.out.println("Tebrikler! "+footballer1.name+" isimli oyuncunun derecesini "
			+player1+" olarak belirlediniz.");
			}
			else {
				System.out.print("Dikkat! Sadece 1-5 aras�nda derecelendirme yapabilirsiniz.");
				System.out.println("L�tfen program� yeniden ba�lat�n.");
			}
		}
		else if(edit==2) {
			System.out.println(" ");
			System.out.println("�u anda de�erlendirdi�iniz futbolcu "+footballer2.name);
			System.out.print("L�tfen vermek istedi�iniz de�eri giriniz: ");
			int player2 = scan.nextInt();
			if(player2>=1 && player2<=5) {
				System.out.println("Tebrikler! "+footballer2.name+" isimli oyuncunun derecesini "
			+player2+" olarak belirlediniz.");
			}
			else {
				System.out.print("Dikkat! Sadece 1-5 aras�nda derecelendirme yapabilirsiniz.");
				System.out.println("L�tfen program� yeniden ba�lat�n.");
			}
		}
		else if(edit==3) {
			System.out.println(" ");
			System.out.println("�u anda de�erlendirdi�iniz futbolcu "+footballer3.name);
			System.out.print("L�tfen vermek istedi�iniz de�eri giriniz: ");
			int player3 = scan.nextInt();
			if(player3>=1 && player3<=5) {
				System.out.println("Tebrikler! "+footballer3.name+" isimli oyuncunun derecesini "
			+player3+" olarak belirlediniz.");
			}
			else {
				System.out.print("Dikkat! Sadece 1-5 aras�nda derecelendirme yapabilirsiniz.");
				System.out.println("L�tfen program� yeniden ba�lat�n.");
			}
		}
		else {
			System.out.println("Ge�ersiz komut girildi.");
		}
	}

}
