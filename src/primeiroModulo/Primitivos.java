package primeiroModulo;

public class Primitivos {
	
	// quanto de memŕia será preciso para armazenar uma variável, cada tipo abaixo tem um limite.
	
	byte byteVar = 127;
	// byte byteVar2 = 128; -> erro de compilação, pois ultrapassa o tamanho do armazemnamento;
	
	short curto = 10000;
	
	int inteiro = 1000000000;
	
	public long longo = 1000000000000000000L;
	
	
	// colocado um F no final, pois por padrão, quando coloca um . o compilador entende que é um Long
	// double tem o dobro do tamanho do double
	float pontoFlutuante = 10.10F;
	
	double pontoFlutuanteDobro = 10000000000.299;
	
	char character = 'S';
	
	boolean booleano = true;

}
