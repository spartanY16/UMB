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
@Table(name = "Aspirante")
@NamedQueries({
    @NamedQuery(name = "Aspirante.findAll", query = "SELECT a FROM Aspirante a")
    , @NamedQuery(name = "Aspirante.findById", query = "SELECT a FROM Aspirante a WHERE a.id = :id")
    , @NamedQuery(name = "Aspirante.findByAreaAsp", query = "SELECT a FROM Aspirante a WHERE a.areaAsp = :areaAsp")
    , @NamedQuery(name = "Aspirante.findByAreaExp", query = "SELECT a FROM Aspirante a WHERE a.areaExp = :areaExp")})
public class Aspirante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Column(name = "area_asp")
    private Integer areaAsp;
    @Column(name = "area_exp")
    private Integer areaExp;
    @OneToMany(mappedBy = "aspiranteId")
    private Collection<Evaluacion> evaluacionCollection;

    public Aspirante() {
    }

    public Aspirante(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaAsp() {
        return areaAsp;
    }

    public void setAreaAsp(Integer areaAsp) {
        this.areaAsp = areaAsp;
    }

    public Integer getAreaExp() {
        return areaExp;
    }

    public void setAreaExp(Integer areaExp) {
        this.areaExp = areaExp;
    }

    public Collection<Evaluacion> getEvaluacionCollection() {
        return evaluacionCollection;
    }

    public void setEvaluacionCollection(Collection<Evaluacion> evaluacionCollection) {
        this.evaluacionCollection = evaluacionCollection;
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
        if (!(object instanceof Aspirante)) {
            return false;
        }
        Aspirante other = (Aspirante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "umb.ai.sistemaexperto.entity.Aspirante[ id=" + id + " ]";
    }
    
}
