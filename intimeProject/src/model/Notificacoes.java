package model;
// Generated 15-Oct-2019 18:01:41 by Hibernate Tools 4.3.1



/**
 * Notificacoes generated by hbm2java
 */
public class Notificacoes  implements java.io.Serializable {


     private int codigo;
     private String destinatario;
     private String assunto;
     private String corpo;

    public Notificacoes() {
    }

	
    public Notificacoes(int codigo) {
        this.codigo = codigo;
    }
    public Notificacoes(int codigo, String destinatario, String assunto, String corpo) {
       this.codigo = codigo;
       this.destinatario = destinatario;
       this.assunto = assunto;
       this.corpo = corpo;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDestinatario() {
        return this.destinatario;
    }
    
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getAssunto() {
        return this.assunto;
    }
    
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public String getCorpo() {
        return this.corpo;
    }
    
    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }




}


