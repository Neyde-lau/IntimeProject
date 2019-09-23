/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeDeEnvioDeEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmail {
	
	public static void main(String []args) {
		
		String meuEmail = "meuEmail@gmail.com";
		String senha = " senha ";
		
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(meuEmail, senha));
		email.setSSLOnConnect(true);
		
		try {
			email.setFrom(meuEmail);
			email.setSubject("Teste de envio de email");
			email.setMsg("Este e o email teste do programa java");
			email.addTo("psigauque.ps@gmail.com");
			email.send();
			System.out.print("Enviado com sucesso!");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
