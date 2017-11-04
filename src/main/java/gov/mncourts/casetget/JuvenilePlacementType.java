//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:31:16 PM CDT 
//


package gov.mncourts.casetget;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JuvenilePlacementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JuvenilePlacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlacementSubject">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ChildReference">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ChildDelinquent" type="{http://www.courts.state.mn.us/CourtXML/3}ChildDelinquentType"/>
 *                   &lt;element name="ChildNonDelinquent" type="{http://www.courts.state.mn.us/CourtXML/3}ChildNonDelinquentType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PlacementTypeText" type="{http://www.courts.state.mn.us/CourtXML/3}PlacementTypeCodeTextType"/>
 *         &lt;element name="PlacementStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PlacementEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StayOfPlacement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="IndeterminateStayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="DurationOfStay" type="{http://www.courts.state.mn.us/CourtXML/3}DurationOfStayType"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="stayForYears" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="stayForMonths" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="stayForDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PlacementStatus" type="{http://www.courts.state.mn.us/CourtXML/3}StatusType" minOccurs="0"/>
 *         &lt;element name="PlacementLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AgencyText" type="{http://www.courts.state.mn.us/CourtXML/3}JuvenilePlacementAgencyTypeCodeTextType"/>
 *                   &lt;element name="PlacementParty">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="PartyDetail" type="{http://www.courts.state.mn.us/CourtXML/3}PartyNameAddressPhoneEmailType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LocationText">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PlacementComment" type="{http://www.courts.state.mn.us/CourtXML/3}CommentType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="placementKey" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JuvenilePlacementType", propOrder = {
    "placementSubject",
    "placementTypeText",
    "placementStartDate",
    "placementEndDate",
    "stayOfPlacement",
    "placementStatus",
    "placementLocation",
    "placementComment"
})
public class JuvenilePlacementType {

