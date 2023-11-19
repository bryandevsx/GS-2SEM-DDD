package com.br.projetoClinica.testes;
import com.br.projetoClinica.classes.Usuario;

public class usuarioTeste {
	
	public static void main(String[]args) {
		
		Usuario usuario = new Usuario();
			
		usuario.setLoginUsuario("bryan.teixeir2004@gmail.com");
		usuario.setSenhaUsuario("***********");
		
		System.out.println("===============================================================");
		System.out.println("O login do usuário é: " + usuario.getLoginUsuario());
		System.out.println(" ");
		System.out.println("A senha do usuário é: " + usuario.getSenhaUsuario());
		System.out.println("===============================================================");
		
	}
	
}
