package Model;

public class Veiculo implements Entidade{
	
	private static final long serialVersionUID = 1L;
		
	private String marca;
	private String modelo;
	private String ano;
	private String porteVeiculo;
	private String placa;
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(String marca, String modelo, String ano, String porteVeiculo, String placa) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.porteVeiculo = porteVeiculo;
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getPorteVeiculo() {
		return porteVeiculo;
	}
	
	public void setPorteVeiculo(String porteVeiculo) {
		this.porteVeiculo = porteVeiculo;
	}

	@Override
	public String getId() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	

	
}
