/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umb.ai.sistemaexperto.entity;

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
import javax.validation.constraints.NotNull;

/**
 *
 * @author davin
 */
@Entity
@Table(name = "Cargo_Competencia")
@NamedQueries({
    @NamedQuery(name = "CargoCompetencia.findAll", query = "SELECT c FROM CargoCompetencia c")
    , @NamedQuery(name = "CargoCompetencia.findById", query = "SELECT c FROM CargoCompetencia c WHERE c.id = :id")})
public class CargoCompetencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @JoinColumn(name = "cargo_id", referencedColumnName = "Id")
    @ManyToOne
    private Cargo cargoId;
    @JoinColumn(name = "competencia_id", referencedColumnName = "Id")
    @ManyToOne
    private Competencia competenciaId;

    public CargoCompetencia() {
    }

    public CargoCompetencia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cargo getCargoId() {
        return cargoId;
    }

    public void setCargoId(Cargo cargoId) {
        this.cargoId = cargoId;
    }

    public Competencia getCompetenciaId() {
        return competenciaId;
    }

    public void setCompetenciaId(Competencia competenciaId) {
        this.competenciaId = competenciaId;
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
        if (!(object instanceof CargoCompetencia)) {
            return false;
        }
        CargoCompetencia other = (CargoCompetencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "umb.ai.sistemaexperto.entity.CargoCompetencia[ id=" + id + " ]";
    }
    
}