    @XmlElement(name = "PlacementSubject", required = true)
    protected JuvenilePlacementType.PlacementSubject placementSubject;
    @XmlElement(name = "PlacementTypeText", required = true)
    protected PlacementTypeCodeTextType placementTypeText;
    @XmlElement(name = "PlacementStartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar placementStartDate;
    @XmlElement(name = "PlacementEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar placementEndDate;
    @XmlElement(name = "StayOfPlacement")
    protected JuvenilePlacementType.StayOfPlacement stayOfPlacement;
    @XmlElement(name = "PlacementStatus")
    protected StatusType placementStatus;
    @XmlElement(name = "PlacementLocation")
    protected JuvenilePlacementType.PlacementLocation placementLocation;
    @XmlElement(name = "PlacementComment")
    protected String placementComment;
    @XmlAttribute(name = "placementKey")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger placementKey;

    /**
     * Gets the value of the placementSubject property.
     * 
     * @return
     *     possible object is
     *     {@link JuvenilePlacementType.PlacementSubject }
     *     
     */
    public JuvenilePlacementType.PlacementSubject getPlacementSubject() {
        return placementSubject;
    }

    /**
     * Sets the value of the placementSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuvenilePlacementType.PlacementSubject }
     *     
     */
    public void setPlacementSubject(JuvenilePlacementType.PlacementSubject value) {
        this.placementSubject = value;
    }

    /**
     * Gets the value of the placementTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementTypeCodeTextType }
     *     
     */
    public PlacementTypeCodeTextType getPlacementTypeText() {
        return placementTypeText;
    }

    /**
     * Sets the value of the placementTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementTypeCodeTextType }
     *     
     */
    public void setPlacementTypeText(PlacementTypeCodeTextType value) {
        this.placementTypeText = value;
    }

    /**
     * Gets the value of the placementStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacementStartDate() {
        return placementStartDate;
    }

    /**
     * Sets the value of the placementStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlacementStartDate(XMLGregorianCalendar value) {
        this.placementStartDate = value;
    }

    /**
     * Gets the value of the placementEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacementEndDate() {
        return placementEndDate;
    }

    /**
     * Sets the value of the placementEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlacementEndDate(XMLGregorianCalendar value) {
        this.placementEndDate = value;
    }

    /**
     * Gets the value of the stayOfPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link JuvenilePlacementType.StayOfPlacement }
     *     
     */
    public JuvenilePlacementType.StayOfPlacement getStayOfPlacement() {
        return stayOfPlacement;
    }

    /**
     * Sets the value of the stayOfPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuvenilePlacementType.StayOfPlacement }
     *     
     */
    public void setStayOfPlacement(JuvenilePlacementType.StayOfPlacement value) {
        this.stayOfPlacement = value;
    }

    /**
     * Gets the value of the placementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getPlacementStatus() {
        return placementStatus;
    }

    /**
     * Sets the value of the placementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setPlacementStatus(StatusType value) {
        this.placementStatus = value;
    }

    /**
     * Gets the value of the placementLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JuvenilePlacementType.PlacementLocation }
     *     
     */
    public JuvenilePlacementType.PlacementLocation getPlacementLocation() {
        return placementLocation;
    }

    /**
     * Sets the value of the placementLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuvenilePlacementType.PlacementLocation }
     *     
     */
    public void setPlacementLocation(JuvenilePlacementType.PlacementLocation value) {
        this.placementLocation = value;
    }

    /**
     * Gets the value of the placementComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementComment() {
        return placementComment;
    }

    /**
     * Sets the value of the placementComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementComment(String value) {
        this.placementComment = value;
    }

    /**
     * Gets the value of the placementKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlacementKey() {
        return placementKey;
    }

    /**
     * Sets the value of the placementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlacementKey(BigInteger value) {
        this.placementKey = value;
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
     *         &lt;element name="AgencyText" type="{http://www.courts.state.mn.us/CourtXML/3}JuvenilePlacementAgencyTypeCodeTextType"/>
     *         &lt;element name="PlacementParty">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="PartyDetail" type="{http://www.courts.state.mn.us/CourtXML/3}PartyNameAddressPhoneEmailType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LocationText">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "agencyText",
        "placementParty",
        "locationText"
    })
    public static class PlacementLocation {

        @XmlElement(name = "AgencyText")
        protected JuvenilePlacementAgencyTypeCodeTextType agencyText;
        @XmlElement(name = "PlacementParty")
        protected JuvenilePlacementType.PlacementLocation.PlacementParty placementParty;
        @XmlElement(name = "LocationText")
        protected String locationText;

        /**
         * Gets the value of the agencyText property.
         * 
         * @return
         *     possible object is
         *     {@link JuvenilePlacementAgencyTypeCodeTextType }
         *     
         */
        public JuvenilePlacementAgencyTypeCodeTextType getAgencyText() {
            return agencyText;
        }

        /**
         * Sets the value of the agencyText property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuvenilePlacementAgencyTypeCodeTextType }
         *     
         */
        public void setAgencyText(JuvenilePlacementAgencyTypeCodeTextType value) {
            this.agencyText = value;
        }

        /**
         * Gets the value of the placementParty property.
         * 
         * @return
         *     possible object is
         *     {@link JuvenilePlacementType.PlacementLocation.PlacementParty }
         *     
         */
        public JuvenilePlacementType.PlacementLocation.PlacementParty getPlacementParty() {
            return placementParty;
        }

        /**
         * Sets the value of the placementParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuvenilePlacementType.PlacementLocation.PlacementParty }
         *     
         */
        public void setPlacementParty(JuvenilePlacementType.PlacementLocation.PlacementParty value) {
            this.placementParty = value;
        }

        /**
         * Gets the value of the locationText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationText() {
            return locationText;
        }

        /**
         * Sets the value of the locationText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationText(String value) {
            this.locationText = value;
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="PartyDetail" type="{http://www.courts.state.mn.us/CourtXML/3}PartyNameAddressPhoneEmailType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "partyDetail"
        })
        public static class PlacementParty {

            @XmlElement(name = "PartyDetail")
            protected PartyNameAddressPhoneEmailType partyDetail;
            @XmlAttribute(name = "partyKey", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger partyKey;

            /**
             * Gets the value of the partyDetail property.
             * 
             * @return
             *     possible object is
             *     {@link PartyNameAddressPhoneEmailType }
             *     
             */
            public PartyNameAddressPhoneEmailType getPartyDetail() {
                return partyDetail;
            }

            /**
             * Sets the value of the partyDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link PartyNameAddressPhoneEmailType }
             *     
             */
            public void setPartyDetail(PartyNameAddressPhoneEmailType value) {
                this.partyDetail = value;
            }

            /**
             * Gets the value of the partyKey property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPartyKey() {
                return partyKey;
            }

            /**
             * Sets the value of the partyKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPartyKey(BigInteger value) {
                this.partyKey = value;
            }

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
     *         &lt;element name="ChildReference">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ChildDelinquent" type="{http://www.courts.state.mn.us/CourtXML/3}ChildDelinquentType"/>
     *         &lt;element name="ChildNonDelinquent" type="{http://www.courts.state.mn.us/CourtXML/3}ChildNonDelinquentType"/>
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
        "childReference",
        "childDelinquent",
        "childNonDelinquent"
    })
    public static class PlacementSubject {

        @XmlElement(name = "ChildReference")
        protected JuvenilePlacementType.PlacementSubject.ChildReference childReference;
        @XmlElement(name = "ChildDelinquent")
        protected ChildDelinquentType childDelinquent;
        @XmlElement(name = "ChildNonDelinquent")
        protected ChildNonDelinquentType childNonDelinquent;

        /**
         * Gets the value of the childReference property.
         * 
         * @return
         *     possible object is
         *     {@link JuvenilePlacementType.PlacementSubject.ChildReference }
         *     
         */
        public JuvenilePlacementType.PlacementSubject.ChildReference getChildReference() {
            return childReference;
        }

        /**
         * Sets the value of the childReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuvenilePlacementType.PlacementSubject.ChildReference }
         *     
         */
        public void setChildReference(JuvenilePlacementType.PlacementSubject.ChildReference value) {
            this.childReference = value;
        }

        /**
         * Gets the value of the childDelinquent property.
         * 
         * @return
         *     possible object is
         *     {@link ChildDelinquentType }
         *     
         */
        public ChildDelinquentType getChildDelinquent() {
            return childDelinquent;
        }

        /**
         * Sets the value of the childDelinquent property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChildDelinquentType }
         *     
         */
        public void setChildDelinquent(ChildDelinquentType value) {
            this.childDelinquent = value;
        }

        /**
         * Gets the value of the childNonDelinquent property.
         * 
         * @return
         *     possible object is
         *     {@link ChildNonDelinquentType }
         *     
         */
        public ChildNonDelinquentType getChildNonDelinquent() {
            return childNonDelinquent;
        }

        /**
         * Sets the value of the childNonDelinquent property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChildNonDelinquentType }
         *     
         */
        public void setChildNonDelinquent(ChildNonDelinquentType value) {
            this.childNonDelinquent = value;
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
         *       &lt;attribute name="partyKey" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ChildReference {

            @XmlAttribute(name = "partyKey", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger partyKey;

            /**
             * Gets the value of the partyKey property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPartyKey() {
                return partyKey;
            }

            /**
             * Sets the value of the partyKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPartyKey(BigInteger value) {
                this.partyKey = value;
            }

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
     *         &lt;element name="IndeterminateStayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="DurationOfStay" type="{http://www.courts.state.mn.us/CourtXML/3}DurationOfStayType"/>
     *       &lt;/choice>
     *       &lt;attribute name="stayForYears" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="stayForMonths" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="stayForDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "indeterminateStayIndicator",
        "durationOfStay"
    })
    public static class StayOfPlacement {

        @XmlElement(name = "IndeterminateStayIndicator")
        protected Boolean indeterminateStayIndicator;
        @XmlElement(name = "DurationOfStay")
        protected DurationOfStayType durationOfStay;
        @XmlAttribute(name = "stayForYears")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger stayForYears;
        @XmlAttribute(name = "stayForMonths")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger stayForMonths;
        @XmlAttribute(name = "stayForDays")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger stayForDays;

        /**
         * Gets the value of the indeterminateStayIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIndeterminateStayIndicator() {
            return indeterminateStayIndicator;
        }

        /**
         * Sets the value of the indeterminateStayIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIndeterminateStayIndicator(Boolean value) {
            this.indeterminateStayIndicator = value;
        }

        /**
         * Gets the value of the durationOfStay property.
         * 
         * @return
         *     possible object is
         *     {@link DurationOfStayType }
         *     
         */
        public DurationOfStayType getDurationOfStay() {
            return durationOfStay;
        }

        /**
         * Sets the value of the durationOfStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link DurationOfStayType }
         *     
         */
        public void setDurationOfStay(DurationOfStayType value) {
            this.durationOfStay = value;
        }

        /**
         * Gets the value of the stayForYears property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStayForYears() {
            return stayForYears;
        }

        /**
         * Sets the value of the stayForYears property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStayForYears(BigInteger value) {
            this.stayForYears = value;
        }

        /**
         * Gets the value of the stayForMonths property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStayForMonths() {
            return stayForMonths;
        }

        /**
         * Sets the value of the stayForMonths property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStayForMonths(BigInteger value) {
            this.stayForMonths = value;
        }

        /**
         * Gets the value of the stayForDays property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStayForDays() {
            return stayForDays;
        }

        /**
         * Sets the value of the stayForDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStayForDays(BigInteger value) {
            this.stayForDays = value;
        }

    }

}