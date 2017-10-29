import java.util.Scanner;
public class Studienberatung{ 
	public static void main(String[] arg){
		System.out.println("Hast du Abitur?");
		Scanner tastatur = new Scanner(System.in);
		String antwort = tastatur.next();
		

		
		else {
			System.out.println("Hast du Fachabitur?");
			antwort = tastatur.next();
			if (antwort.equals("ja")){
				System.out.println("Hast du eine Berufsausbildung?");
				antwort = tastatur.next();
					if (antwort.equals("ja")){
						System.out.println("Du kannst ja später noch studieren");
					}
					else {
						System.out.println("Besser noch studieren");
					}
			}
			else {
				System.out.println("Nicht studieren");
			}
		}
		
		
	}
}