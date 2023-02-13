package RepositoryEmMemoria;

import java.util.ArrayList;
import java.util.List;

import Model.Entidade;
import Repository.Repository;

public class RepositoryEmMemoria<T extends Entidade> implements Repository<T> {

	private final List<T> dados;

	public RepositoryEmMemoria() {
		this.dados = new ArrayList<>();
	}

	@Override
	public T cadastrar(T entidade) {
		if (existe(entidade)) {
            throw new IllegalArgumentException("Já existe uma pessoa/veiculo com esse id cadastrado");
        }
        dados.add(entidade);
        return entidade;
	}
	
	private boolean existe(T entidade) {
        String id = entidade.getId();
        return existe(id);
    }

    private boolean existe(String id) {
        return buscar(id) != null;
    }

	@Override
	public void alterar(T entidade) {
		 if (!existe(entidade)) {
	            throw new IllegalArgumentException("Não existe uma entidade com esse ID cadastrado para atualizar");
	        }

	     deletar(entidade.getId());
	     cadastrar(entidade);
	}

	@Override
	public T buscar(String id) {
		for (T entidade: dados) {
            if (entidade.getId().equals(id)) {
                return entidade;
            }
        }
        return null;
	}

	@Override
	public List<T> listarTodos() {
		 return new ArrayList<>(dados);
	}

	@Override
	public boolean deletar(String id) {
		if (existe(id)) {
            T buscar = buscar(id);
            dados.remove(buscar);
            return true;
        }
        return false;
	}

	
}
