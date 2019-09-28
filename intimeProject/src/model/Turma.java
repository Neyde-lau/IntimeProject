/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Paula Sigauque
 */
@Entity
@Table(name = "turma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t")
    , @NamedQuery(name = "Turma.findByCodigo", query = "SELECT t FROM Turma t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Turma.findByCurso", query = "SELECT t FROM Turma t WHERE t.curso = :curso")
    , @NamedQuery(name = "Turma.findByTutor", query = "SELECT t FROM Turma t WHERE t.tutor = :tutor")
    , @NamedQuery(name = "Turma.findByNivel", query = "SELECT t FROM Turma t WHERE t.nivel = :nivel")
    , @NamedQuery(name = "Turma.findByRegime", query = "SELECT t FROM Turma t WHERE t.regime = :regime")
    , @NamedQuery(name = "Turma.findByEmail", query = "SELECT t FROM Turma t WHERE t.email = :email")})
public class Turma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "curso")
    private String curso;
    @Column(name = "tutor")
    private String tutor;
    @Basic(optional = false)
    @Column(name = "nivel")
    private int nivel;
    @Basic(optional = false)
    @Column(name = "regime")
    private String regime;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "codigoTurma")
    private Collection<Docenteturma> docenteturmaCollection;

    public Turma() {
    }

    public Turma(Integer codigo) {
        this.codigo = codigo;
    }

    public Turma(Integer codigo, String curso, int nivel, String regime, String email) {
        this.codigo = codigo;
        this.curso = curso;
        this.nivel = nivel;
        this.regime = regime;
        this.email = email;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Docenteturma> getDocenteturmaCollection() {
        return docenteturmaCollection;
    }

    public void setDocenteturmaCollection(Collection<Docenteturma> docenteturmaCollection) {
        this.docenteturmaCollection = docenteturmaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Turma[ codigo=" + codigo + " ]";
    }
    
}
