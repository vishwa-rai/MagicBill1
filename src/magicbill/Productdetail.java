/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicbill;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Vishwa
 */
@Entity
@Table(name = "PRODUCTDETAIL", catalog = "", schema = "MAGICBILL")
@NamedQueries({
    @NamedQuery(name = "Productdetail.findAll", query = "SELECT p FROM Productdetail p")
    , @NamedQuery(name = "Productdetail.findByProductId", query = "SELECT p FROM Productdetail p WHERE p.productId = :productId")
    , @NamedQuery(name = "Productdetail.findByHsn", query = "SELECT p FROM Productdetail p WHERE p.hsn = :hsn")
    , @NamedQuery(name = "Productdetail.findByPrice", query = "SELECT p FROM Productdetail p WHERE p.price = :price")
    , @NamedQuery(name = "Productdetail.findByQuantity", query = "SELECT p FROM Productdetail p WHERE p.quantity = :quantity")
    , @NamedQuery(name = "Productdetail.findByTax", query = "SELECT p FROM Productdetail p WHERE p.tax = :tax")
    , @NamedQuery(name = "Productdetail.findByProductname", query = "SELECT p FROM Productdetail p WHERE p.productname = :productname")})
public class Productdetail implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "HSN")
    private String hsn;
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private double price;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Basic(optional = false)
    @Column(name = "TAX")
    private double tax;
    @Column(name = "PRODUCTNAME")
    private String productname;

    public Productdetail() {
    }

    public Productdetail(Long productId) {
        this.productId = productId;
    }

    public Productdetail(Long productId, double price, double tax) {
        this.productId = productId;
        this.price = price;
        this.tax = tax;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        Long oldProductId = this.productId;
        this.productId = productId;
        changeSupport.firePropertyChange("productId", oldProductId, productId);
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        String oldHsn = this.hsn;
        this.hsn = hsn;
        changeSupport.firePropertyChange("hsn", oldHsn, hsn);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        Integer oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        double oldTax = this.tax;
        this.tax = tax;
        changeSupport.firePropertyChange("tax", oldTax, tax);
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        String oldProductname = this.productname;
        this.productname = productname;
        changeSupport.firePropertyChange("productname", oldProductname, productname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productdetail)) {
            return false;
        }
        Productdetail other = (Productdetail) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "magicbill.Productdetail[ productId=" + productId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
