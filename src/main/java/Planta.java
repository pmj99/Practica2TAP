

public class Planta implements Observer {
	
	
	
	private Boton B1;
	private Boton B2;
	private Boton B3;
	
	private Display D1;
	private Display D2;
	private Display D3;
	
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
	public void EstadoAscensor1(Ascensor ascensor1,int pisoActual) {
		
		D1.MostrarPisoAscensor(ascensor1, pisoActual);
		
	}
	public void EstadoAscensor2(Ascensor ascensor2,int pisoActual) {
		
		D2.MostrarPisoAscensor(ascensor2, pisoActual);
	}
	public void EstadoAscensor3(Ascensor ascensor3,int pisoActual) {
		
		D3.MostrarPisoAscensor(ascensor3, pisoActual);
		
	}
	@Override
	public void update(int pisoActual) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
