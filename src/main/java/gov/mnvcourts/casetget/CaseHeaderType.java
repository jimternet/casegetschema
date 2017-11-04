//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import java.math.BigInteger;
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
 * <p>Java class for CaseHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CourtFileNumber"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CaseCountyNumber"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CaseLocationText" minOccurs="0"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}BaseCaseTypeText"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CaseCategoryText"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CaseTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CaseTypeText"/>
 *         &lt;element name="CaseSubTypeText" type="{http://www.courts.state.mn.us/CourtXML/3}CaseSubTypeCodeTextType" minOccurs="0"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CaseFiledDate"/>
 *         &lt;element name="CaseIsConfidential" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CaseIsSealed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CaseIsRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CaseStatus" maxOccurs="unbounded"/>
 *         &lt;element name="AllCountsDisposed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseHeaderType", propOrder = {
    "courtFileNumber",
    "caseCountyNumber",
    "caseLocationText",
    "baseCaseTypeText",
    "caseCategoryText",
    "caseTitle",
    "caseTypeText",
    "caseSubTypeText",
    "caseFiledDate",
    "caseIsConfidential",
    "caseIsSealed",
    "caseIsRestricted",
    "caseStatus",
    "allCountsDisposed"
})
@XmlSeeAlso({
    CourtCaseHeaderType.class
})
public class CaseHeaderType {

    @XmlElement(name = "CourtFileNumber", required = true)
    protected CourtFileNumberType courtFileNumber;
    @XmlElement(name = "CaseCountyNumber", required = true)
    protected BigInteger caseCountyNumber;
    @XmlElement(name = "CaseLocationText")
    protected CourtLocationCodeTextType caseLocationText;
    @XmlElement(name = "BaseCaseTypeText", required = true)
    protected BaseCaseTypeTextType baseCaseTypeText;
    @XmlElement(name = "CaseCategoryText", required = true)
    protected CaseCategoryCodeTextType caseCategoryText;
    @XmlElement(name = "CaseTitle")
    protected Object caseTitle;
    @XmlElement(name = "CaseTypeText", required = true)
    protected CaseTypeCodeTextType caseTypeText;
    @XmlElement(name = "CaseSubTypeText")
    protected CaseSubTypeCodeTextType caseSubTypeText;
    @XmlElement(name = "CaseFiledDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar caseFiledDate;
    @XmlElement(name = "CaseIsConfidential")
    protected boolean caseIsConfidential;
    @XmlElement(name = "CaseIsSealed")
    protected boolean caseIsSealed;
    @XmlElement(name = "CaseIsRestricted")
    protected Boolean caseIsRestricted;
    @XmlElement(name = "CaseStatus", required = true)
    protected List<CaseStatus> caseStatus;
    @XmlElement(name = "AllCountsDisposed")
    protected Boolean allCountsDisposed;

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
     * Gets the value of the caseCountyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseCountyNumber() {
        return caseCountyNumber;
    }

    /**
     * Sets the value of the caseCountyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseCountyNumber(BigInteger value) {
        this.caseCountyNumber = value;
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
     * Gets the value of the baseCaseTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link BaseCaseTypeTextType }
     *     
     */
    public BaseCaseTypeTextType getBaseCaseTypeText() {
        return baseCaseTypeText;
    }

    /**
     * Sets the value of the baseCaseTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCaseTypeTextType }
     *     
     */
    public void setBaseCaseTypeText(BaseCaseTypeTextType value) {
        this.baseCaseTypeText = value;
    }

    /**
     * Gets the value of the caseCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link CaseCategoryCodeTextType }
     *     
     */
    public CaseCategoryCodeTextType getCaseCategoryText() {
        return caseCategoryText;
    }

    /**
     * Sets the value of the caseCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseCategoryCodeTextType }
     *     
     */
    public void setCaseCategoryText(CaseCategoryCodeTextType value) {
        this.caseCategoryText = value;
    }

    /**
     * Gets the value of the caseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCaseTitle() {
        return caseTitle;
    }

    /**
     * Sets the value of the caseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCaseTitle(Object value) {
        this.caseTitle = value;
    }

    /**
     * Gets the value of the caseTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link CaseTypeCodeTextType }
     *     
     */
    public CaseTypeCodeTextType getCaseTypeText() {
        return caseTypeText;
    }

    /**
     * Sets the value of the caseTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseTypeCodeTextType }
     *     
     */
    public void setCaseTypeText(CaseTypeCodeTextType value) {
        this.caseTypeText = value;
    }

    /**
     * Gets the value of the caseSubTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link CaseSubTypeCodeTextType }
     *     
     */
    public CaseSubTypeCodeTextType getCaseSubTypeText() {
        return caseSubTypeText;
    }

    /**
     * Sets the value of the caseSubTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseSubTypeCodeTextType }
     *     
     */
    public void setCaseSubTypeText(CaseSubTypeCodeTextType value) {
        this.caseSubTypeText = value;
    }

    /**
     * Gets the value of the caseFiledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaseFiledDate() {
        return caseFiledDate;
    }

    /**
     * Sets the value of the caseFiledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaseFiledDate(XMLGregorianCalendar value) {
        this.caseFiledDate = value;
    }

    /**
     * Gets the value of the caseIsConfidential property.
     * 
     */
    public boolean isCaseIsConfidential() {
        return caseIsConfidential;
    }

    /**
     * Sets the value of the caseIsConfidential property.
     * 
     */
    public void setCaseIsConfidential(boolean value) {
        this.caseIsConfidential = value;
    }

    /**
     * Gets the value of the caseIsSealed property.
     * 
     */
    public boolean isCaseIsSealed() {
        return caseIsSealed;
    }

    /**
     * Sets the value of the caseIsSealed property.
     * 
     */
    public void setCaseIsSealed(boolean value) {
        this.caseIsSealed = value;
    }

    /**
     * Gets the value of the caseIsRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseIsRestricted() {
        return caseIsRestricted;
    }

    /**
     * Sets the value of the caseIsRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseIsRestricted(Boolean value) {
        this.caseIsRestricted = value;
    }

    /**
     * Gets the value of the caseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseStatus }
     * 
     * 
     */
    public List<CaseStatus> getCaseStatus() {
        if (caseStatus == null) {
            caseStatus = new ArrayList<CaseStatus>();
        }
        return this.caseStatus;
    }

    /**
     * Gets the value of the allCountsDisposed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllCountsDisposed() {
        return allCountsDisposed;
    }

    /**
     * Sets the value of the allCountsDisposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllCountsDisposed(Boolean value) {
        this.allCountsDisposed = value;
    }

}