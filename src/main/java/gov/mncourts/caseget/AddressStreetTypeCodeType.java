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
 * <p>Java class for AddressStreetTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressStreetTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALY"/&gt;
 *     &lt;enumeration value="ANX"/&gt;
 *     &lt;enumeration value="ARC"/&gt;
 *     &lt;enumeration value="AVE"/&gt;
 *     &lt;enumeration value="BYU"/&gt;
 *     &lt;enumeration value="BCH"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BLF"/&gt;
 *     &lt;enumeration value="BLFS"/&gt;
 *     &lt;enumeration value="BTM"/&gt;
 *     &lt;enumeration value="BLVD"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="BRG"/&gt;
 *     &lt;enumeration value="BRK"/&gt;
 *     &lt;enumeration value="BRKS"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="BGS"/&gt;
 *     &lt;enumeration value="BYP"/&gt;
 *     &lt;enumeration value="CP"/&gt;
 *     &lt;enumeration value="CYN"/&gt;
 *     &lt;enumeration value="CPE"/&gt;
 *     &lt;enumeration value="CSWY"/&gt;
 *     &lt;enumeration value="CTR"/&gt;
 *     &lt;enumeration value="CTRS"/&gt;
 *     &lt;enumeration value="CIR"/&gt;
 *     &lt;enumeration value="CIRS"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CLFS"/&gt;
 *     &lt;enumeration value="CLB"/&gt;
 *     &lt;enumeration value="CMN"/&gt;
 *     &lt;enumeration value="CONN"/&gt;
 *     &lt;enumeration value="COR"/&gt;
 *     &lt;enumeration value="CORS"/&gt;
 *     &lt;enumeration value="CRSE"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="CTS"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="CVS"/&gt;
 *     &lt;enumeration value="CRK"/&gt;
 *     &lt;enumeration value="CRES"/&gt;
 *     &lt;enumeration value="CRST"/&gt;
 *     &lt;enumeration value="XING"/&gt;
 *     &lt;enumeration value="XRD"/&gt;
 *     &lt;enumeration value="CURV"/&gt;
 *     &lt;enumeration value="DL"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="DV"/&gt;
 *     &lt;enumeration value="DR"/&gt;
 *     &lt;enumeration value="DRS"/&gt;
 *     &lt;enumeration value="EST"/&gt;
 *     &lt;enumeration value="ESTS"/&gt;
 *     &lt;enumeration value="EXPY"/&gt;
 *     &lt;enumeration value="EXT"/&gt;
 *     &lt;enumeration value="EXTS"/&gt;
 *     &lt;enumeration value="FALL"/&gt;
 *     &lt;enumeration value="FLS"/&gt;
 *     &lt;enumeration value="FRY"/&gt;
 *     &lt;enumeration value="FLD"/&gt;
 *     &lt;enumeration value="FLDS"/&gt;
 *     &lt;enumeration value="FLT"/&gt;
 *     &lt;enumeration value="FLTS"/&gt;
 *     &lt;enumeration value="FRD"/&gt;
 *     &lt;enumeration value="FRDS"/&gt;
 *     &lt;enumeration value="FRST"/&gt;
 *     &lt;enumeration value="FRG"/&gt;
 *     &lt;enumeration value="FRGS"/&gt;
 *     &lt;enumeration value="FRK"/&gt;
 *     &lt;enumeration value="FRKS"/&gt;
 *     &lt;enumeration value="FT"/&gt;
 *     &lt;enumeration value="FWY"/&gt;
 *     &lt;enumeration value="GDN"/&gt;
 *     &lt;enumeration value="GDNS"/&gt;
 *     &lt;enumeration value="GTWY"/&gt;
 *     &lt;enumeration value="GLN"/&gt;
 *     &lt;enumeration value="GLNS"/&gt;
 *     &lt;enumeration value="GRN"/&gt;
 *     &lt;enumeration value="GRNS"/&gt;
 *     &lt;enumeration value="GRV"/&gt;
 *     &lt;enumeration value="GRVS"/&gt;
 *     &lt;enumeration value="HBR"/&gt;
 *     &lt;enumeration value="HBRS"/&gt;
 *     &lt;enumeration value="HVN"/&gt;
 *     &lt;enumeration value="HTS"/&gt;
 *     &lt;enumeration value="HWY"/&gt;
 *     &lt;enumeration value="HL"/&gt;
 *     &lt;enumeration value="HLS"/&gt;
 *     &lt;enumeration value="HOLW"/&gt;
 *     &lt;enumeration value="INLT"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="ISS"/&gt;
 *     &lt;enumeration value="ISLE"/&gt;
 *     &lt;enumeration value="JCT"/&gt;
 *     &lt;enumeration value="JCTS"/&gt;
 *     &lt;enumeration value="KY"/&gt;
 *     &lt;enumeration value="KYS"/&gt;
 *     &lt;enumeration value="KNL"/&gt;
 *     &lt;enumeration value="KNLS"/&gt;
 *     &lt;enumeration value="LK"/&gt;
 *     &lt;enumeration value="LKS"/&gt;
 *     &lt;enumeration value="LAND"/&gt;
 *     &lt;enumeration value="LNDG"/&gt;
 *     &lt;enumeration value="LN"/&gt;
 *     &lt;enumeration value="LGT"/&gt;
 *     &lt;enumeration value="LGTS"/&gt;
 *     &lt;enumeration value="LF"/&gt;
 *     &lt;enumeration value="LCK"/&gt;
 *     &lt;enumeration value="LCKS"/&gt;
 *     &lt;enumeration value="LDG"/&gt;
 *     &lt;enumeration value="LOOP"/&gt;
 *     &lt;enumeration value="MALL"/&gt;
 *     &lt;enumeration value="MNR"/&gt;
 *     &lt;enumeration value="MNRS"/&gt;
 *     &lt;enumeration value="MDW"/&gt;
 *     &lt;enumeration value="MDWS"/&gt;
 *     &lt;enumeration value="MEWS"/&gt;
 *     &lt;enumeration value="ML"/&gt;
 *     &lt;enumeration value="MLS"/&gt;
 *     &lt;enumeration value="MSN"/&gt;
 *     &lt;enumeration value="MTWY"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="MTN"/&gt;
 *     &lt;enumeration value="MTNS"/&gt;
 *     &lt;enumeration value="NCK"/&gt;
 *     &lt;enumeration value="ORCH"/&gt;
 *     &lt;enumeration value="OVAL"/&gt;
 *     &lt;enumeration value="OPAS"/&gt;
 *     &lt;enumeration value="PARK"/&gt;
 *     &lt;enumeration value="PKWY"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="PSGE"/&gt;
 *     &lt;enumeration value="PATH"/&gt;
 *     &lt;enumeration value="PIKE"/&gt;
 *     &lt;enumeration value="PNE"/&gt;
 *     &lt;enumeration value="PNES"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PLNS"/&gt;
 *     &lt;enumeration value="PLZ"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="PTS"/&gt;
 *     &lt;enumeration value="PRT"/&gt;
 *     &lt;enumeration value="PRTS"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="RADL"/&gt;
 *     &lt;enumeration value="RAMP"/&gt;
 *     &lt;enumeration value="RNCH"/&gt;
 *     &lt;enumeration value="RPD"/&gt;
 *     &lt;enumeration value="RPDS"/&gt;
 *     &lt;enumeration value="RST"/&gt;
 *     &lt;enumeration value="RDG"/&gt;
 *     &lt;enumeration value="RDGS"/&gt;
 *     &lt;enumeration value="RIV"/&gt;
 *     &lt;enumeration value="RD"/&gt;
 *     &lt;enumeration value="RDS"/&gt;
 *     &lt;enumeration value="RTE"/&gt;
 *     &lt;enumeration value="ROW"/&gt;
 *     &lt;enumeration value="RUE"/&gt;
 *     &lt;enumeration value="RUN"/&gt;
 *     &lt;enumeration value="SHL"/&gt;
 *     &lt;enumeration value="SHLS"/&gt;
 *     &lt;enumeration value="SHR"/&gt;
 *     &lt;enumeration value="SHRS"/&gt;
 *     &lt;enumeration value="SKWY"/&gt;
 *     &lt;enumeration value="SPG"/&gt;
 *     &lt;enumeration value="SPGS"/&gt;
 *     &lt;enumeration value="SPUR"/&gt;
 *     &lt;enumeration value="SQ"/&gt;
 *     &lt;enumeration value="SQS"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="STRA"/&gt;
 *     &lt;enumeration value="STRM"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="STS"/&gt;
 *     &lt;enumeration value="SMT"/&gt;
 *     &lt;enumeration value="TER"/&gt;
 *     &lt;enumeration value="TRWY"/&gt;
 *     &lt;enumeration value="TRCE"/&gt;
 *     &lt;enumeration value="TRAK"/&gt;
 *     &lt;enumeration value="TRFY"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="TUNL"/&gt;
 *     &lt;enumeration value="TPKE"/&gt;
 *     &lt;enumeration value="UPAS"/&gt;
 *     &lt;enumeration value="UN"/&gt;
 *     &lt;enumeration value="UNS"/&gt;
 *     &lt;enumeration value="VLY"/&gt;
 *     &lt;enumeration value="VLYS"/&gt;
 *     &lt;enumeration value="VIA"/&gt;
 *     &lt;enumeration value="VW"/&gt;
 *     &lt;enumeration value="VWS"/&gt;
 *     &lt;enumeration value="VLG"/&gt;
 *     &lt;enumeration value="VLGS"/&gt;
 *     &lt;enumeration value="VL"/&gt;
 *     &lt;enumeration value="VIS"/&gt;
 *     &lt;enumeration value="WALK"/&gt;
 *     &lt;enumeration value="WALL"/&gt;
 *     &lt;enumeration value="WAY"/&gt;
 *     &lt;enumeration value="WAYS"/&gt;
 *     &lt;enumeration value="WL"/&gt;
 *     &lt;enumeration value="WLS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressStreetTypeCodeType")
