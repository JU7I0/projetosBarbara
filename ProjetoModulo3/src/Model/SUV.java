package Model;

public class SUV extends Veiculo{

	private double valorBase = 200.00;
	
	public SUV(String placa, double valorBase, String marca, String modelo, String ano, String porteVeiculo) {
		super(marca, modelo, ano, porteVeiculo, placa);
		this.valorBase = valorBase;
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	
}
