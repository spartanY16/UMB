/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umb.ai.sistemaexperto.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author davin
 */
@Entity
@Table(name = "Competencia_Pregunta")
@NamedQueries({
    @NamedQuery(name = "CompetenciaPregunta.findAll", query = "SELECT c FROM CompetenciaPregunta c")
    , @NamedQuery(name = "CompetenciaPregunta.findById", query = "SELECT c FROM CompetenciaPregunta c WHERE c.id = :id")})
public class CompetenciaPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @OneToMany(mappedBy = "competenciaId")
    private Collection<CompetenciaPregunta> competenciaPreguntaCollection;
    @JoinColumn(name = "competencia_id", referencedColumnName = "Id")
    @ManyToOne
    private CompetenciaPregunta competenciaId;
    @JoinColumn(name = "pregunta_id", referencedColumnName = "Id")
    @ManyToOne
    private Pregunta preguntaId;

    public CompetenciaPregunta() {
    }

    public CompetenciaPregunta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<CompetenciaPregunta> getCompetenciaPreguntaCollection() {
        return competenciaPreguntaCollection;
    }

    public void setCompetenciaPreguntaCollection(Collection<CompetenciaPregunta> competenciaPreguntaCollection) {
        this.competenciaPreguntaCollection = competenciaPreguntaCollection;
    }

    public CompetenciaPregunta getCompetenciaId() {
        return competenciaId;
    }

    public void setCompetenciaId(CompetenciaPregunta competenciaId) {
        this.competenciaId = competenciaId;
    }

    public Pregunta getPreguntaId() {
        return preguntaId;
    }

    public void setPreguntaId(Pregunta preguntaId) {
        this.preguntaId = preguntaId;
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
        if (!(object instanceof CompetenciaPregunta)) {
            return false;
        }
        CompetenciaPregunta other = (CompetenciaPregunta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "umb.ai.sistemaexperto.entity.CompetenciaPregunta[ id=" + id + " ]";
    }
    
}