@XmlEnum
public enum AddressStreetTypeCodeType {

    ALY,
    ANX,
    ARC,
    AVE,
    BYU,
    BCH,
    BND,
    BLF,
    BLFS,
    BTM,
    BLVD,
    BR,
    BRG,
    BRK,
    BRKS,
    BG,
    BGS,
    BYP,
    CP,
    CYN,
    CPE,
    CSWY,
    CTR,
    CTRS,
    CIR,
    CIRS,
    CLF,
    CLFS,
    CLB,
    CMN,
    CONN,
    COR,
    CORS,
    CRSE,
    CT,
    CTS,
    CV,
    CVS,
    CRK,
    CRES,
    CRST,
    XING,
    XRD,
    CURV,
    DL,
    DM,
    DV,
    DR,
    DRS,
    EST,
    ESTS,
    EXPY,
    EXT,
    EXTS,
    FALL,
    FLS,
    FRY,
    FLD,
    FLDS,
    FLT,
    FLTS,
    FRD,
    FRDS,
    FRST,
    FRG,
    FRGS,
    FRK,
    FRKS,
    FT,
    FWY,
    GDN,
    GDNS,
    GTWY,
    GLN,
    GLNS,
    GRN,
    GRNS,
    GRV,
    GRVS,
    HBR,
    HBRS,
    HVN,
    HTS,
    HWY,
    HL,
    HLS,
    HOLW,
    INLT,
    IS,
    ISS,
    ISLE,
    JCT,
    JCTS,
    KY,
    KYS,
    KNL,
    KNLS,
    LK,
    LKS,
    LAND,
    LNDG,
    LN,
    LGT,
    LGTS,
    LF,
    LCK,
    LCKS,
    LDG,
    LOOP,
    MALL,
    MNR,
    MNRS,
    MDW,
    MDWS,
    MEWS,
    ML,
    MLS,
    MSN,
    MTWY,
    MT,
    MTN,
    MTNS,
    NCK,
    ORCH,
    OVAL,
    OPAS,
    PARK,
    PKWY,
    PASS,
    PSGE,
    PATH,
    PIKE,
    PNE,
    PNES,
    PL,
    PLN,
    PLNS,
    PLZ,
    PT,
    PTS,
    PRT,
    PRTS,
    PR,
    RADL,
    RAMP,
    RNCH,
    RPD,
    RPDS,
    RST,
    RDG,
    RDGS,
    RIV,
    RD,
    RDS,
    RTE,
    ROW,
    RUE,
    RUN,
    SHL,
    SHLS,
    SHR,
    SHRS,
    SKWY,
    SPG,
    SPGS,
    SPUR,
    SQ,
    SQS,
    STA,
    STRA,
    STRM,
    ST,
    STS,
    SMT,
    TER,
    TRWY,
    TRCE,
    TRAK,
    TRFY,
    TRL,
    TUNL,
    TPKE,
    UPAS,
    UN,
    UNS,
    VLY,
    VLYS,
    VIA,
    VW,
    VWS,
    VLG,
    VLGS,
    VL,
    VIS,
    WALK,
    WALL,
    WAY,
    WAYS,
    WL,
    WLS;

    public String value() {
        return name();
    }

    public static AddressStreetTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
