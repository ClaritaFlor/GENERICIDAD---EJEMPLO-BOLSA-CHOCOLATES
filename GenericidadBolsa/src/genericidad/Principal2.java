package genericidad;

public class Principal2 {

	public static void main(String[] args) {
		Bolsa<ProductoDulce> bolsa= new Bolsa<ProductoDulce>(3);
		Chocolate c= new Chocolate("NIKOLO");
		Chocolate c1= new Chocolate("MOMENTO");
		Chocolate c2= new Chocolate("BON O BON");
		Caramelo c3= new Caramelo("FRUTILLA","MASTICABLE");
		Caramelo c4= new Caramelo("BANANA","MASTICABLE","CAJA",50,13.5);
		
		 
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(c3); 
		bolsa.add(c4);
		for (ProductoDulce x:bolsa) {
			System.out.println(x.toString());
		}

	}

}
