//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JuvenileInterimPlacementOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JuvenileInterimPlacementOrderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}OrderEventType">
 *       &lt;sequence>
 *         &lt;element name="Placement" type="{http://www.courts.state.mn.us/CourtXML/3}JuvenilePlacementType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JuvenileInterimPlacementOrderType", propOrder = {
    "placement"
})
public class JuvenileInterimPlacementOrderType
    extends OrderEventType
{

    @XmlElement(name = "Placement", required = true)
    protected JuvenilePlacementType placement;

    /**
     * Gets the value of the placement property.
     * 
     * @return
     *     possible object is
     *     {@link JuvenilePlacementType }
     *     
     */
    public JuvenilePlacementType getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuvenilePlacementType }
     *     
     */
    public void setPlacement(JuvenilePlacementType value) {
        this.placement = value;
    }

}