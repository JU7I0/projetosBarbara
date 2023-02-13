package Model;

public class VeiculoMedio extends Veiculo{

	private double valorBase = 150.00;
	
	public VeiculoMedio(String placa, double valorBase, String marca, String modelo, String ano, String porteVeiculo) {
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
