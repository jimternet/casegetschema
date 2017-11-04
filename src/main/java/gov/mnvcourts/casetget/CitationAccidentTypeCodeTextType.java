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
 * <p>Java class for CitationAccidentTypeCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitationAccidentTypeCodeTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.courts.state.mn.us/CourtXML/3>CitationAccidentType">
 *       &lt;attribute name="code" type="{http://www.courts.state.mn.us/CourtXML/3}CitationAccidentTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitationAccidentTypeCodeTextType", propOrder = {
    "value"
})
public class CitationAccidentTypeCodeTextType {

    @XmlValue
    protected CitationAccidentType value;
    @XmlAttribute(name = "code")
    protected CitationAccidentTypeCodeType code;

    /**
     * Enumerates permissible values denoting accidents contained in citations
     * 
     * @return
     *     possible object is
     *     {@link CitationAccidentType }
     *     
     */
    public CitationAccidentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitationAccidentType }
     *     
     */
    public void setValue(CitationAccidentType value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CitationAccidentTypeCodeType }
     *     
     */
    public CitationAccidentTypeCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitationAccidentTypeCodeType }
     *     
     */
    public void setCode(CitationAccidentTypeCodeType value) {
        this.code = value;
    }

}
