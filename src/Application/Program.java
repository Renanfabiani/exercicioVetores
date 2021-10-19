package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.println("Quantos quartos vão ser alugados?");
		int n = sc.nextInt();
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Quarto");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel (name,email);
			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i=0; i<vect.length;i++) {
			if(vect[i]!= null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
		
		
	}

}
