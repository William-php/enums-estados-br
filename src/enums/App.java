package enums;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (EstadosBrasileiros estado:EstadosBrasileiros.values()) {
			System.out.println("Estado: " + estado.getSigla() + " - " + estado.getNomeMaiusculo());
		}
		//
	}

}
