import java.util.Scanner;
public class Studienberatung{ 
	public static void main(String[] arg){
		System.out.println("Hast du Abitur?");
		Scanner tastatur = new Scanner(System.in);
		String antwort = tastatur.next();
		
		if (antwort.equals("ja")){
		System.out.println("Bist du wissbegierig?");
			antwort = tastatur.next();
		if (antwort.equals("ja")){
				System.out.println("Auf jeden Fall studieren!");
			}
			else {
				System.out.println("Nicht studieren");
			}
		}
		
		else {
			System.out.println("Hast du Fachabitur?");
			antwort = tastatur.next();
			
			else {
				System.out.println("Nicht studieren");
			}
		}
		
		
	}
}