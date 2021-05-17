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
		System.out.println("Hangi futbolcuyu değerlendirmek istiyorsunuz? ");
		System.out.print("Cevap: ");
		int edit = scan.nextInt();
		if(edit==1) {
			System.out.println(" ");
			System.out.println("Şu anda değerlendirdiğiniz futbolcu "+footballer1.name);
			System.out.print("Lütfen vermek istediğiniz değeri giriniz: ");
			int player1 = scan.nextInt();
			if(player1>=1 && player1<=5) {
				System.out.println("Tebrikler! "+footballer1.name+" isimli oyuncunun derecesini "
			+player1+" olarak belirlediniz.");
			}
			else {
				System.out.print("Dikkat! Sadece 1-5 arasında derecelendirme yapabilirsiniz.");
				System.out.println("Lütfen programı yeniden başlatın.");
			}
		}
		else if(edit==2) {
			System.out.println(" ");
			System.out.println("Şu anda değerlendirdiğiniz futbolcu "+footballer2.name);
			System.out.print("Lütfen vermek istediğiniz değeri giriniz: ");
			int player2 = scan.nextInt();
			if(player2>=1 && player2<=5) {
				System.out.println("Tebrikler! "+footballer2.name+" isimli oyuncunun derecesini "
			+player2+" olarak belirlediniz.");
			}
			else {
				System.out.print("Dikkat! Sadece 1-5 arasında derecelendirme yapabilirsiniz.");
				System.out.println("Lütfen programı yeniden başlatın.");
			}
		}
		else if(edit==3) {
			System.out.println(" ");
			System.out.println("Şu anda değerlendirdiğiniz futbolcu "+footballer3.name);
			System.out.print("Lütfen vermek istediğiniz değeri giriniz: ");
			int player3 = scan.nextInt();
			if(player3>=1 && player3<=5) {
				System.out.println("Tebrikler! "+footballer3.name+" isimli oyuncunun derecesini "
			+player3+" olarak belirlediniz.");
			}
			else {
				System.out.print("Dikkat! Sadece 1-5 arasında derecelendirme yapabilirsiniz.");
				System.out.println("Lütfen programı yeniden başlatın.");
			}
		}
		else {
			System.out.println("Geçersiz komut girildi.");
		}
	}

}
