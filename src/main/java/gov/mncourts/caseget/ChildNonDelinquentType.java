//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChildNonDelinquentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildNonDelinquentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PartyDetailType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="ChildAssignedIDDetails" type="{}ChildAssignedIDDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="ChildPhysicalDetails" type="{}ChildPhysicalDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="RepresentedBy" type="{}RepresentedByType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildNonDelinquentType", propOrder = {
    "childAssignedIDDetails",
    "childPhysicalDetails",
    "representedBy"
})
public class ChildNonDelinquentType
    extends PartyDetailType
{

    @XmlElement(name = "ChildAssignedIDDetails")
    protected ChildAssignedIDDetailsType childAssignedIDDetails;
    @XmlElement(name = "ChildPhysicalDetails")
    protected ChildPhysicalDetailsType childPhysicalDetails;
    @XmlElement(name = "RepresentedBy")
    protected RepresentedByType representedBy;

    /**
     * Gets the value of the childAssignedIDDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ChildAssignedIDDetailsType }
     *     
     */
    public ChildAssignedIDDetailsType getChildAssignedIDDetails() {
        return childAssignedIDDetails;
    }

    /**
     * Sets the value of the childAssignedIDDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildAssignedIDDetailsType }
     *     
     */
    public void setChildAssignedIDDetails(ChildAssignedIDDetailsType value) {
        this.childAssignedIDDetails = value;
    }

    /**
     * Gets the value of the childPhysicalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ChildPhysicalDetailsType }
     *     
     */
    public ChildPhysicalDetailsType getChildPhysicalDetails() {
        return childPhysicalDetails;
    }

    /**
     * Sets the value of the childPhysicalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildPhysicalDetailsType }
     *     
     */
    public void setChildPhysicalDetails(ChildPhysicalDetailsType value) {
        this.childPhysicalDetails = value;
    }

    /**
     * Gets the value of the representedBy property.
     * 
     * @return
     *     possible object is
     *     {@link RepresentedByType }
     *     
     */
    public RepresentedByType getRepresentedBy() {
        return representedBy;
    }

    /**
     * Sets the value of the representedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentedByType }
     *     
     */
    public void setRepresentedBy(RepresentedByType value) {
        this.representedBy = value;
    }

}
