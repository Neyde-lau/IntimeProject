package model;
// Generated 15-Oct-2019 18:01:41 by Hibernate Tools 4.3.1



/**
 * Horariopresencas generated by hbm2java
 */
public class Horariopresencas  implements java.io.Serializable {


     private int id;
     private String codigoTurma;
     private String segunda;
     private String terca;
     private String quarta;
     private String quinta;
     private String sexta;

    public Horariopresencas() {
    }

	
    public Horariopresencas(int id, String codigoTurma) {
        this.id = id;
        this.codigoTurma = codigoTurma;
    }
    public Horariopresencas(int id, String codigoTurma, String segunda, String terca, String quarta, String quinta, String sexta) {
       this.id = id;
       this.codigoTurma = codigoTurma;
       this.segunda = segunda;
       this.terca = terca;
       this.quarta = quarta;
       this.quinta = quinta;
       this.sexta = sexta;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCodigoTurma() {
        return this.codigoTurma;
    }
    
    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
    public String getSegunda() {
        return this.segunda;
    }
    
    public void setSegunda(String segunda) {
        this.segunda = segunda;
    }
    public String getTerca() {
        return this.terca;
    }
    
    public void setTerca(String terca) {
        this.terca = terca;
    }
    public String getQuarta() {
        return this.quarta;
    }
    
    public void setQuarta(String quarta) {
        this.quarta = quarta;
    }
    public String getQuinta() {
        return this.quinta;
    }
    
    public void setQuinta(String quinta) {
        this.quinta = quinta;
    }
    public String getSexta() {
        return this.sexta;
    }
    
    public void setSexta(String sexta) {
        this.sexta = sexta;
    }




}

