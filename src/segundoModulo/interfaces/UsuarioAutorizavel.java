package segundoModulo.interfaces;

public interface UsuarioAutorizavel {
	// por padrão todo os métodos da interface são públicos.
	// quem implementar minha interfacde tem que implementar os métodos daqui
	// possui métodos default
	// boolean temAutorizacao();
	
	default boolean temAutorizacao() {
		return true;
	}
}
