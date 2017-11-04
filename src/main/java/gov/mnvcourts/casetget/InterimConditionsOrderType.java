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
 * <p>Java class for InterimConditionsOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterimConditionsOrderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}OrderEventType">
 *       &lt;sequence>
 *         &lt;element name="OrderCommentText" type="{http://www.courts.state.mn.us/CourtXML/3}CommentType" minOccurs="0"/>
 *         &lt;element name="ConditionSubject" type="{http://www.courts.state.mn.us/CourtXML/3}ConditionSubjectType"/>
 *         &lt;element name="InterimCondition" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}ConditionMoneyType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterimConditionsOrderType", propOrder = {
    "orderCommentText",
    "conditionSubject",
    "interimCondition"
})
public class InterimConditionsOrderType
    extends OrderEventType
{

    @XmlElement(name = "OrderCommentText")
    protected String orderCommentText;
    @XmlElement(name = "ConditionSubject", required = true)
    protected ConditionSubjectType conditionSubject;
    @XmlElement(name = "InterimCondition", required = true)
    protected List<InterimConditionsOrderType.InterimCondition> interimCondition;

    /**
     * Gets the value of the orderCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCommentText() {
        return orderCommentText;
    }

    /**
     * Sets the value of the orderCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCommentText(String value) {
        this.orderCommentText = value;
    }

    /**
     * Gets the value of the conditionSubject property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionSubjectType }
     *     
     */
    public ConditionSubjectType getConditionSubject() {
        return conditionSubject;
    }

    /**
     * Sets the value of the conditionSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionSubjectType }
     *     
     */
    public void setConditionSubject(ConditionSubjectType value) {
        this.conditionSubject = value;
    }

    /**
     * Gets the value of the interimCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interimCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterimCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterimConditionsOrderType.InterimCondition }
     * 
     * 
     */
    public List<InterimConditionsOrderType.InterimCondition> getInterimCondition() {
        if (interimCondition == null) {
            interimCondition = new ArrayList<InterimConditionsOrderType.InterimCondition>();
        }
        return this.interimCondition;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}ConditionMoneyType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InterimCondition
        extends ConditionMoneyType
    {


    }

}
