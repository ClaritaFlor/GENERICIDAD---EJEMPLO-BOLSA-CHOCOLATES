package genericidad;

public class ProductoDulce {
	private String presentacion;
	private int stock;
	private double precio;
	public ProductoDulce() {
		this.presentacion = "";
		this.stock = 0;
		this.precio = 0;
	}
	public ProductoDulce(String presentacion, int stock, double precio) {
		this.presentacion = presentacion;
		this.stock = stock;
		this.precio = precio;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "ProductoDulce [presentacion=" + presentacion + ", stock=" + stock + ", precio=" + precio + "]";
	}
	
	
}
