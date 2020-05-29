/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umb.ai.sistemaexperto.repository;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author davin
 */
@Entity
@Table(name = "Pregunta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p")
    , @NamedQuery(name = "Pregunta.findById", query = "SELECT p FROM Pregunta p WHERE p.id = :id")
    , @NamedQuery(name = "Pregunta.findByEncabezado", query = "SELECT p FROM Pregunta p WHERE p.encabezado = :encabezado")})
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "encabezado")
    private String encabezado;
    @OneToMany(mappedBy = "preguntaId")
    private Collection<OpcionRespuesta> opcionRespuestaCollection;
    @OneToMany(mappedBy = "preguntaId")
    private Collection<Evaluacion> evaluacionCollection;
    @OneToMany(mappedBy = "preguntaId")
    private Collection<CompetenciaPregunta> competenciaPreguntaCollection;

    public Pregunta() {
    }

    public Pregunta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    @XmlTransient
    public Collection<OpcionRespuesta> getOpcionRespuestaCollection() {
        return opcionRespuestaCollection;
    }

    public void setOpcionRespuestaCollection(Collection<OpcionRespuesta> opcionRespuestaCollection) {
        this.opcionRespuestaCollection = opcionRespuestaCollection;
    }

    @XmlTransient
    public Collection<Evaluacion> getEvaluacionCollection() {
        return evaluacionCollection;
    }

    public void setEvaluacionCollection(Collection<Evaluacion> evaluacionCollection) {
        this.evaluacionCollection = evaluacionCollection;
    }

    @XmlTransient
    public Collection<CompetenciaPregunta> getCompetenciaPreguntaCollection() {
        return competenciaPreguntaCollection;
    }

    public void setCompetenciaPreguntaCollection(Collection<CompetenciaPregunta> competenciaPreguntaCollection) {
        this.competenciaPreguntaCollection = competenciaPreguntaCollection;
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
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "umb.ai.sistemaexperto.repository.Pregunta[ id=" + id + " ]";
    }
    
}
