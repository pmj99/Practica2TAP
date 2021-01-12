import java.util.ArrayList;

public class Planta implements Observer {
	
	
	
	private Boton B1;
	private Boton B2;
	private Boton B3;
	
	private Display D1;
	private Display D2;
	private Display D3;
	
	//private ArrayList<Boton> boton;
	
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
	public void EstadoAscensor1(int pisoActual) {
		
		D1.MostrarPisoAscensor(pisoActual);
		
	}
	public void EstadoAscensor2(int pisoActual) {
		
		D2.MostrarPisoAscensor( pisoActual);
	}
	public void EstadoAscensor3(int pisoActual) {
		
		D3.MostrarPisoAscensor(pisoActual);
		
	}
	@Override
	public void updateAscensor1(int pisoActual) {
		// TODO Auto-generated method stub
		
		this.EstadoAscensor1(pisoActual);
	}
	@Override
	public void updatAscensor2(int pisoActual) {
		// TODO Auto-generated method stub
		
		this.EstadoAscensor2(pisoActual);
	}
	@Override
	public void uptadeAscensor3(int pisoActual) {
		// TODO Auto-generated method stub
		
		this.EstadoAscensor3(pisoActual);
	}
	
	
	
	

}
