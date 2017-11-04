//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}FeeDetailID"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}FeeDetailFeeCodeText"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}FeeDetailFeeAmount"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}FeeDetailFeeRecipientCurrentNameText" minOccurs="0"/>
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
    "feeDetailID",
    "feeDetailFeeCodeText",
    "feeDetailFeeAmount",
    "feeDetailFeeRecipientCurrentNameText"
})
@XmlRootElement(name = "TransactionFeeDetail")
public class TransactionFeeDetail {

    @XmlElement(name = "FeeDetailID", required = true)
    protected BigInteger feeDetailID;
    @XmlElement(name = "FeeDetailFeeCodeText", required = true)
    protected FeeCodeCodeTextType feeDetailFeeCodeText;
    @XmlElement(name = "FeeDetailFeeAmount")
    protected double feeDetailFeeAmount;
    @XmlElement(name = "FeeDetailFeeRecipientCurrentNameText")
    protected String feeDetailFeeRecipientCurrentNameText;

    /**
     * Uniquely identifies an instance of a fee.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeeDetailID() {
        return feeDetailID;
    }

    /**
     * Sets the value of the feeDetailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeeDetailID(BigInteger value) {
        this.feeDetailID = value;
    }

    /**
     * Gets the value of the feeDetailFeeCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCodeCodeTextType }
     *     
     */
    public FeeCodeCodeTextType getFeeDetailFeeCodeText() {
        return feeDetailFeeCodeText;
    }

    /**
     * Sets the value of the feeDetailFeeCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCodeCodeTextType }
     *     
     */
    public void setFeeDetailFeeCodeText(FeeCodeCodeTextType value) {
        this.feeDetailFeeCodeText = value;
    }

    /**
     * Amount assoicated with the fee.
     * 
     */
    public double getFeeDetailFeeAmount() {
        return feeDetailFeeAmount;
    }

    /**
     * Sets the value of the feeDetailFeeAmount property.
     * 
     */
    public void setFeeDetailFeeAmount(double value) {
        this.feeDetailFeeAmount = value;
    }

    /**
     * Party to whom fee is being disbursed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeDetailFeeRecipientCurrentNameText() {
        return feeDetailFeeRecipientCurrentNameText;
    }

    /**
     * Sets the value of the feeDetailFeeRecipientCurrentNameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeDetailFeeRecipientCurrentNameText(String value) {
        this.feeDetailFeeRecipientCurrentNameText = value;
    }

}
