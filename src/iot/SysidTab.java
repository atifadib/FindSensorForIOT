/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ATIF ADIB
 */
@Entity
@Table(name = "sysid_tab", catalog = "iot", schema = "")
@NamedQueries({
    @NamedQuery(name = "SysidTab.findAll", query = "SELECT s FROM SysidTab s"),
    @NamedQuery(name = "SysidTab.findBySysID", query = "SELECT s FROM SysidTab s WHERE s.sysID = :sysID")})
public class SysidTab implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sysID")
    private Integer sysID;

    public SysidTab() {
    }

    public SysidTab(Integer sysID) {
        this.sysID = sysID;
    }

    public Integer getSysID() {
        return sysID;
    }

    public void setSysID(Integer sysID) {
        Integer oldSysID = this.sysID;
        this.sysID = sysID;
        changeSupport.firePropertyChange("sysID", oldSysID, sysID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sysID != null ? sysID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysidTab)) {
            return false;
        }
        SysidTab other = (SysidTab) object;
        if ((this.sysID == null && other.sysID != null) || (this.sysID != null && !this.sysID.equals(other.sysID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iot.SysidTab[ sysID=" + sysID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
