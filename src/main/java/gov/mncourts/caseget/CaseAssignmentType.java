//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CaseAssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseAssignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CourtFileNumber"/&gt;
 *         &lt;element ref="{}CaseLocationText"/&gt;
 *         &lt;element name="AssignedDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="AssignedJudge" type="{}JudicialOfficialType" minOccurs="0"/&gt;
 *         &lt;element name="ReassignmentReason" type="{}ReassignmentReasonCodeTextType" minOccurs="0"/&gt;
 *         &lt;element name="ReassignedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ReassignmentComment" type="{}CommentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="currentAssignmentIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseAssignmentType", propOrder = {
    "courtFileNumber",
    "caseLocationText",
    "assignedDate",
    "assignedJudge",
    "reassignmentReason",
    "reassignedDate",
    "reassignmentComment"
})
public class CaseAssignmentType {

    @XmlElement(name = "CourtFileNumber", required = true)
    protected CourtFileNumberType courtFileNumber;
    @XmlElement(name = "CaseLocationText", required = true)
    protected CourtLocationCodeTextType caseLocationText;
    @XmlElement(name = "AssignedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignedDate;
    @XmlElement(name = "AssignedJudge")
    protected JudicialOfficialType assignedJudge;
    @XmlElement(name = "ReassignmentReason")
    protected ReassignmentReasonCodeTextType reassignmentReason;
    @XmlElement(name = "ReassignedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reassignedDate;
    @XmlElement(name = "ReassignmentComment")
    protected String reassignmentComment;
    @XmlAttribute(name = "currentAssignmentIndicator", required = true)
    protected boolean currentAssignmentIndicator;

    /**
     * Gets the value of the courtFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CourtFileNumberType }
     *     
     */
    public CourtFileNumberType getCourtFileNumber() {
        return courtFileNumber;
    }

    /**
     * Sets the value of the courtFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtFileNumberType }
     *     
     */
    public void setCourtFileNumber(CourtFileNumberType value) {
        this.courtFileNumber = value;
    }

    /**
     * Gets the value of the caseLocationText property.
     * 
     * @return
     *     possible object is
     *     {@link CourtLocationCodeTextType }
     *     
     */
    public CourtLocationCodeTextType getCaseLocationText() {
        return caseLocationText;
    }

    /**
     * Sets the value of the caseLocationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtLocationCodeTextType }
     *     
     */
    public void setCaseLocationText(CourtLocationCodeTextType value) {
        this.caseLocationText = value;
    }

    /**
     * Gets the value of the assignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedDate() {
        return assignedDate;
    }

    /**
     * Sets the value of the assignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedDate(XMLGregorianCalendar value) {
        this.assignedDate = value;
    }

    /**
     * Gets the value of the assignedJudge property.
     * 
     * @return
     *     possible object is
     *     {@link JudicialOfficialType }
     *     
     */
    public JudicialOfficialType getAssignedJudge() {
        return assignedJudge;
    }

    /**
     * Sets the value of the assignedJudge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudicialOfficialType }
     *     
     */
    public void setAssignedJudge(JudicialOfficialType value) {
        this.assignedJudge = value;
    }

    /**
     * Gets the value of the reassignmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReassignmentReasonCodeTextType }
     *     
     */
    public ReassignmentReasonCodeTextType getReassignmentReason() {
        return reassignmentReason;
    }

    /**
     * Sets the value of the reassignmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReassignmentReasonCodeTextType }
     *     
     */
    public void setReassignmentReason(ReassignmentReasonCodeTextType value) {
        this.reassignmentReason = value;
    }

    /**
     * Gets the value of the reassignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReassignedDate() {
        return reassignedDate;
    }

    /**
     * Sets the value of the reassignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReassignedDate(XMLGregorianCalendar value) {
        this.reassignedDate = value;
    }

    /**
     * Gets the value of the reassignmentComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReassignmentComment() {
        return reassignmentComment;
    }

    /**
     * Sets the value of the reassignmentComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReassignmentComment(String value) {
        this.reassignmentComment = value;
    }

    /**
     * Gets the value of the currentAssignmentIndicator property.
     * 
     */
    public boolean isCurrentAssignmentIndicator() {
        return currentAssignmentIndicator;
    }

    /**
     * Sets the value of the currentAssignmentIndicator property.
     * 
     */
    public void setCurrentAssignmentIndicator(boolean value) {
        this.currentAssignmentIndicator = value;
    }

}
