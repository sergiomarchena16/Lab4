// CC2006, Lab 4
// Una clase para representar a los Soldados.

public class Soldado extends Militar{
	
	public double getSalario(){
		return super.getSalario() - 10000.00;
	}

	public int getHoras(){
		return super.getHoras() * 2;
	}
	
	public int getDiasVacaciones(){
		return super.getDiasVacaciones() / 2;
	}
	
	public void recibeOrden(String orden){
		 System.out.println("Ordene mi general: " + orden);
	}
}
