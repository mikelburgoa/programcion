package BodeguillaMikel;
import java.util.Scanner;


public class Kudeatzailea {
	ListaArticulos lista = new ListaArticulos ();
	Factura fact = new Factura ();
	
	public void menuaErakutsi() {
		System.out.println("+-----------------------MENUA-----------------------+ \r\n"
				+ "1. Hacer una venta (crear factura) \r\n"
				+ "2. Listar todos los articulos \r\n"
				+ "3. Ver los articulos saludables \r\n"
				+ "4. Sacar una lista de articulos con precios equivalentes \r\n"
				+ "5. Ver el articulo mas caro \r\n"
				+ "6. Ver los articulos con poco stock \r\n"
				+ "+---------------------------------------------------+");
	}
	
	public void Factura () {
		try{
			int i=0;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Num factura");
		int zenbakia= Integer.parseInt(input.nextLine());
		fact.setZenbakia(zenbakia);
		System.out.println("Nombre cliente");
		String Izena = input.nextLine();
		fact.setIzena(Izena);
		System.out.println("Apellido cliente");
		String Abizena= input.nextLine();
		fact.setAbizena(Abizena);
		String art;
		int s;
		String [] dat;
		do {
			System.out.println("Escribe el codigo de articulo, la cantidad y pulsa ENTER (Por ejemplo-> FRES01-9),"
					+ "Para acabar de escribir articulos pulsa END");
			art=input.nextLine();
			
			dat = art.split("-");
			
			if (dat.length==2) {
				s=Integer.parseInt(dat[1]);
				i=0;
				while (i<lista.getLista().size()) {
				if (dat[0].equalsIgnoreCase(lista.getLista().get(i).getCodigo())){
					if (lista.getLista().get(i).getStock()>s) {
						
						lista.getLista().get(i).setStock(lista.getLista().get(i).getStock()-s);
						fact.AniadirLinea(lista.getLista().get(i).getCodigo(), s, (lista.getLista().get(i).getPrecio()*s));
						
					}else {
						System.out.println("Ez dago stock");
					}
				}
				i++;
				}
			}

			
		}while (!art.equalsIgnoreCase("END"));
		fact.print();
		fact.calcularTotal();
		input.close();
		}catch (Exception e){
			
		}
	}
	
	public void verSaludable () {
		int i=0;
		System.out.println("Artikulu osasungarriak honako hauek dira: ");
		while (i<lista.getLista().size()) {
			if (lista.getLista().get(i).saludable()) {
				lista.getLista().get(i).verCaracteristicas();
			}
			i++;
		}
	} 
	
	public void verIguales (){
		Scanner input = new Scanner (System.in);
		int i=0,x=0;
		System.out.println("Sartu artikuluaren kodigoa: ");
		String codigo = input.next();
		
		while (lista.getLista().size()>i) {
			if (lista.getLista().get(i).getCodigo().equalsIgnoreCase(codigo)) {
				while (x<lista.getLista().size()) {
					if (lista.getLista().get(i).getPrecio()== lista.getLista().get(x).getPrecio()) {
						lista.getLista().get(x).verCaracteristicas();
					}
					x++;
				}	
			}
			i++;
		}
		input.close();
	}
	
	public void pocoStock() {
		int i=0;
		while (i<lista.getLista().size()) {
			if (lista.getLista().get(i).getStock()<50) {
				lista.getLista().get(i).verCaracteristicas();
			}
			i++;
		}
	}
	
	public void artGuztiak() {
		
		for (int i=0;i<lista.getLista().size();i++) {
			lista.getLista().get(i).verCaracteristicas();
		}
	}
	
	public void masCaro() {
		lista.masCaro().verCaracteristicas();;
	}
}
