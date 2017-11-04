//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CourtCaseHeader with optional Group Information - Currently awaits Tyler providing Group Information on with Case data.
 * 
 * <p>Java class for CourtCaseHeaderGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourtCaseHeaderGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CourtCaseHeaderType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherAgencyNumber" type="{}OtherAgencyNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Group" type="{}GroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtCaseHeaderGroupType", propOrder = {
    "otherAgencyNumber",
    "group"
})
public class CourtCaseHeaderGroupType
    extends CourtCaseHeaderType
{

    @XmlElement(name = "OtherAgencyNumber")
    protected List<OtherAgencyNumberType> otherAgencyNumber;
    @XmlElement(name = "Group")
    protected GroupType group;

    /**
     * Gets the value of the otherAgencyNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAgencyNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAgencyNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAgencyNumberType }
     * 
     * 
     */
    public List<OtherAgencyNumberType> getOtherAgencyNumber() {
        if (otherAgencyNumber == null) {
            otherAgencyNumber = new ArrayList<OtherAgencyNumberType>();
        }
        return this.otherAgencyNumber;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setGroup(GroupType value) {
        this.group = value;
    }

}