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
@Table(name = "disciplina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d")
    , @NamedQuery(name = "Disciplina.findByCodigo", query = "SELECT d FROM Disciplina d WHERE d.codigo = :codigo")
    , @NamedQuery(name = "Disciplina.findByNome", query = "SELECT d FROM Disciplina d WHERE d.nome = :nome")
    , @NamedQuery(name = "Disciplina.findByCredito", query = "SELECT d FROM Disciplina d WHERE d.credito = :credito")
    , @NamedQuery(name = "Disciplina.findByCargaHoraria", query = "SELECT d FROM Disciplina d WHERE d.cargaHoraria = :cargaHoraria")
    , @NamedQuery(name = "Disciplina.findByRegente", query = "SELECT d FROM Disciplina d WHERE d.regente = :regente")
    , @NamedQuery(name = "Disciplina.findByAssistente", query = "SELECT d FROM Disciplina d WHERE d.assistente = :assistente")
    , @NamedQuery(name = "Disciplina.findByNivel", query = "SELECT d FROM Disciplina d WHERE d.nivel = :nivel")})
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "credito")
    private Integer credito;
    @Column(name = "cargaHoraria")
    private Integer cargaHoraria;
    @Column(name = "regente")
    private String regente;
    @Column(name = "assistente")
    private String assistente;
    @Column(name = "nivel")
    private String nivel;
    @OneToMany(mappedBy = "codigoDisciplina")
    private Collection<Docentedisciplina> docentedisciplinaCollection;

    public Disciplina() {
    }

    public Disciplina(Integer codigo) {
        this.codigo = codigo;
    }

    public Disciplina(Integer codigo, String nome) {
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

    public Integer getCredito() {
        return credito;
    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getRegente() {
        return regente;
    }

    public void setRegente(String regente) {
        this.regente = regente;
    }

    public String getAssistente() {
        return assistente;
    }

    public void setAssistente(String assistente) {
        this.assistente = assistente;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @XmlTransient
    public Collection<Docentedisciplina> getDocentedisciplinaCollection() {
        return docentedisciplinaCollection;
    }

    public void setDocentedisciplinaCollection(Collection<Docentedisciplina> docentedisciplinaCollection) {
        this.docentedisciplinaCollection = docentedisciplinaCollection;
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
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Disciplina[ codigo=" + codigo + " ]";
    }
    
}
