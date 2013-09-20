/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sjsu.hv.entitybeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jyothsna
 */
@Entity
@Table(name = "patients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p"),
    @NamedQuery(name = "Patients.findByPid", query = "SELECT p FROM Patients p WHERE p.pid = :pid"),
    @NamedQuery(name = "Patients.findByFname", query = "SELECT p FROM Patients p WHERE p.fname = :fname"),
    @NamedQuery(name = "Patients.findByLname", query = "SELECT p FROM Patients p WHERE p.lname = :lname"),
    @NamedQuery(name = "Patients.findByAddressline1", query = "SELECT p FROM Patients p WHERE p.addressline1 = :addressline1"),
    @NamedQuery(name = "Patients.findByAddressline2", query = "SELECT p FROM Patients p WHERE p.addressline2 = :addressline2"),
    @NamedQuery(name = "Patients.findByCity", query = "SELECT p FROM Patients p WHERE p.city = :city"),
    @NamedQuery(name = "Patients.findByState", query = "SELECT p FROM Patients p WHERE p.state = :state"),
    @NamedQuery(name = "Patients.findByZip", query = "SELECT p FROM Patients p WHERE p.zip = :zip"),
    @NamedQuery(name = "Patients.findByStatus", query = "SELECT p FROM Patients p WHERE p.status = :status")})
public class Patients implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pid")
    private Long pid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "fname")
    private String fname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "lname")
    private String lname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "addressline1")
    private String addressline1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "addressline2")
    private String addressline2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zip")
    private long zip;
    @Size(max = 8)
    @Column(name = "status")
    private String status;

    public Patients() {
    }

    public Patients(Long pid) {
        this.pid = pid;
    }

    public Patients(Long pid, String fname, String lname, String addressline1, String addressline2, String city, String state, long zip) {
        this.pid = pid;
        this.fname = fname;
        this.lname = lname;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sjsu.hv.entitybeans.Patients[ pid=" + pid + " ]";
    }
    
}
