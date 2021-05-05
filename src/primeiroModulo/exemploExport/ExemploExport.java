package primeiroModulo.exemploExport;

import primeiroModulo.Primitivos;

public class ExemploExport {
	
	public static void main(String[] args) {
		// fiz a importação apertando enter + espaço. L. 11 acessei a variável long que está em outro pacote.
		Primitivos primitivos = new Primitivos();
		
		long longo = primitivos.longo;
		
		System.out.println(longo);
	}

}
