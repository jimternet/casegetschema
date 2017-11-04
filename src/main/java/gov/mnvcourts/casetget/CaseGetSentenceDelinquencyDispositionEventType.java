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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Adult Sentencing or Juvenile Disposition Hearing
 * 
 * <p>Java class for CaseGetSentenceDelinquencyDispositionEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseGetSentenceDelinquencyDispositionEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}PronouncedDate"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}SentenceEventText"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}PronouncingJudge" minOccurs="0"/>
 *         &lt;element name="AmendedReasonText" type="{http://www.courts.state.mn.us/CourtXML/3}AmendmentReasonSentenceTypeCodeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseGetSentenceDelinquencyDispositionEventType", propOrder = {
    "pronouncedDate",
    "sentenceEventText",
    "pronouncingJudge",
    "amendedReasonText"
})
@XmlSeeAlso({
    CaseGetSentenceAdjudicationType.class,
    CaseGetSentenceDispositionType.class
})
public class CaseGetSentenceDelinquencyDispositionEventType {

    @XmlElement(name = "PronouncedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pronouncedDate;
    @XmlElement(name = "SentenceEventText", required = true)
    protected SentenceEventTypeCodeTextType sentenceEventText;
    @XmlElement(name = "PronouncingJudge")
    protected JudicialOfficialType pronouncingJudge;
    @XmlElement(name = "AmendedReasonText")
    protected List<AmendmentReasonSentenceTypeCodeTextType> amendedReasonText;

    /**
     * Gets the value of the pronouncedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPronouncedDate() {
        return pronouncedDate;
    }

    /**
     * Sets the value of the pronouncedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPronouncedDate(XMLGregorianCalendar value) {
        this.pronouncedDate = value;
    }

    /**
     * Gets the value of the sentenceEventText property.
     * 
     * @return
     *     possible object is
     *     {@link SentenceEventTypeCodeTextType }
     *     
     */
    public SentenceEventTypeCodeTextType getSentenceEventText() {
        return sentenceEventText;
    }

    /**
     * Sets the value of the sentenceEventText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SentenceEventTypeCodeTextType }
     *     
     */
    public void setSentenceEventText(SentenceEventTypeCodeTextType value) {
        this.sentenceEventText = value;
    }

    /**
     * Gets the value of the pronouncingJudge property.
     * 
     * @return
     *     possible object is
     *     {@link JudicialOfficialType }
     *     
     */
    public JudicialOfficialType getPronouncingJudge() {
        return pronouncingJudge;
    }

    /**
     * Sets the value of the pronouncingJudge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudicialOfficialType }
     *     
     */
    public void setPronouncingJudge(JudicialOfficialType value) {
        this.pronouncingJudge = value;
    }

    /**
     * Gets the value of the amendedReasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amendedReasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendedReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmendmentReasonSentenceTypeCodeTextType }
     * 
     * 
     */
    public List<AmendmentReasonSentenceTypeCodeTextType> getAmendedReasonText() {
        if (amendedReasonText == null) {
            amendedReasonText = new ArrayList<AmendmentReasonSentenceTypeCodeTextType>();
        }
        return this.amendedReasonText;
    }

}