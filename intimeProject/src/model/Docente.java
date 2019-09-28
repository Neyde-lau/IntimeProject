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
@Table(name = "docente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docente.findAll", query = "SELECT d FROM Docente d")
    , @NamedQuery(name = "Docente.findByCodigo", query = "SELECT d FROM Docente d WHERE d.codigo = :codigo")
    , @NamedQuery(name = "Docente.findByNome", query = "SELECT d FROM Docente d WHERE d.nome = :nome")
    , @NamedQuery(name = "Docente.findByCategoria", query = "SELECT d FROM Docente d WHERE d.categoria = :categoria")
    , @NamedQuery(name = "Docente.findByNivel", query = "SELECT d FROM Docente d WHERE d.nivel = :nivel")
    , @NamedQuery(name = "Docente.findByEmail", query = "SELECT d FROM Docente d WHERE d.email = :email")})
public class Docente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "nivel")
    private String nivel;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "codigoDocente")
    private Collection<Docentedisciplina> docentedisciplinaCollection;
    @OneToMany(mappedBy = "codigoDocente")
    private Collection<Docenteturma> docenteturmaCollection;

    public Docente() {
    }

    public Docente(Integer codigo) {
        this.codigo = codigo;
    }

    public Docente(Integer codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Docentedisciplina> getDocentedisciplinaCollection() {
        return docentedisciplinaCollection;
    }

    public void setDocentedisciplinaCollection(Collection<Docentedisciplina> docentedisciplinaCollection) {
        this.docentedisciplinaCollection = docentedisciplinaCollection;
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
        if (!(object instanceof Docente)) {
            return false;
        }
        Docente other = (Docente) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Docente[ codigo=" + codigo + " ]";
    }
    
}
