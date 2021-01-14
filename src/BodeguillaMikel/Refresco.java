package BodeguillaMikel;

public class Refresco extends Articulo {

	private String sabor;
	private boolean zumo;
	private boolean gas;
	private int azucar;
	
	public Refresco(String codigo, String nombre, String marca, double precio, int stock, String sabor, boolean zumo, boolean gas, int azucar) {
		super (codigo, nombre, marca, precio, stock);
		this.sabor = sabor;
		this.zumo = zumo;
		this.gas = gas;
		this.azucar = azucar;
	}
	
	public boolean saludable() {
		if (azucar<25) {return true;}
		
		else {return false;}
	}
	
	public void verCaracteristicas() {	
		System.out.println("\r\n _____________________________________"
				+ "\r\n Codigo: " + codigo + 
				"\r\n Nombre: " + nombre +
				"\r\n Marca: " + marca +
				"\r\n Precio -----------> " + precio + 
				"\r\n Stock -----------> " + stock + 
				"\r\n Sabor -----------> " + sabor + 
				"\r\n Zumo -----------> " + zumo + 
				"\r\n Gas -----------> " + gas + 
				"\r\n Azucar -----------> " + azucar
				+ "\r\n ");
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isZumo() {
		return zumo;
	}

	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}

	public String isGas() {
		if (gas) {
			return "Bai";
		}
		else {
			return "Ez";
		}
	}

	public void setGas(boolean gas) {
		this.gas = gas;
	}

	public int getAzucar() {
		return azucar;
	}

	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}
	
	
}
