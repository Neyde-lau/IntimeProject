package hiber.entity;
// Generated 27-Sep-2019 19:25:48 by Hibernate Tools 4.3.1



/**
 * Turma generated by hbm2java
 */
public class Turma  implements java.io.Serializable {


     private Integer codigo;
     private String curso;
     private String nivel;
     private String regime;
     private String email;
     private Horario horario;

    public Turma() {
    }

	
    public Turma(String nomeTurma) {
        this.curso = nomeTurma;
    }
    public Turma(String curso, String nivel,String regime, String email, Horario horario) {
       this.curso = curso;
       this.nivel = nivel;
       this.regime = regime;
       this.email = email;
       this.horario = horario;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String nomeTurma) {
        this.curso = nomeTurma;
    }
    public String getNivel() {
        return this.nivel;
    }
    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String tutor) {
        this.email = email;
    }
    public Horario getHorario() {
        return this.horario;
    }
    
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }
    





}


