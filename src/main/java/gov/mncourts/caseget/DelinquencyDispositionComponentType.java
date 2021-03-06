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
 * <p>Java class for DelinquencyDispositionComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelinquencyDispositionComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}DispositionComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DispositionConditionSet" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DispositionConditionElement" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}DispositionConditionElementType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RelatedParty" type="{}RelatedPartyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelinquencyDispositionComponentType", propOrder = {
    "dispositionConditionSet"
})
public class DelinquencyDispositionComponentType
    extends DispositionComponentType
{

    @XmlElement(name = "DispositionConditionSet")
    protected List<DelinquencyDispositionComponentType.DispositionConditionSet> dispositionConditionSet;

    /**
     * Gets the value of the dispositionConditionSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispositionConditionSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispositionConditionSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelinquencyDispositionComponentType.DispositionConditionSet }
     * 
     * 
     */
    public List<DelinquencyDispositionComponentType.DispositionConditionSet> getDispositionConditionSet() {
        if (dispositionConditionSet == null) {
            dispositionConditionSet = new ArrayList<DelinquencyDispositionComponentType.DispositionConditionSet>();
        }
        return this.dispositionConditionSet;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DispositionConditionElement" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}DispositionConditionElementType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RelatedParty" type="{}RelatedPartyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dispositionConditionElement",
        "relatedParty"
    })
    public static class DispositionConditionSet {

        @XmlElement(name = "DispositionConditionElement", required = true)
        protected List<DelinquencyDispositionComponentType.DispositionConditionSet.DispositionConditionElement> dispositionConditionElement;
        @XmlElement(name = "RelatedParty")
        protected List<RelatedPartyType> relatedParty;

        /**
         * Gets the value of the dispositionConditionElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dispositionConditionElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDispositionConditionElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DelinquencyDispositionComponentType.DispositionConditionSet.DispositionConditionElement }
         * 
         * 
         */
        public List<DelinquencyDispositionComponentType.DispositionConditionSet.DispositionConditionElement> getDispositionConditionElement() {
            if (dispositionConditionElement == null) {
                dispositionConditionElement = new ArrayList<DelinquencyDispositionComponentType.DispositionConditionSet.DispositionConditionElement>();
            }
            return this.dispositionConditionElement;
        }

        /**
         * Gets the value of the relatedParty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedParty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedPartyType }
         * 
         * 
         */
        public List<RelatedPartyType> getRelatedParty() {
            if (relatedParty == null) {
                relatedParty = new ArrayList<RelatedPartyType>();
            }
            return this.relatedParty;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}DispositionConditionElementType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DispositionConditionElement
            extends DispositionConditionElementType
        {


        }

    }

}
