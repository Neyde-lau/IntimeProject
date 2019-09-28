/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    , @NamedQuery(name = "Docente.findByCategoria", query = "SELECT d FROM Docente d WHERE d.categoria = :categoria")})
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
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "docente")
    private Disciplina disciplina;
    @OneToMany(mappedBy = "codigoDocente")
    private Collection<Docentedisciplina> docentedisciplinaCollection;
    @OneToMany(mappedBy = "codigoDocente")
    private Collection<Docenteturma> docenteturmaCollection;
    @JoinColumn(name = "codigoUtilizador", referencedColumnName = "codigo")
    @ManyToOne
    private Utilizador codigoUtilizador;

    public Docente() {
    }

    public Docente(Integer codigo) {
        this.codigo = codigo;
    }

    public Docente(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
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

    public Utilizador getCodigoUtilizador() {
        return codigoUtilizador;
    }

    public void setCodigoUtilizador(Utilizador codigoUtilizador) {
        this.codigoUtilizador = codigoUtilizador;
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
