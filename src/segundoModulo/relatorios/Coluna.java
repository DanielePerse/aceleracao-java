package segundoModulo.relatorios;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // aonde quero colocar minha annotation (nos métodos)
@Retention(RetentionPolicy.RUNTIME)
public @interface Coluna {
	int posicao();
	String titulo();
}
