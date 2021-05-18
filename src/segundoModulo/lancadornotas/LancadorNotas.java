package segundoModulo.lancadornotas;

import segundoModulo.UsuarioAutorizavel;

public class LancadorNotas {
	
	public void login(UsuarioAutorizavel usuarioAutorizavel) {
		boolean temAut = usuarioAutorizavel.temAutorizacao();
		
		if (temAut) {
			System.out.println("Usuario tem autorização");
		}
	}
}
