package Model;

public class VeiculoPequeno extends Veiculo{
	
	private double valorBase = 100.00;
	
	public VeiculoPequeno(String placa, double valorBase, String marca, String modelo, String ano, String porteVeiculo) {
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
