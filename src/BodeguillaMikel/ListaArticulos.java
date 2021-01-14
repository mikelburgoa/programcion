package BodeguillaMikel;
import java.io.*;
import java.util.*;

public class ListaArticulos {
	
	private ArrayList <Articulo> lista = null;
	

	
	public ListaArticulos() {
		try {
			
			lista = new ArrayList <Articulo>();
			
			BufferedReader buffer = new BufferedReader (new FileReader ("fitxategia/articulos.txt"));
			
			String line = buffer.readLine();
			String [] data;
			String [] ce =null;
			while (line!=null) {
				
				data=line.split("::");
				if (data[0].contains("WINE")) {
					Vino v = new Vino (data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]),
							data [5], data[6], Integer.parseInt(data[7]),data[8], Integer.parseInt(data[9]));
					lista.add(v);

					
				} else if (data[0].contains("FRES")){
					Refresco r = new Refresco (data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]),
						data[5], Boolean.parseBoolean(data[6]), Boolean.parseBoolean(data[7]), Integer.parseInt(data[8]));
					lista.add(r);

					
				} else if (data[0].contains("BEER")) {
					
					ce = data[6].split(",");

					Cerveza c = new Cerveza (data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]),
						data[5], ce, Integer.parseInt(data[7]));
					lista.add(c);
				}
				
				line=buffer.readLine();
				
			}
			buffer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ez da fitxategia irakurri");
		}
	}
	
	public String [] Reponer () {
		int i=0,r=0;
		
		String [] repo = null;
		while (lista.size()>i){
			if (lista.get(i).getStock()<50) {
				repo[r]= lista.get(i).getCodigo();
				r++;
			}
			i++;
		}
		return repo;
	}
	
	public Articulo masCaro() {
		int i=0, posizio=0;
		double max=0;
		System.out.println ("Aritukulu garestiena honako hau da:");
		
		while (lista.size()>i) {
			if (max<lista.get(i).getPrecio()) {
				posizio=i;
				max= lista.get(i).getPrecio();
			}
			i++;
		}
		return lista.get(posizio);
	}

	public double precio (String codigo) {
		int i=0;
		while (lista.size()>i) {
			if (lista.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				return lista.get(i).getPrecio();
			}
			i++;
		}
		return 0;	
	}
	
	public ArrayList<Articulo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Articulo> lista) {
		this.lista = lista;
	}
}


