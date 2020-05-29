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
@Table(name = "Aspirante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aspirante.findAll", query = "SELECT a FROM Aspirante a")
    , @NamedQuery(name = "Aspirante.findById", query = "SELECT a FROM Aspirante a WHERE a.id = :id")
    , @NamedQuery(name = "Aspirante.findByAreaAsp", query = "SELECT a FROM Aspirante a WHERE a.areaAsp = :areaAsp")
    , @NamedQuery(name = "Aspirante.findByAreaExp", query = "SELECT a FROM Aspirante a WHERE a.areaExp = :areaExp")
    , @NamedQuery(name = "Aspirante.findByNombre", query = "SELECT a FROM Aspirante a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Aspirante.findByEstadoAsp", query = "SELECT a FROM Aspirante a WHERE a.estadoAsp = :estadoAsp")
    , @NamedQuery(name = "Aspirante.findByIdentificacion", query = "SELECT a FROM Aspirante a WHERE a.identificacion = :identificacion")})
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
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estado_asp")
    private Short estadoAsp;
    @Column(name = "identificacion")
    private Integer identificacion;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getEstadoAsp() {
        return estadoAsp;
    }

    public void setEstadoAsp(Short estadoAsp) {
        this.estadoAsp = estadoAsp;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    @XmlTransient
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
        return "umb.ai.sistemaexperto.repository.Aspirante[ id=" + id + " ]";
    }
    
}
