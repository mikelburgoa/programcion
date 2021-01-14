package BodeguillaMikel;

public class Vino extends Articulo{
	
	
	private String color;
	private String origen;
	private int anio;
	private String uva;
	private int alcohol;
	
	public Vino(String codigo, String nombre, String marca, double precio, int stock, String color, String origen, int anio, String uva, int alcohol) {
		super(codigo, nombre, marca, precio, stock);
		this.color = color;
		this.origen = origen;
		this.anio = anio;
		this.uva = uva;
		this.alcohol = alcohol;
	}
	
	public void verCaracteristicas() {
		System.out.println("\r\n _____________________________________" + 
				"\r\n Codigo: " + codigo + 
				"\r\n Nombre: " + nombre + 
				"\r\n Marca: " + marca  + 
				"\r\n Precio -----------> " + precio + 
				"\r\n Stock -----------> " + stock + 
				"\r\n Color -----------> " + color + 
				"\r\n Origen -----------> " + origen + 
				"\r\n Anio -----------> " + anio + 
				"\r\n Uva -----------> " + uva + 
				"\r\n Alcohol -----------> " + alcohol +
				"\r\n ");
	}
	
	public boolean saludable() {
		if (origen.equalsIgnoreCase("rioja")) {
			return true;
		}else {return false;}
	}
	
	public void bebida_muy_alcoholica() {
		if (alcohol>=6) {
			precio = precio*1.05;
		}
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getUva() {
		return uva;
	}
	
	public void setUva(String uva) {
		this.uva = uva;
	}
	
	
}
