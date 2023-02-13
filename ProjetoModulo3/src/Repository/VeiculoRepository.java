package Repository;


import Model.Veiculo;

public interface VeiculoRepository extends Repository<Veiculo>{
	
	Veiculo consultarPorPlaca(String placa);

}
