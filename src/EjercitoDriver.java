
public class EjercitoDriver {

	public static void main (String [] args){
		
		Teniente ten = new Teniente();
		General gen = new General();
		Coronel cor = new Coronel();
		Soldado sol = new Soldado();
		
		System.out.println("GENERAL");
		System.out.println(gen.toString());
		gen.planificaEstrategia();
		System.out.println("");
		
		System.out.println("CORONEL");
		System.out.println(cor.toString());
		cor.ejecutaOrdenManiobra();
		System.out.println("");
		
		System.out.println("TENIENTE");
		System.out.println(ten.toString());
		ten.tomaOrdenCoronel("Cor. Sergio Marchena");
		System.out.println("");
		
		System.out.println("SOLDADO");
		System.out.println(sol.toString());
		sol.recibeOrden("Sergio Marchena");
		System.out.println("");
	}
}
