/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicbill;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Vishwa
 */
@Entity
@Table(name = "CLIENTDETAIL", catalog = "", schema = "MAGICBILL")
@NamedQueries({
    @NamedQuery(name = "Clientdetail.findAll", query = "SELECT c FROM Clientdetail c")
    , @NamedQuery(name = "Clientdetail.findByClientid", query = "SELECT c FROM Clientdetail c WHERE c.clientid = :clientid")
    , @NamedQuery(name = "Clientdetail.findByClientname", query = "SELECT c FROM Clientdetail c WHERE c.clientname = :clientname")
    , @NamedQuery(name = "Clientdetail.findByContactname", query = "SELECT c FROM Clientdetail c WHERE c.contactname = :contactname")
    , @NamedQuery(name = "Clientdetail.findByPhone", query = "SELECT c FROM Clientdetail c WHERE c.phone = :phone")
    , @NamedQuery(name = "Clientdetail.findByEmail", query = "SELECT c FROM Clientdetail c WHERE c.email = :email")
    , @NamedQuery(name = "Clientdetail.findByGstin", query = "SELECT c FROM Clientdetail c WHERE c.gstin = :gstin")
    , @NamedQuery(name = "Clientdetail.findByTin", query = "SELECT c FROM Clientdetail c WHERE c.tin = :tin")
    , @NamedQuery(name = "Clientdetail.findByPan", query = "SELECT c FROM Clientdetail c WHERE c.pan = :pan")
    , @NamedQuery(name = "Clientdetail.findByVatno", query = "SELECT c FROM Clientdetail c WHERE c.vatno = :vatno")
    , @NamedQuery(name = "Clientdetail.findByBillingaddress", query = "SELECT c FROM Clientdetail c WHERE c.billingaddress = :billingaddress")
    , @NamedQuery(name = "Clientdetail.findByCity", query = "SELECT c FROM Clientdetail c WHERE c.city = :city")
    , @NamedQuery(name = "Clientdetail.findByState", query = "SELECT c FROM Clientdetail c WHERE c.state = :state")
    , @NamedQuery(name = "Clientdetail.findByCountry", query = "SELECT c FROM Clientdetail c WHERE c.country = :country")
    , @NamedQuery(name = "Clientdetail.findByPrivateclientdet", query = "SELECT c FROM Clientdetail c WHERE c.privateclientdet = :privateclientdet")
    , @NamedQuery(name = "Clientdetail.findByOtherclientdet", query = "SELECT c FROM Clientdetail c WHERE c.otherclientdet = :otherclientdet")
    , @NamedQuery(name = "Clientdetail.findByPin", query = "SELECT c FROM Clientdetail c WHERE c.pin = :pin")})
public class Clientdetail implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CLIENTID")
    private Long clientid;
    @Basic(optional = false)
    @Column(name = "CLIENTNAME")
    private String clientname;
    @Column(name = "CONTACTNAME")
    private String contactname;
    @Column(name = "PHONE")
    private BigInteger phone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GSTIN")
    private String gstin;
    @Column(name = "TIN")
    private String tin;
    @Column(name = "PAN")
    private String pan;
    @Column(name = "VATNO")
    private String vatno;
    @Column(name = "BILLINGADDRESS")
    private String billingaddress;
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "PRIVATECLIENTDET")
    private String privateclientdet;
    @Column(name = "OTHERCLIENTDET")
    private String otherclientdet;
    @Column(name = "PIN")
    private BigInteger pin;

    public Clientdetail() {
    }

    public Clientdetail(Long clientid) {
        this.clientid = clientid;
    }

    public Clientdetail(Long clientid, String clientname, String city) {
        this.clientid = clientid;
        this.clientname = clientname;
        this.city = city;
    }

    public Long getClientid() {
        return clientid;
    }

    public void setClientid(Long clientid) {
        Long oldClientid = this.clientid;
        this.clientid = clientid;
        changeSupport.firePropertyChange("clientid", oldClientid, clientid);
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        String oldClientname = this.clientname;
        this.clientname = clientname;
        changeSupport.firePropertyChange("clientname", oldClientname, clientname);
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        String oldContactname = this.contactname;
        this.contactname = contactname;
        changeSupport.firePropertyChange("contactname", oldContactname, contactname);
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        BigInteger oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        String oldGstin = this.gstin;
        this.gstin = gstin;
        changeSupport.firePropertyChange("gstin", oldGstin, gstin);
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        String oldTin = this.tin;
        this.tin = tin;
        changeSupport.firePropertyChange("tin", oldTin, tin);
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        String oldPan = this.pan;
        this.pan = pan;
        changeSupport.firePropertyChange("pan", oldPan, pan);
    }

    public String getVatno() {
        return vatno;
    }

    public void setVatno(String vatno) {
        String oldVatno = this.vatno;
        this.vatno = vatno;
        changeSupport.firePropertyChange("vatno", oldVatno, vatno);
    }

    public String getBillingaddress() {
        return billingaddress;
    }

    public void setBillingaddress(String billingaddress) {
        String oldBillingaddress = this.billingaddress;
        this.billingaddress = billingaddress;
        changeSupport.firePropertyChange("billingaddress", oldBillingaddress, billingaddress);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    public String getPrivateclientdet() {
        return privateclientdet;
    }

    public void setPrivateclientdet(String privateclientdet) {
        String oldPrivateclientdet = this.privateclientdet;
        this.privateclientdet = privateclientdet;
        changeSupport.firePropertyChange("privateclientdet", oldPrivateclientdet, privateclientdet);
    }

    public String getOtherclientdet() {
        return otherclientdet;
    }

    public void setOtherclientdet(String otherclientdet) {
        String oldOtherclientdet = this.otherclientdet;
        this.otherclientdet = otherclientdet;
        changeSupport.firePropertyChange("otherclientdet", oldOtherclientdet, otherclientdet);
    }

    public BigInteger getPin() {
        return pin;
    }

    public void setPin(BigInteger pin) {
        BigInteger oldPin = this.pin;
        this.pin = pin;
        changeSupport.firePropertyChange("pin", oldPin, pin);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientid != null ? clientid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientdetail)) {
            return false;
        }
        Clientdetail other = (Clientdetail) object;
        if ((this.clientid == null && other.clientid != null) || (this.clientid != null && !this.clientid.equals(other.clientid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "magicbill.Clientdetail[ clientid=" + clientid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
