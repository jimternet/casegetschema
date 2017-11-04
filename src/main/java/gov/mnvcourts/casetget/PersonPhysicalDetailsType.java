//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * The subset of JXDM elements Minnesota Courts may record relating to a person's physical description.
 * 
 * <p>Java class for PersonPhysicalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPhysicalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonHeightMeasure" type="{http://www.courts.state.mn.us/CourtXML/3}PersonHeightMeasureType" minOccurs="0"/>
 *         &lt;element name="PersonWeightMeasure" type="{http://www.courts.state.mn.us/CourtXML/3}PersonWeightMeasureType" minOccurs="0"/>
 *         &lt;element name="PersonEyeColorText" type="{http://www.courts.state.mn.us/CourtXML/3}EyeColorTypeCodeTextType" minOccurs="0"/>
 *         &lt;element name="PersonHairColorText" type="{http://www.courts.state.mn.us/CourtXML/3}HairColorTypeCodeTextType" minOccurs="0"/>
 *         &lt;element name="PersonSexText" type="{http://www.courts.state.mn.us/CourtXML/3}GenderTypeCodeTextType" minOccurs="0"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}PersonEthnicity" minOccurs="0"/>
 *         &lt;element ref="{http://www.courts.state.mn.us/CourtXML/3}PersonRace" minOccurs="0"/>
 *         &lt;element name="PersonPhysicalFeature" type="{http://www.courts.state.mn.us/CourtXML/3}PersonPhysicalFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPhysicalDetailsType", propOrder = {
    "personHeightMeasure",
    "personWeightMeasure",
    "personEyeColorText",
    "personHairColorText",
    "personSexText",
    "personEthnicity",
    "personRace",
    "personPhysicalFeature"
})
public class PersonPhysicalDetailsType {

    @XmlElement(name = "PersonHeightMeasure")
    protected PersonHeightMeasureType personHeightMeasure;
    @XmlElement(name = "PersonWeightMeasure")
    protected PersonWeightMeasureType personWeightMeasure;
    @XmlElementRef(name = "PersonEyeColorText", namespace = "http://www.courts.state.mn.us/CourtXML/3", type = JAXBElement.class)
    protected JAXBElement<EyeColorTypeCodeTextType> personEyeColorText;
    @XmlElementRef(name = "PersonHairColorText", namespace = "http://www.courts.state.mn.us/CourtXML/3", type = JAXBElement.class)
    protected JAXBElement<HairColorTypeCodeTextType> personHairColorText;
    @XmlElementRef(name = "PersonSexText", namespace = "http://www.courts.state.mn.us/CourtXML/3", type = JAXBElement.class)
    protected JAXBElement<GenderTypeCodeTextType> personSexText;
    @XmlElement(name = "PersonEthnicity")
    protected PersonEthnicityType personEthnicity;
    @XmlElement(name = "PersonRace")
    protected PersonRaceType personRace;
    @XmlElement(name = "PersonPhysicalFeature")
    protected List<PersonPhysicalFeatureType> personPhysicalFeature;

    /**
     * Gets the value of the personHeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link PersonHeightMeasureType }
     *     
     */
    public PersonHeightMeasureType getPersonHeightMeasure() {
        return personHeightMeasure;
    }

    /**
     * Sets the value of the personHeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonHeightMeasureType }
     *     
     */
    public void setPersonHeightMeasure(PersonHeightMeasureType value) {
        this.personHeightMeasure = value;
    }

    /**
     * Gets the value of the personWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link PersonWeightMeasureType }
     *     
     */
    public PersonWeightMeasureType getPersonWeightMeasure() {
        return personWeightMeasure;
    }

    /**
     * Sets the value of the personWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonWeightMeasureType }
     *     
     */
    public void setPersonWeightMeasure(PersonWeightMeasureType value) {
        this.personWeightMeasure = value;
    }

    /**
     * Gets the value of the personEyeColorText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EyeColorTypeCodeTextType }{@code >}
     *     
     */
    public JAXBElement<EyeColorTypeCodeTextType> getPersonEyeColorText() {
        return personEyeColorText;
    }

    /**
     * Sets the value of the personEyeColorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EyeColorTypeCodeTextType }{@code >}
     *     
     */
    public void setPersonEyeColorText(JAXBElement<EyeColorTypeCodeTextType> value) {
        this.personEyeColorText = ((JAXBElement<EyeColorTypeCodeTextType> ) value);
    }

    /**
     * Gets the value of the personHairColorText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HairColorTypeCodeTextType }{@code >}
     *     
     */
    public JAXBElement<HairColorTypeCodeTextType> getPersonHairColorText() {
        return personHairColorText;
    }

    /**
     * Sets the value of the personHairColorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HairColorTypeCodeTextType }{@code >}
     *     
     */
    public void setPersonHairColorText(JAXBElement<HairColorTypeCodeTextType> value) {
        this.personHairColorText = ((JAXBElement<HairColorTypeCodeTextType> ) value);
    }

    /**
     * Gets the value of the personSexText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenderTypeCodeTextType }{@code >}
     *     
     */
    public JAXBElement<GenderTypeCodeTextType> getPersonSexText() {
        return personSexText;
    }

    /**
     * Sets the value of the personSexText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenderTypeCodeTextType }{@code >}
     *     
     */
    public void setPersonSexText(JAXBElement<GenderTypeCodeTextType> value) {
        this.personSexText = ((JAXBElement<GenderTypeCodeTextType> ) value);
    }

    /**
     * Gets the value of the personEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link PersonEthnicityType }
     *     
     */
    public PersonEthnicityType getPersonEthnicity() {
        return personEthnicity;
    }

    /**
     * Sets the value of the personEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEthnicityType }
     *     
     */
    public void setPersonEthnicity(PersonEthnicityType value) {
        this.personEthnicity = value;
    }

    /**
     * Gets the value of the personRace property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRaceType }
     *     
     */
    public PersonRaceType getPersonRace() {
        return personRace;
    }

    /**
     * Sets the value of the personRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRaceType }
     *     
     */
    public void setPersonRace(PersonRaceType value) {
        this.personRace = value;
    }

    /**
     * Gets the value of the personPhysicalFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPhysicalFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPhysicalFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPhysicalFeatureType }
     * 
     * 
     */
    public List<PersonPhysicalFeatureType> getPersonPhysicalFeature() {
        if (personPhysicalFeature == null) {
            personPhysicalFeature = new ArrayList<PersonPhysicalFeatureType>();
        }
        return this.personPhysicalFeature;
    }

}
