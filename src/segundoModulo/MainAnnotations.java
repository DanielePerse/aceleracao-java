package segundoModulo;

import java.util.ArrayList;
import java.util.List;

import segundoModulo.alunos.Aluno;
import segundoModulo.alunos.ValidationException;
import segundoModulo.relatorios.GeradorRelatorio;
import segundoModulo.Usuario;

// annotations é uma maneira de escrever metadados (dados dos dados) em uma classe. Ex. Override
public class MainAnnotations {
	
	public static void main(String[] args) throws ValidationException {
		GeradorRelatorio gerador = new GeradorRelatorio();
		Usuario usuario = new Aluno("login", "123.456.789-00", "Nome do Aluno 1");
		Usuario usuario2 = new Aluno("login", "123.456.789-01", "Nome do Aluno 2");
		Usuario usuario3 = new Aluno("login", "123.456.789-02", "Nome do Aluno 3");
		List<Object> usuarios = new ArrayList<>();
		usuarios.add(usuario);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		gerador.gerarRelatorio(usuarios, 3);
	}
}