package Controle;

import java.util.List;

import Controle.Exception.RegistroExistenteException;
import Model.Veiculo;
import Repository.VeiculoRepository;

public class GerenciamentoVeiculo {

	private static final String VEICULO_DESCRICAO_CLASSE = "Veiculo";
	private final VeiculoRepository veiculoRepository;
	
	
	public GerenciamentoVeiculo(VeiculoRepository veiculoRepository) {
		super();
		this.veiculoRepository = veiculoRepository;
	}
	
	public Veiculo cadastrarVeiculo(String marca, String modelo, String ano, String porteVeiculo, String placa) {
		
		if (existeVeiculo(placa)) {
            throw new RegistroExistenteException(VEICULO_DESCRICAO_CLASSE, placa);
        }

		Veiculo novoVeiculo = new Veiculo(marca, modelo, ano, porteVeiculo, placa);
		System.out.println("Veículo de marca " + marca + ", modelo " + modelo +", ano "+ ano + ", placa " + placa +
	    		", do tipo "+porteVeiculo +", foi alterado com sucesso.");
		veiculoRepository.cadastrar(novoVeiculo);
		
        return novoVeiculo;
    }
	
	public Veiculo alterarVeiculo(String marca, String modelo, String ano, String porteVeiculo, String placa) {
		
		Veiculo veiculo = veiculoRepository.consultarPorPlaca(placa);
		
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setAno(ano);
		veiculo.setPlaca(placa);
		veiculo.setPorteVeiculo(porteVeiculo);
		
		veiculoRepository.cadastrar(veiculo);
	    System.out.println("Veículo de marca " + marca + ", modelo " + modelo +", ano "+ ano + ", placa " + placa +
	    		", do tipo "+porteVeiculo +", foi alterado com sucesso.");
		return veiculo;
	}

	public boolean existeVeiculo(String placa) {
	        return veiculoRepository.buscar(placa) != null;
	}
	 
	public List<Veiculo> listarTodos() throws Exception{
		List<Veiculo> veiculo = veiculoRepository.listarTodos();
        return veiculo;
    }

	
}
