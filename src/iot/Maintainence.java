/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author ATIF ADIB
 */
@Entity
@Table(name = "maintainence", catalog = "iot", schema = "")
@NamedQueries({
    @NamedQuery(name = "Maintainence.findAll", query = "SELECT m FROM Maintainence m"),
    @NamedQuery(name = "Maintainence.findByServiceID", query = "SELECT m FROM Maintainence m WHERE m.serviceID = :serviceID"),
    @NamedQuery(name = "Maintainence.findByIssuedesc", query = "SELECT m FROM Maintainence m WHERE m.issuedesc = :issuedesc"),
    @NamedQuery(name = "Maintainence.findByRefersysID", query = "SELECT m FROM Maintainence m WHERE m.refersysID = :refersysID"),
    @NamedQuery(name = "Maintainence.findByTotaldowntimehrs", query = "SELECT m FROM Maintainence m WHERE m.totaldowntimehrs = :totaldowntimehrs"),
    @NamedQuery(name = "Maintainence.findByDom", query = "SELECT m FROM Maintainence m WHERE m.dom = :dom")})
public class Maintainence implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "serviceID")
    private Integer serviceID;
    @Column(name = "issuedesc")
    private String issuedesc;
    @Column(name = "refersysID")
    private Integer refersysID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totaldowntimehrs")
    private Float totaldowntimehrs;
    @Column(name = "dom")
    @Temporal(TemporalType.DATE)
    private Date dom;

    public Maintainence() {
    }

    public Maintainence(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        Integer oldServiceID = this.serviceID;
        this.serviceID = serviceID;
        changeSupport.firePropertyChange("serviceID", oldServiceID, serviceID);
    }

    public String getIssuedesc() {
        return issuedesc;
    }

    public void setIssuedesc(String issuedesc) {
        String oldIssuedesc = this.issuedesc;
        this.issuedesc = issuedesc;
        changeSupport.firePropertyChange("issuedesc", oldIssuedesc, issuedesc);
    }

    public Integer getRefersysID() {
        return refersysID;
    }

    public void setRefersysID(Integer refersysID) {
        Integer oldRefersysID = this.refersysID;
        this.refersysID = refersysID;
        changeSupport.firePropertyChange("refersysID", oldRefersysID, refersysID);
    }

    public Float getTotaldowntimehrs() {
        return totaldowntimehrs;
    }

    public void setTotaldowntimehrs(Float totaldowntimehrs) {
        Float oldTotaldowntimehrs = this.totaldowntimehrs;
        this.totaldowntimehrs = totaldowntimehrs;
        changeSupport.firePropertyChange("totaldowntimehrs", oldTotaldowntimehrs, totaldowntimehrs);
    }

    public Date getDom() {
        return dom;
    }

    public void setDom(Date dom) {
        Date oldDom = this.dom;
        this.dom = dom;
        changeSupport.firePropertyChange("dom", oldDom, dom);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceID != null ? serviceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maintainence)) {
            return false;
        }
        Maintainence other = (Maintainence) object;
        if ((this.serviceID == null && other.serviceID != null) || (this.serviceID != null && !this.serviceID.equals(other.serviceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iot.Maintainence[ serviceID=" + serviceID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
