//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CaseCrossReferenceIdentifierTypeCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseCrossReferenceIdentifierTypeCodeTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.courts.state.mn.us/CourtXML/3>CaseCrossReferenceIdentifierType">
 *       &lt;attribute name="code" type="{http://www.courts.state.mn.us/CourtXML/3}CaseCrossReferenceIdentifierTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseCrossReferenceIdentifierTypeCodeTextType", propOrder = {
    "value"
})
public class CaseCrossReferenceIdentifierTypeCodeTextType {

    @XmlValue
    protected CaseCrossReferenceIdentifierType value;
    @XmlAttribute(name = "code")
    protected CaseCrossReferenceIdentifierTypeCodeType code;

    /**
     * 
     *                             Used to enumerate the other agency identifiers stored on MNCIS, e.g., prosecutor file number, ICR Number, appellate case numbers.
     *                                                         Makes use of attribute courtORIs to specify which courts apply to a given enumeration value.   Values without the courtORIs attribute apply
     *                                                         to all courts.
     *                       
     * 
     * @return
     *     possible object is
     *     {@link CaseCrossReferenceIdentifierType }
     *     
     */
    public CaseCrossReferenceIdentifierType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseCrossReferenceIdentifierType }
     *     
     */
    public void setValue(CaseCrossReferenceIdentifierType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CaseCrossReferenceIdentifierTypeCodeType }
     *     
     */
    public CaseCrossReferenceIdentifierTypeCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseCrossReferenceIdentifierTypeCodeType }
     *     
     */
    public void setCode(CaseCrossReferenceIdentifierTypeCodeType value) {
        this.code = value;
    }

}