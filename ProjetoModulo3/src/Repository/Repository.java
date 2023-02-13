package Repository;

import java.util.List;

public interface Repository<T> {
	
	 T cadastrar(T entidade);

	    void alterar(T entidade);
	    
	    boolean deletar(String id);

	    T buscar(String id);

	    List<T> listarTodos();
}
