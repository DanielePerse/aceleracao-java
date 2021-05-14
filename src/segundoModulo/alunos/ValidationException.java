package segundoModulo.alunos;

// palavra reservada exception - herança
public class ValidationException extends Exception{
	
	// montando um construtor com as info. da classe pai
	public ValidationException(String message) {
		super(message);
	}
}
