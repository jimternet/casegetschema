//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.04 at 12:20:40 AM CDT 
//


package gov.mncourts.caseget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleMakeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleMakeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACUR"/&gt;
 *     &lt;enumeration value="AERO"/&gt;
 *     &lt;enumeration value="ALFA"/&gt;
 *     &lt;enumeration value="AEAG"/&gt;
 *     &lt;enumeration value="AIH"/&gt;
 *     &lt;enumeration value="AMER"/&gt;
 *     &lt;enumeration value="ARCA"/&gt;
 *     &lt;enumeration value="ASVE"/&gt;
 *     &lt;enumeration value="ASTO"/&gt;
 *     &lt;enumeration value="ASUN"/&gt;
 *     &lt;enumeration value="ATVA"/&gt;
 *     &lt;enumeration value="AUDI"/&gt;
 *     &lt;enumeration value="AUST"/&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="BAJA"/&gt;
 *     &lt;enumeration value="BENT"/&gt;
 *     &lt;enumeration value="BICA"/&gt;
 *     &lt;enumeration value="BMW"/&gt;
 *     &lt;enumeration value="BSA"/&gt;
 *     &lt;enumeration value="BUEL"/&gt;
 *     &lt;enumeration value="BUIC"/&gt;
 *     &lt;enumeration value="BUSA"/&gt;
 *     &lt;enumeration value="CADI"/&gt;
 *     &lt;enumeration value="CANA"/&gt;
 *     &lt;enumeration value="CAP"/&gt;
 *     &lt;enumeration value="CHEV"/&gt;
 *     &lt;enumeration value="CHRY"/&gt;
 *     &lt;enumeration value="CONA"/&gt;
 *     &lt;enumeration value="DAEW"/&gt;
 *     &lt;enumeration value="DAIH"/&gt;
 *     &lt;enumeration value="DATS"/&gt;
 *     &lt;enumeration value="DODG"/&gt;
 *     &lt;enumeration value="DUCA"/&gt;
 *     &lt;enumeration value="EZGO"/&gt;
 *     &lt;enumeration value="EGIL"/&gt;
 *     &lt;enumeration value="FARM"/&gt;
 *     &lt;enumeration value="FERR"/&gt;
 *     &lt;enumeration value="FIAT"/&gt;
 *     &lt;enumeration value="FORD"/&gt;
 *     &lt;enumeration value="FRHT"/&gt;
 *     &lt;enumeration value="GEM"/&gt;
 *     &lt;enumeration value="GENU"/&gt;
 *     &lt;enumeration value="GEO"/&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="GMC"/&gt;
 *     &lt;enumeration value="GRUM"/&gt;
 *     &lt;enumeration value="HD"/&gt;
 *     &lt;enumeration value="HINO"/&gt;
 *     &lt;enumeration value="HOND"/&gt;
 *     &lt;enumeration value="HUMM"/&gt;
 *     &lt;enumeration value="HYUN"/&gt;
 *     &lt;enumeration value="INDI"/&gt;
 *     &lt;enumeration value="INFI"/&gt;
 *     &lt;enumeration value="INTL"/&gt;
 *     &lt;enumeration value="ISU"/&gt;
 *     &lt;enumeration value="IVEC"/&gt;
 *     &lt;enumeration value="JAGU"/&gt;
 *     &lt;enumeration value="JEEP"/&gt;
 *     &lt;enumeration value="JENS"/&gt;
 *     &lt;enumeration value="KAWK"/&gt;
 *     &lt;enumeration value="KW"/&gt;
 *     &lt;enumeration value="KIA"/&gt;
 *     &lt;enumeration value="KTM"/&gt;
 *     &lt;enumeration value="LADA"/&gt;
 *     &lt;enumeration value="LAMO"/&gt;
 *     &lt;enumeration value="LNCI"/&gt;
 *     &lt;enumeration value="LNDR"/&gt;
 *     &lt;enumeration value="LEXS"/&gt;
 *     &lt;enumeration value="LINC"/&gt;
 *     &lt;enumeration value="LOTU"/&gt;
 *     &lt;enumeration value="MACK"/&gt;
 *     &lt;enumeration value="MASE"/&gt;
 *     &lt;enumeration value="MAYB"/&gt;
 *     &lt;enumeration value="MAZD"/&gt;
 *     &lt;enumeration value="MCLA"/&gt;
 *     &lt;enumeration value="MERZ"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="MERK"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="MIDS"/&gt;
 *     &lt;enumeration value="MNNI"/&gt;
 *     &lt;enumeration value="MITS"/&gt;
 *     &lt;enumeration value="MOPA"/&gt;
 *     &lt;enumeration value="MOGU"/&gt;
 *     &lt;enumeration value="MOTB"/&gt;
 *     &lt;enumeration value="MOTA"/&gt;
 *     &lt;enumeration value="MHNA"/&gt;
 *     &lt;enumeration value="MOTH"/&gt;
 *     &lt;enumeration value="NSTAR"/&gt;
 *     &lt;enumeration value="NISS"/&gt;
 *     &lt;enumeration value="NOMB"/&gt;
 *     &lt;enumeration value="NORT"/&gt;
 *     &lt;enumeration value="OFFA"/&gt;
 *     &lt;enumeration value="OLDS"/&gt;
 *     &lt;enumeration value="OPEL"/&gt;
 *     &lt;enumeration value="OSHK"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="PAUG"/&gt;
 *     &lt;enumeration value="PTRB"/&gt;
 *     &lt;enumeration value="PEUG"/&gt;
 *     &lt;enumeration value="PLYM"/&gt;
 *     &lt;enumeration value="POLS"/&gt;
 *     &lt;enumeration value="PONT"/&gt;
 *     &lt;enumeration value="PORS"/&gt;
 *     &lt;enumeration value="RAM"/&gt;
 *     &lt;enumeration value="RAMB"/&gt;
 *     &lt;enumeration value="RENA"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="ROEN"/&gt;
 *     &lt;enumeration value="SAA"/&gt;
 *     &lt;enumeration value="STRN"/&gt;
 *     &lt;enumeration value="SHWI"/&gt;
 *     &lt;enumeration value="SCIO"/&gt;
 *     &lt;enumeration value="BMBR"/&gt;
 *     &lt;enumeration value="SMRT"/&gt;
 *     &lt;enumeration value="SNOA"/&gt;
 *     &lt;enumeration value="SPNR"/&gt;
 *     &lt;enumeration value="SSI"/&gt;
 *     &lt;enumeration value="STLG"/&gt;
 *     &lt;enumeration value="STU"/&gt;
 *     &lt;enumeration value="SUBA"/&gt;
 *     &lt;enumeration value="SUZI"/&gt;
 *     &lt;enumeration value="TESL"/&gt;
 *     &lt;enumeration value="TOYT"/&gt;
 *     &lt;enumeration value="TRLR"/&gt;
 *     &lt;enumeration value="TRIU"/&gt;
 *     &lt;enumeration value="TRUM"/&gt;
 *     &lt;enumeration value="VENTO"/&gt;
 *     &lt;enumeration value="VESP"/&gt;
 *     &lt;enumeration value="VCTY"/&gt;
 *     &lt;enumeration value="VOLK"/&gt;
 *     &lt;enumeration value="VOLV"/&gt;
 *     &lt;enumeration value="WSTAR"/&gt;
 *     &lt;enumeration value="WHIT"/&gt;
 *     &lt;enumeration value="WINN"/&gt;
 *     &lt;enumeration value="WRKH"/&gt;
 *     &lt;enumeration value="YAMA"/&gt;
 *     &lt;enumeration value="YUGO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
