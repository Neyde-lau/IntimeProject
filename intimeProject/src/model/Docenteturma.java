/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Paula Sigauque
 */
@Entity
@Table(name = "docenteturma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docenteturma.findAll", query = "SELECT d FROM Docenteturma d")
    , @NamedQuery(name = "Docenteturma.findById", query = "SELECT d FROM Docenteturma d WHERE d.id = :id")})
public class Docenteturma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "codigoDocente", referencedColumnName = "codigo")
    @ManyToOne
    private Docente codigoDocente;
    @JoinColumn(name = "codigoTurma", referencedColumnName = "codigo")
    @ManyToOne
    private Turma codigoTurma;

    public Docenteturma() {
    }

    public Docenteturma(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Docente getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(Docente codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public Turma getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(Turma codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docenteturma)) {
            return false;
        }
        Docenteturma other = (Docenteturma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Docenteturma[ id=" + id + " ]";
    }
    
}
