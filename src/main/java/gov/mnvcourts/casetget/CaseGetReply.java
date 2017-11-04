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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.courts.state.mn.us/CourtXML/3}MessageDocumentType">
 *       &lt;sequence>
 *         &lt;element name="CaseRequest" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CourtFileNumber"/>
 *                     &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}WarrantNumber"/>
 *                     &lt;element name="ControlNumber">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;sequence>
 *                                 &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ReportingAgencyORI"/>
 *                                 &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ReportingAgencyControlNumber"/>
 *                               &lt;/sequence>
 *                               &lt;sequence>
 *                                 &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ArrestingAgencyORI"/>
 *                                 &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ArrestingAgencyControlNumber"/>
 *                               &lt;/sequence>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Citation">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CitationNumber"/>
 *                               &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}IssuingAgencyORI"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}OtherAgencyNumber"/>
 *                   &lt;/choice>
 *                   &lt;element name="CaseInformation" type="{http://www.courts.state.mn.us/CourtXML/3}CaseInformation" minOccurs="0"/>
 *                   &lt;element name="CaseNullResponses" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CourtXMLGlobalElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CaseRequestError" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="caseNumberKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="caseKey" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
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
@XmlType(name = "", propOrder = {
    "caseRequest"
})
@XmlRootElement(name = "CaseGetReply")
public class CaseGetReply
    extends MessageDocumentType
{

    @XmlElement(name = "CaseRequest", required = true)
    protected List<CaseGetReply.CaseRequest> caseRequest;

    /**
     * Gets the value of the caseRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseGetReply.CaseRequest }
     * 
     * 
     */
    public List<CaseGetReply.CaseRequest> getCaseRequest() {
        if (caseRequest == null) {
            caseRequest = new ArrayList<CaseGetReply.CaseRequest>();
        }
        return this.caseRequest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CourtFileNumber"/>
     *           &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}WarrantNumber"/>
     *           &lt;element name="ControlNumber">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;choice>
     *                     &lt;sequence>
     *                       &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ReportingAgencyORI"/>
     *                       &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ReportingAgencyControlNumber"/>
     *                     &lt;/sequence>
     *                     &lt;sequence>
     *                       &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ArrestingAgencyORI"/>
     *                       &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ArrestingAgencyControlNumber"/>
     *                     &lt;/sequence>
     *                   &lt;/choice>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Citation">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CitationNumber"/>
     *                     &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}IssuingAgencyORI"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}OtherAgencyNumber"/>
     *         &lt;/choice>
     *         &lt;element name="CaseInformation" type="{http://www.courts.state.mn.us/CourtXML/3}CaseInformation" minOccurs="0"/>
     *         &lt;element name="CaseNullResponses" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CourtXMLGlobalElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CaseRequestError" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="caseNumberKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="caseKey" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "courtFileNumber",
        "warrantNumber",
        "controlNumber",
        "citation",
        "otherAgencyNumber",
        "caseInformation",
        "caseNullResponses",
        "caseRequestError"
    })
    public static class CaseRequest {

        @XmlElement(name = "CourtFileNumber")
        protected CourtFileNumberType courtFileNumber;
        @XmlElement(name = "WarrantNumber")
        protected WarrantNumberType warrantNumber;
        @XmlElement(name = "ControlNumber")
        protected CaseGetReply.CaseRequest.ControlNumber controlNumber;
        @XmlElement(name = "Citation")
        protected CaseGetReply.CaseRequest.Citation citation;
        @XmlElement(name = "OtherAgencyNumber")
        protected OtherAgencyNumberType otherAgencyNumber;
        @XmlElement(name = "CaseInformation")
        protected CaseInformation caseInformation;
        @XmlElement(name = "CaseNullResponses")
        protected CaseGetReply.CaseRequest.CaseNullResponses caseNullResponses;
        @XmlElement(name = "CaseRequestError")
        protected List<CaseGetReply.CaseRequest.CaseRequestError> caseRequestError;
        @XmlAttribute(name = "caseNumberKey", required = true)
        protected String caseNumberKey;
        @XmlAttribute(name = "caseKey")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger caseKey;

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
         * Gets the value of the warrantNumber property.
         * 
         * @return
         *     possible object is
         *     {@link WarrantNumberType }
         *     
         */
        public WarrantNumberType getWarrantNumber() {
            return warrantNumber;
        }

        /**
         * Sets the value of the warrantNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link WarrantNumberType }
         *     
         */
        public void setWarrantNumber(WarrantNumberType value) {
            this.warrantNumber = value;
        }

        /**
         * Gets the value of the controlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link CaseGetReply.CaseRequest.ControlNumber }
         *     
         */
        public CaseGetReply.CaseRequest.ControlNumber getControlNumber() {
            return controlNumber;
        }

        /**
         * Sets the value of the controlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link CaseGetReply.CaseRequest.ControlNumber }
         *     
         */
        public void setControlNumber(CaseGetReply.CaseRequest.ControlNumber value) {
            this.controlNumber = value;
        }

        /**
         * Gets the value of the citation property.
         * 
         * @return
         *     possible object is
         *     {@link CaseGetReply.CaseRequest.Citation }
         *     
         */
        public CaseGetReply.CaseRequest.Citation getCitation() {
            return citation;
        }

        /**
         * Sets the value of the citation property.
         * 
         * @param value
         *     allowed object is
         *     {@link CaseGetReply.CaseRequest.Citation }
         *     
         */
        public void setCitation(CaseGetReply.CaseRequest.Citation value) {
            this.citation = value;
        }

        /**
         * Gets the value of the otherAgencyNumber property.
         * 
         * @return
         *     possible object is
         *     {@link OtherAgencyNumberType }
         *     
         */
        public OtherAgencyNumberType getOtherAgencyNumber() {
            return otherAgencyNumber;
        }

        /**
         * Sets the value of the otherAgencyNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherAgencyNumberType }
         *     
         */
        public void setOtherAgencyNumber(OtherAgencyNumberType value) {
            this.otherAgencyNumber = value;
        }

        /**
         * Gets the value of the caseInformation property.
         * 
         * @return
         *     possible object is
         *     {@link CaseInformation }
         *     
         */
        public CaseInformation getCaseInformation() {
            return caseInformation;
        }

        /**
         * Sets the value of the caseInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link CaseInformation }
         *     
         */
        public void setCaseInformation(CaseInformation value) {
            this.caseInformation = value;
        }

        /**
         * Gets the value of the caseNullResponses property.
         * 
         * @return
         *     possible object is
         *     {@link CaseGetReply.CaseRequest.CaseNullResponses }
         *     
         */
        public CaseGetReply.CaseRequest.CaseNullResponses getCaseNullResponses() {
            return caseNullResponses;
        }

        /**
         * Sets the value of the caseNullResponses property.
         * 
         * @param value
         *     allowed object is
         *     {@link CaseGetReply.CaseRequest.CaseNullResponses }
         *     
         */
        public void setCaseNullResponses(CaseGetReply.CaseRequest.CaseNullResponses value) {
            this.caseNullResponses = value;
        }

        /**
         * Gets the value of the caseRequestError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the caseRequestError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCaseRequestError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CaseGetReply.CaseRequest.CaseRequestError }
         * 
         * 
         */
        public List<CaseGetReply.CaseRequest.CaseRequestError> getCaseRequestError() {
            if (caseRequestError == null) {
                caseRequestError = new ArrayList<CaseGetReply.CaseRequest.CaseRequestError>();
            }
            return this.caseRequestError;
        }

        /**
         * Gets the value of the caseNumberKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaseNumberKey() {
            return caseNumberKey;
        }

        /**
         * Sets the value of the caseNumberKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaseNumberKey(String value) {
            this.caseNumberKey = value;
        }

        /**
         * Gets the value of the caseKey property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCaseKey() {
            return caseKey;
        }

        /**
         * Sets the value of the caseKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCaseKey(BigInteger value) {
            this.caseKey = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CourtXMLGlobalElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "courtXMLGlobalElement"
        })
        public static class CaseNullResponses {

            @XmlElement(name = "CourtXMLGlobalElement", required = true)
            protected List<String> courtXMLGlobalElement;

            /**
             * Gets the value of the courtXMLGlobalElement property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the courtXMLGlobalElement property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCourtXMLGlobalElement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCourtXMLGlobalElement() {
                if (courtXMLGlobalElement == null) {
                    courtXMLGlobalElement = new ArrayList<String>();
                }
                return this.courtXMLGlobalElement;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class CaseRequestError {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code")
            protected Integer code;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCode(Integer value) {
                this.code = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}CitationNumber"/>
         *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}IssuingAgencyORI"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "citationNumber",
            "issuingAgencyORI"
        })
        public static class Citation {

            @XmlElement(name = "CitationNumber", required = true)
            protected CitationNumberType citationNumber;
            @XmlElement(name = "IssuingAgencyORI", required = true)
            protected IssuingAgencyORIType issuingAgencyORI;

            /**
             * Gets the value of the citationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link CitationNumberType }
             *     
             */
            public CitationNumberType getCitationNumber() {
                return citationNumber;
            }

            /**
             * Sets the value of the citationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link CitationNumberType }
             *     
             */
            public void setCitationNumber(CitationNumberType value) {
                this.citationNumber = value;
            }

            /**
             * Gets the value of the issuingAgencyORI property.
             * 
             * @return
             *     possible object is
             *     {@link IssuingAgencyORIType }
             *     
             */
            public IssuingAgencyORIType getIssuingAgencyORI() {
                return issuingAgencyORI;
            }

            /**
             * Sets the value of the issuingAgencyORI property.
             * 
             * @param value
             *     allowed object is
             *     {@link IssuingAgencyORIType }
             *     
             */
            public void setIssuingAgencyORI(IssuingAgencyORIType value) {
                this.issuingAgencyORI = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;sequence>
         *           &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ReportingAgencyORI"/>
         *           &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ReportingAgencyControlNumber"/>
         *         &lt;/sequence>
         *         &lt;sequence>
         *           &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ArrestingAgencyORI"/>
         *           &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}ArrestingAgencyControlNumber"/>
         *         &lt;/sequence>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reportingAgencyORI",
            "reportingAgencyControlNumber",
            "arrestingAgencyORI",
            "arrestingAgencyControlNumber"
        })
        public static class ControlNumber {

            @XmlElement(name = "ReportingAgencyORI")
            protected ReportingAgencyCodeType reportingAgencyORI;
            @XmlElement(name = "ReportingAgencyControlNumber")
            protected ControlNumberType reportingAgencyControlNumber;
            @XmlElement(name = "ArrestingAgencyORI")
            protected ArrestingAgencyCodeType arrestingAgencyORI;
            @XmlElement(name = "ArrestingAgencyControlNumber")
            protected ControlNumberType arrestingAgencyControlNumber;

            /**
             * Gets the value of the reportingAgencyORI property.
             * 
             * @return
             *     possible object is
             *     {@link ReportingAgencyCodeType }
             *     
             */
            public ReportingAgencyCodeType getReportingAgencyORI() {
                return reportingAgencyORI;
            }

            /**
             * Sets the value of the reportingAgencyORI property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportingAgencyCodeType }
             *     
             */
            public void setReportingAgencyORI(ReportingAgencyCodeType value) {
                this.reportingAgencyORI = value;
            }

            /**
             * Gets the value of the reportingAgencyControlNumber property.
             * 
             * @return
             *     possible object is
             *     {@link ControlNumberType }
             *     
             */
            public ControlNumberType getReportingAgencyControlNumber() {
                return reportingAgencyControlNumber;
            }

            /**
             * Sets the value of the reportingAgencyControlNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link ControlNumberType }
             *     
             */
            public void setReportingAgencyControlNumber(ControlNumberType value) {
                this.reportingAgencyControlNumber = value;
            }

            /**
             * Gets the value of the arrestingAgencyORI property.
             * 
             * @return
             *     possible object is
             *     {@link ArrestingAgencyCodeType }
             *     
             */
            public ArrestingAgencyCodeType getArrestingAgencyORI() {
                return arrestingAgencyORI;
            }

            /**
             * Sets the value of the arrestingAgencyORI property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrestingAgencyCodeType }
             *     
             */
            public void setArrestingAgencyORI(ArrestingAgencyCodeType value) {
                this.arrestingAgencyORI = value;
            }

            /**
             * Gets the value of the arrestingAgencyControlNumber property.
             * 
             * @return
             *     possible object is
             *     {@link ControlNumberType }
             *     
             */
            public ControlNumberType getArrestingAgencyControlNumber() {
                return arrestingAgencyControlNumber;
            }

            /**
             * Sets the value of the arrestingAgencyControlNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link ControlNumberType }
             *     
             */
            public void setArrestingAgencyControlNumber(ControlNumberType value) {
                this.arrestingAgencyControlNumber = value;
            }

        }

    }

}
