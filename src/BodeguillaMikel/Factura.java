package BodeguillaMikel;
import java.util.*;

public class Factura implements Facturacion {
	private int zenbakia;
	private String izena;
	private String abizena;
	private double total;
	
	ArrayList <LineaFactura> lineas =null;
	
	public Factura() {
		lineas = new ArrayList <LineaFactura> ();
	}

	public void AniadirLinea (String codigo, int cantidad, double total) {
		LineaFactura linea = new LineaFactura (codigo, cantidad, total);
		lineas.add(linea);
		System.out.println("** " + linea.getCodigo() +"		" 
				+ linea.getCantidad()+ "	" + linea.getTotalLinea());
	
		for(LineaFactura l: lineas) {
			System.out.println(l);
		}
	}
	
	public void print() {
	
		System.out.println("\r\n **************************************"
				+ "\r\n Num. factura :" + zenbakia
				+ "\r\n Nombre articulo: " + izena
				+ "\r\n Apellido cliente: " + abizena
				+ "\r\n **************************************"
				+ "\r\n Codigo	--	Cantidad	--	Subtotal");
		
		
		for (int i=0;i<lineas.size();i++){
			System.out.println("** "+lineas.get(i).getCodigo()+"	  	"
					+ lineas.get(i).getCantidad() + "	  	"
					+ lineas.get(i).getTotalLinea());
		}
	}

	public void calcularTotal() {
		double total=0;
		;
		for (int i=0;i<lineas.size();i++) {
			total+=lineas.get(i).getTotalLinea();
		}
		System.out.println("------------------------------\r\n"
				+ "TOTAL: " + total + " €"
				+ "\r\n****************************************");
	}

	public int getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		abizena = abizena;
	}

	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}

	public void setLineas(ArrayList<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	
	public double getTotal() {
		return total;
	}
	
	
	public void setTotal(double total) {
		this.total = total;
	}

	
	
	

}
