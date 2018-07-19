package genericidad;

public class Principal {

	public static void main(String[] args) {
		Bolsa<Chocolate> bolsa= new Bolsa<Chocolate>(3);
		Chocolate c= new Chocolate("NIKOLO");
		Chocolate c1= new Chocolate("MOMENTO");
		Chocolate c2= new Chocolate("BON O BON");
		Chocolate c3= new Chocolate("SUBLIME");
		Chocolate c4= new Chocolate("GAROTO");
		 
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(c3); 
		bolsa.add(c4);
		for (Chocolate chocolatina:bolsa) {
			System.out.println(chocolatina.getMarca());
		}

	}

}
