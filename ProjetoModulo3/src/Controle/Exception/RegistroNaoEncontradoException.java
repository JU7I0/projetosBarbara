package Controle.Exception;

public class RegistroNaoEncontradoException extends RuntimeException {

    public RegistroNaoEncontradoException(String tipo, String id) {
        super("Não existe um registro do tipo %s com o id %s.".formatted(tipo, id));
    }
}
