//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.03 at 11:26:33 PM CDT 
//


package gov.mnvcourts.casetget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleMakeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleMakeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACUR"/>
 *     &lt;enumeration value="AERO"/>
 *     &lt;enumeration value="ALFA"/>
 *     &lt;enumeration value="AEAG"/>
 *     &lt;enumeration value="AIH"/>
 *     &lt;enumeration value="AMER"/>
 *     &lt;enumeration value="ARCA"/>
 *     &lt;enumeration value="ASVE"/>
 *     &lt;enumeration value="ASTO"/>
 *     &lt;enumeration value="ASUN"/>
 *     &lt;enumeration value="ATVA"/>
 *     &lt;enumeration value="AUDI"/>
 *     &lt;enumeration value="AUST"/>
 *     &lt;enumeration value="AUTO"/>
 *     &lt;enumeration value="BAJA"/>
 *     &lt;enumeration value="BENT"/>
 *     &lt;enumeration value="BICA"/>
 *     &lt;enumeration value="BMW"/>
 *     &lt;enumeration value="BSA"/>
 *     &lt;enumeration value="BUEL"/>
 *     &lt;enumeration value="BUIC"/>
 *     &lt;enumeration value="BUSA"/>
 *     &lt;enumeration value="CADI"/>
 *     &lt;enumeration value="CANA"/>
 *     &lt;enumeration value="CAP"/>
 *     &lt;enumeration value="CHEV"/>
 *     &lt;enumeration value="CHRY"/>
 *     &lt;enumeration value="CONA"/>
 *     &lt;enumeration value="DAEW"/>
 *     &lt;enumeration value="DAIH"/>
 *     &lt;enumeration value="DATS"/>
 *     &lt;enumeration value="DODG"/>
 *     &lt;enumeration value="DUCA"/>
 *     &lt;enumeration value="EZGO"/>
 *     &lt;enumeration value="EGIL"/>
 *     &lt;enumeration value="FARM"/>
 *     &lt;enumeration value="FERR"/>
 *     &lt;enumeration value="FIAT"/>
 *     &lt;enumeration value="FORD"/>
 *     &lt;enumeration value="FRHT"/>
 *     &lt;enumeration value="GEM"/>
 *     &lt;enumeration value="GENU"/>
 *     &lt;enumeration value="GEO"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="GMC"/>
 *     &lt;enumeration value="GRUM"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="HINO"/>
 *     &lt;enumeration value="HOND"/>
 *     &lt;enumeration value="HUMM"/>
 *     &lt;enumeration value="HYUN"/>
 *     &lt;enumeration value="INDI"/>
 *     &lt;enumeration value="INFI"/>
 *     &lt;enumeration value="INTL"/>
 *     &lt;enumeration value="ISU"/>
 *     &lt;enumeration value="IVEC"/>
 *     &lt;enumeration value="JAGU"/>
 *     &lt;enumeration value="JEEP"/>
 *     &lt;enumeration value="JENS"/>
 *     &lt;enumeration value="KAWK"/>
 *     &lt;enumeration value="KW"/>
 *     &lt;enumeration value="KIA"/>
 *     &lt;enumeration value="KTM"/>
 *     &lt;enumeration value="LADA"/>
 *     &lt;enumeration value="LAMO"/>
 *     &lt;enumeration value="LNCI"/>
 *     &lt;enumeration value="LNDR"/>
 *     &lt;enumeration value="LEXS"/>
 *     &lt;enumeration value="LINC"/>
 *     &lt;enumeration value="LOTU"/>
 *     &lt;enumeration value="MACK"/>
 *     &lt;enumeration value="MASE"/>
 *     &lt;enumeration value="MAYB"/>
 *     &lt;enumeration value="MAZD"/>
 *     &lt;enumeration value="MCLA"/>
 *     &lt;enumeration value="MERZ"/>
 *     &lt;enumeration value="MERC"/>
 *     &lt;enumeration value="MERK"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MIDS"/>
 *     &lt;enumeration value="MNNI"/>
 *     &lt;enumeration value="MITS"/>
 *     &lt;enumeration value="MOPA"/>
 *     &lt;enumeration value="MOGU"/>
 *     &lt;enumeration value="MOTB"/>
 *     &lt;enumeration value="MOTA"/>
 *     &lt;enumeration value="MHNA"/>
 *     &lt;enumeration value="MOTH"/>
 *     &lt;enumeration value="NSTAR"/>
 *     &lt;enumeration value="NISS"/>
 *     &lt;enumeration value="NOMB"/>
 *     &lt;enumeration value="NORT"/>
 *     &lt;enumeration value="OFFA"/>
 *     &lt;enumeration value="OLDS"/>
 *     &lt;enumeration value="OPEL"/>
 *     &lt;enumeration value="OSHK"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PASS"/>
 *     &lt;enumeration value="PAUG"/>
 *     &lt;enumeration value="PTRB"/>
 *     &lt;enumeration value="PEUG"/>
 *     &lt;enumeration value="PLYM"/>
 *     &lt;enumeration value="POLS"/>
 *     &lt;enumeration value="PONT"/>
 *     &lt;enumeration value="PORS"/>
 *     &lt;enumeration value="RAM"/>
 *     &lt;enumeration value="RAMB"/>
 *     &lt;enumeration value="RENA"/>
 *     &lt;enumeration value="ROL"/>
 *     &lt;enumeration value="ROEN"/>
 *     &lt;enumeration value="SAA"/>
 *     &lt;enumeration value="STRN"/>
 *     &lt;enumeration value="SHWI"/>
 *     &lt;enumeration value="SCIO"/>
 *     &lt;enumeration value="BMBR"/>
 *     &lt;enumeration value="SMRT"/>
 *     &lt;enumeration value="SNOA"/>
 *     &lt;enumeration value="SPNR"/>
 *     &lt;enumeration value="SSI"/>
 *     &lt;enumeration value="STLG"/>
 *     &lt;enumeration value="STU"/>
 *     &lt;enumeration value="SUBA"/>
 *     &lt;enumeration value="SUZI"/>
 *     &lt;enumeration value="TESL"/>
 *     &lt;enumeration value="TOYT"/>
 *     &lt;enumeration value="TRLR"/>
 *     &lt;enumeration value="TRIU"/>
 *     &lt;enumeration value="TRUM"/>
 *     &lt;enumeration value="VENTO"/>
 *     &lt;enumeration value="VESP"/>
 *     &lt;enumeration value="VCTY"/>
 *     &lt;enumeration value="VOLK"/>
 *     &lt;enumeration value="VOLV"/>
 *     &lt;enumeration value="WSTAR"/>
 *     &lt;enumeration value="WHIT"/>
 *     &lt;enumeration value="WINN"/>
 *     &lt;enumeration value="WRKH"/>
 *     &lt;enumeration value="YAMA"/>
 *     &lt;enumeration value="YUGO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleMakeCodeType")
