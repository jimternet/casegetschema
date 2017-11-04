//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The amount and type of bond required of the defendant.
 * 
 * <p>Java class for WarrantBondType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantBondType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}BondAmount"/>
 *         &lt;element name="BondType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}BondTypeText" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FineAmount" type="{http://www.courts.state.mn.us/CourtXML/3}CurrencyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarrantBondType", propOrder = {
    "bondAmount",
    "bondType",
    "fineAmount"
})
public class WarrantBondType {

    @XmlElement(name = "BondAmount")
    protected double bondAmount;
    @XmlElement(name = "BondType")
    protected WarrantBondType.BondType bondType;
    @XmlElement(name = "FineAmount")
    protected Double fineAmount;

    /**
     * Gets the value of the bondAmount property.
     * 
     */
    public double getBondAmount() {
        return bondAmount;
    }

    /**
     * Sets the value of the bondAmount property.
     * 
     */
    public void setBondAmount(double value) {
        this.bondAmount = value;
    }

    /**
     * Gets the value of the bondType property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantBondType.BondType }
     *     
     */
    public WarrantBondType.BondType getBondType() {
        return bondType;
    }

    /**
     * Sets the value of the bondType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantBondType.BondType }
     *     
     */
    public void setBondType(WarrantBondType.BondType value) {
        this.bondType = value;
    }

    /**
     * Gets the value of the fineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFineAmount() {
        return fineAmount;
    }

    /**
     * Sets the value of the fineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFineAmount(Double value) {
        this.fineAmount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}BondTypeText" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bondTypeText"
    })
    public static class BondType {

        @XmlElement(name = "BondTypeText", required = true, nillable = true)
        protected List<BondTypeCodeTextType> bondTypeText;

        /**
         * Gets the value of the bondTypeText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bondTypeText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBondTypeText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BondTypeCodeTextType }
         * 
         * 
         */
        public List<BondTypeCodeTextType> getBondTypeText() {
            if (bondTypeText == null) {
                bondTypeText = new ArrayList<BondTypeCodeTextType>();
            }
            return this.bondTypeText;
        }

    }

}
