package genericidad;

public class Chocolate extends ProductoDulce {

	private String marca;

	public Chocolate() {
		super();
		this.marca = "";
	}
	public Chocolate(String marca) {
		this.marca = marca;
	}
	public Chocolate(String marca,String presentacion, int stock, double precio) {
		super(presentacion, stock, precio);
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Chocolate [marca=" + marca + "] "+super.toString();
	}

	

}