@XmlEnum
public enum VehicleMakeCodeType {

    ACUR,
    AERO,
    ALFA,
    AEAG,
    AIH,
    AMER,
    ARCA,
    ASVE,
    ASTO,
    ASUN,
    ATVA,
    AUDI,
    AUST,
    AUTO,
    BAJA,
    BENT,
    BICA,
    BMW,
    BSA,
    BUEL,
    BUIC,
    BUSA,
    CADI,
    CANA,
    CAP,
    CHEV,
    CHRY,
    CONA,
    DAEW,
    DAIH,
    DATS,
    DODG,
    DUCA,
    EZGO,
    EGIL,
    FARM,
    FERR,
    FIAT,
    FORD,
    FRHT,
    GEM,
    GENU,
    GEO,
    GM,
    GMC,
    GRUM,
    HD,
    HINO,
    HOND,
    HUMM,
    HYUN,
    INDI,
    INFI,
    INTL,
    ISU,
    IVEC,
    JAGU,
    JEEP,
    JENS,
    KAWK,
    KW,
    KIA,
    KTM,
    LADA,
    LAMO,
    LNCI,
    LNDR,
    LEXS,
    LINC,
    LOTU,
    MACK,
    MASE,
    MAYB,
    MAZD,
    MCLA,
    MERZ,
    MERC,
    MERK,
    MG,
    MIDS,
    MNNI,
    MITS,
    MOPA,
    MOGU,
    MOTB,
    MOTA,
    MHNA,
    MOTH,
    NSTAR,
    NISS,
    NOMB,
    NORT,
    OFFA,
    OLDS,
    OPEL,
    OSHK,
    OTHER,
    PASS,
    PAUG,
    PTRB,
    PEUG,
    PLYM,
    POLS,
    PONT,
    PORS,
    RAM,
    RAMB,
    RENA,
    ROL,
    ROEN,
    SAA,
    STRN,
    SHWI,
    SCIO,
    BMBR,
    SMRT,
    SNOA,
    SPNR,
    SSI,
    STLG,
    STU,
    SUBA,
    SUZI,
    TESL,
    TOYT,
    TRLR,
    TRIU,
    TRUM,
    VENTO,
    VESP,
    VCTY,
    VOLK,
    VOLV,
    WSTAR,
    WHIT,
    WINN,
    WRKH,
    YAMA,
    YUGO;

    public String value() {
        return name();
    }

    public static VehicleMakeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
