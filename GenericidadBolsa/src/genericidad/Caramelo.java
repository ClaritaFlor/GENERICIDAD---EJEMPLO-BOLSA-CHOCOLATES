package genericidad;

public class Caramelo extends ProductoDulce{
	private String sabor;
	private String tipo;
	public Caramelo() {
		super();
		this.sabor = "";
		this.tipo = "";
	}
	public Caramelo(String sabor, String tipo) {
		super();
		this.sabor = sabor;
		this.tipo = tipo;
	}
	public Caramelo(String sabor, String tipo, String presentacion, int stock, double precio) {
		super(presentacion, stock, precio);
		this.sabor = sabor;
		this.tipo = tipo;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Caramelo [sabor=" + sabor + ", tipo=" + tipo + "] "+super.toString();
	}
	
}
