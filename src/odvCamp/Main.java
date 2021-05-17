package odvCamp;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			
		Footballer footballer1 = new Footballer(1, "Cristiano Ronaldo", 36, 51, "Juventus");
		
		Footballer footballer2 = new Footballer(2, "Burak Y�lmaz", 35, 2, "Lille");
		
		Footballer footballer3 = new Footballer(3, "Lionel Messi", 33, 80, "FC Barcelona");
		
		Footballer[] footballers = {
				
				footballer1,footballer2,footballer3
				
		};
		
		
		
		for (Footballer footballer : footballers) {
			System.out.println(footballer.id+". Futbolcunun ismi: "+footballer.name
					+" Ya�: "+footballer.age+" Mevcut tak�m: "+footballer.team
					+ " G�ncel bonservis bedeli : "+footballer.transferFee
					+" milyon dolar");
		}
		
		
		System.out.println(" ");
		System.out.println("Futbolculara 1-5 aras�nda bir de�er vermek ister misiniz? ");
		System.out.print("Evet: 1 ;");
		System.out.println(" Hay�r: 2");
		
		System.out.print("Cevap: ");
		int tempRating = scan.nextInt();
		System.out.println(" ");
		
		if(tempRating==1) {
			Rating rating = new Rating();
			rating.addRating(footballer1,footballer2,footballer3);
			}
		else if(tempRating==2) {
			System.out.println("Bizi tercih etti�iniz i�in te�ekk�rler.");
		}
		else {
			System.out.println("Ge�ersiz komut girildi.");
		}
		System.out.println(" ");
		System.out.println("Programdan ��k�l�yor...");
		
		
	}
	  

}
