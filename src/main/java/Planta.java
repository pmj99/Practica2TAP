

public class Planta {
	
	
	
	private Boton B1;
	private Boton B2;
	private Boton B3;
	
	public Planta() {
		
		
		
		
	}
	public void LlamarAscensor1(int plantaLlama) {
		
		B1.pulsar(1, plantaLlama, "ascensor1");
	}
	public void LlamarAscensor2(int plantaLlama) {
		
		B2.pulsar(1, plantaLlama, "ascensor2");
	}
	public void LlamarAscensor3(int plantaLlama) {
		
		B3.pulsar(1, plantaLlama, "ascensor3");
		
	} 
	
	
	

}
