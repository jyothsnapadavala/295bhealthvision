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
@Table(name = "doctors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctors.findAll", query = "SELECT d FROM Doctors d"),
    @NamedQuery(name = "Doctors.findByDid", query = "SELECT d FROM Doctors d WHERE d.did = :did"),
    @NamedQuery(name = "Doctors.findByFname", query = "SELECT d FROM Doctors d WHERE d.fname = :fname"),
    @NamedQuery(name = "Doctors.findByLname", query = "SELECT d FROM Doctors d WHERE d.lname = :lname"),
    @NamedQuery(name = "Doctors.findBySpecialization", query = "SELECT d FROM Doctors d WHERE d.specialization = :specialization"),
    @NamedQuery(name = "Doctors.findByEducation", query = "SELECT d FROM Doctors d WHERE d.education = :education"),
    @NamedQuery(name = "Doctors.findByCertification", query = "SELECT d FROM Doctors d WHERE d.certification = :certification"),
    @NamedQuery(name = "Doctors.findBySummary", query = "SELECT d FROM Doctors d WHERE d.summary = :summary"),
    @NamedQuery(name = "Doctors.findByAddressline1", query = "SELECT d FROM Doctors d WHERE d.addressline1 = :addressline1"),
    @NamedQuery(name = "Doctors.findByAddressline2", query = "SELECT d FROM Doctors d WHERE d.addressline2 = :addressline2"),
    @NamedQuery(name = "Doctors.findByCity", query = "SELECT d FROM Doctors d WHERE d.city = :city"),
    @NamedQuery(name = "Doctors.findByState", query = "SELECT d FROM Doctors d WHERE d.state = :state"),
    @NamedQuery(name = "Doctors.findByZip", query = "SELECT d FROM Doctors d WHERE d.zip = :zip"),
    @NamedQuery(name = "Doctors.findByStatus", query = "SELECT d FROM Doctors d WHERE d.status = :status")})
public class Doctors implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "did")
    private Long did;
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
    @Column(name = "specialization")
    private String specialization;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "education")
    private String education;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "certification")
    private String certification;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "summary")
    private String summary;
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
    @Size(min = 1, max = 128)
    @Column(name = "zip")
    private String zip;
    @Size(max = 8)
    @Column(name = "status")
    private String status;

    public Doctors() {
    }

    public Doctors(Long did) {
        this.did = did;
    }

    public Doctors(Long did, String fname, String lname, String specialization, String education, String certification, String summary, String addressline1, String addressline2, String city, String state, String zip) {
        this.did = did;
        this.fname = fname;
        this.lname = lname;
        this.specialization = specialization;
        this.education = education;
        this.certification = certification;
        this.summary = summary;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
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
        hash += (did != null ? did.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctors)) {
            return false;
        }
        Doctors other = (Doctors) object;
        if ((this.did == null && other.did != null) || (this.did != null && !this.did.equals(other.did))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sjsu.hv.entitybeans.Doctors[ did=" + did + " ]";
    }
    
}
