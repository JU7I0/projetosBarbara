package Controle.Exception;

public class RegistroExistenteException extends RuntimeException {

    public RegistroExistenteException(String tipo, String id) {
        super("Já existe um registro do tipo %s com o id %s.".formatted(tipo, id));
    }
}