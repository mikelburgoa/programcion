package BodeguillaMikel;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		try {
		Scanner input= new Scanner (System.in);
		Kudeatzailea kude = new Kudeatzailea ();
		
		int aukera;
		do {
			
			
			kude.menuaErakutsi();
			aukera=Integer.parseInt(input.nextLine());
			
			switch (aukera) {
				case 1: kude.Factura();break;
				case 2: kude.artGuztiak(); break;
				case 3: kude.verSaludable(); break;
				case 4: kude.verIguales(); break;
				case 5: kude.masCaro(); break;
				case 6: kude.pocoStock(); break;
				default: 
					System.out.print("Sartu beste zenbaki bat mesedez");
				}
		}while (aukera!=0);
		
		
		input.close();
	
	}catch(Exception e) {
		
	}
	}
}