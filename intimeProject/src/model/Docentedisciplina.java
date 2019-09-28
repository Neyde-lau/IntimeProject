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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "docentedisciplina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docentedisciplina.findAll", query = "SELECT d FROM Docentedisciplina d")
    , @NamedQuery(name = "Docentedisciplina.findById", query = "SELECT d FROM Docentedisciplina d WHERE d.id = :id")})
public class Docentedisciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "codigoDisciplina", referencedColumnName = "codigo")
    @ManyToOne
    private Disciplina codigoDisciplina;
    @JoinColumn(name = "codigoDocente", referencedColumnName = "codigo")
    @ManyToOne
    private Docente codigoDocente;

    public Docentedisciplina() {
    }

    public Docentedisciplina(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Disciplina getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(Disciplina codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public Docente getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(Docente codigoDocente) {
        this.codigoDocente = codigoDocente;
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
        if (!(object instanceof Docentedisciplina)) {
            return false;
        }
        Docentedisciplina other = (Docentedisciplina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Docentedisciplina[ id=" + id + " ]";
    }
    
}
