package hiber.entity;
// Generated 27-Sep-2019 19:25:48 by Hibernate Tools 4.3.1



/**
 * Disciplina generated by hbm2java
 */
public class Disciplina  implements java.io.Serializable {


     private Integer codigo;
     private Docente docente;
     private String nomeDisciplina;
     private String regente;
     private String assistente;

    public Disciplina() {
    }

	
    public Disciplina(Docente docente, String nomeDisciplina) {
        this.docente = docente;
        this.nomeDisciplina = nomeDisciplina;
    }
    public Disciplina(Docente docente, String nomeDisciplina,String regente, String assistente) {
       this.docente = docente;
       this.nomeDisciplina = nomeDisciplina;

       this.regente = regente;
       this.assistente = assistente;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Docente getDocente() {
        return this.docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }
    
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getRegente() {
        return regente;
    }

    
    public void setRegente(String regente) {
        this.regente = regente;
    }
    public String getAssistente() {
        return this.assistente;
    }
    
    public void setAssistente(String assistente) {
        this.assistente = assistente;
    }




}


