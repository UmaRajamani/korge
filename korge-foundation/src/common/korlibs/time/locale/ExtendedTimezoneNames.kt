package korlibs.time.locale

import korlibs.time.*

private fun utc(hours: Int, minutes: Int = 0) = hours.hours + minutes.minutes

// @TODO: Should we include the most popular timezones increasing the artifact size? Maybe include a plugin mechanism and a registration in klock-locale?
// @TODO: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations

private var ExtendedTimezoneNamesOrNull: TimezoneNames? = null

val ExtendedTimezoneNames: TimezoneNames get() {
    if (ExtendedTimezoneNamesOrNull == null) {
        ExtendedTimezoneNamesOrNull = TimezoneNames(
            "ACDT" to utc(+10, 30),
            "ACST" to utc(+9, 30),
            "ACT" to utc(-5),
            "ACWST" to utc(+8, 45),
            "ADT" to utc(-3),
            "AEDT" to utc(+11),
            "AEST" to utc(+10),
            "AFT" to utc(+4, 30),
            "AKDT" to utc(-8),
            "AKST" to utc(-9),
            "ALMT" to utc(+6),
            "AMST" to utc(-3),
            "AMT" to utc(-4),
            "AMT" to utc(+4),
            "ANAT" to utc(+12),
            "AQTT" to utc(+5),
            "ART" to utc(-3),
            "AST" to utc(+3),
            "AST" to utc(-4),
            "AWST" to utc(+8),
            "AZOST" to utc(0),
            "AZOT" to utc(-1),
            "AZT" to utc(+4),
            "BDT" to utc(+8),
            "BIOT" to utc(+6),
            "BIT" to utc(-12),
            "BOT" to utc(-4),
            "BRST" to utc(-2),
            "BRT" to utc(-3),
            "BST" to utc(+6),
            "BST" to utc(+11),
            "BST" to utc(+1),
            "BTT" to utc(+6),
            "CAT" to utc(+2),
            "CCT" to utc(+6, 30),
            "CDT" to utc(-5),
            "CDT" to utc(-4),
            "CEST" to utc(+2),
            "CET" to utc(+1),
            "CHADT" to utc(+13, 45),
            "CHAST" to utc(+12, 45),
            "CHOT" to utc(+8),
            "CHOST" to utc(+9),
            "CHST" to utc(+10),
            "CHUT" to utc(+10),
            "CIST" to utc(-8),
            "CIT" to utc(+8),
            "CKT" to utc(-10),
            "CLST" to utc(-3),
            "CLT" to utc(-4),
            "COST" to utc(-4),
            "COT" to utc(-5),
            "CST" to utc(-6),
            "CST" to utc(+8),
            "CST" to utc(-5),
            "CT" to utc(+8),
            "CVT" to utc(-1),
            "CWST" to utc(+8, 45),
            "CXT" to utc(+7),
            "DAVT" to utc(+7),
            "DDUT" to utc(+10),
            "DFT" to utc(+1),
            "EASST" to utc(-5),
            "EAST" to utc(-6),
            "EAT" to utc(+3),
            "ECT" to utc(-4),
            "ECT" to utc(-5),
            "EDT" to utc(-4),
            "EEST" to utc(+3),
            "EET" to utc(+2),
            "EGST" to utc(0),
            "EGT" to utc(-1),
            "EIT" to utc(+9),
            "EST" to utc(-5),
            "FET" to utc(+3),
            "FJT" to utc(+12),
            "FKST" to utc(-3),
            "FKT" to utc(-4),
            "FNT" to utc(-2),
            "GALT" to utc(-6),
            "GAMT" to utc(-9),
            "GET" to utc(+4),
            "GFT" to utc(-3),
            "GILT" to utc(+12),
            "GIT" to utc(-9),
            "GMT" to utc(0),
            "GST" to utc(-2),
            "GST" to utc(+4),
            "GYT" to utc(-4),
            "HDT" to utc(-9),
            "HAEC" to utc(+2),
            "HST" to utc(-10),
            "HKT" to utc(+8),
            "HMT" to utc(+5),
            "HOVST" to utc(+8),
            "HOVT" to utc(+7),
            "ICT" to utc(+7),
            "IDLW" to utc(-12),
            "IDT" to utc(+3),
            "IOT" to utc(+3),
            "IRDT" to utc(+4, 30),
            "IRKT" to utc(+8),
            "IRST" to utc(+3, 30),
            "IST" to utc(+5, 30),
            "IST" to utc(+1),
            "IST" to utc(+2),
            "JST" to utc(+9),
            "KALT" to utc(+2),
            "KGT" to utc(+6),
            "KOST" to utc(+11),
            "KRAT" to utc(+7),
            "KST" to utc(+9),
            "LHST" to utc(+10, 30),
            "LHST" to utc(+11),
            "LINT" to utc(+14),
            "MAGT" to utc(+12),
            "MART" to utc(-9, 30),
            "MAWT" to utc(+5),
            "MDT" to utc(-6),
            "MET" to utc(+1),
            "MEST" to utc(+2),
            "MHT" to utc(+12),
            "MIST" to utc(+11),
            "MIT" to utc(-9, 30),
            "MMT" to utc(+6, 30),
            "MSK" to utc(+3),
            "MST" to utc(+8),
            "MST" to utc(-7),
            "MUT" to utc(+4),
            "MVT" to utc(+5),
            "MYT" to utc(+8),
            "NCT" to utc(+11),
            "NDT" to utc(-2, 30),
            "NFT" to utc(+11),
            "NOVT" to utc(+7),
            "NPT" to utc(+5, 45),
            "NST" to utc(-3, 30),
            "NT" to utc(-3, 30),
            "NUT" to utc(-11),
            "NZDT" to utc(+13),
            "NZST" to utc(+12),
            "OMST" to utc(+6),
            "ORAT" to utc(+5),
            "PDT" to utc(-7),
            "PET" to utc(-5),
            "PETT" to utc(+12),
            "PGT" to utc(+10),
            "PHOT" to utc(+13),
            "PHT" to utc(+8),
            "PKT" to utc(+5),
            "PMDT" to utc(-2),
            "PMST" to utc(-3),
            "PONT" to utc(+11),
            "PST" to utc(-8),
            "PST" to utc(+8),
            "PYST" to utc(-3),
            "PYT" to utc(-4),
            "RET" to utc(+4),
            "ROTT" to utc(-3),
            "SAKT" to utc(+11),
            "SAMT" to utc(+4),
            "SAST" to utc(+2),
            "SBT" to utc(+11),
            "SCT" to utc(+4),
            "SDT" to utc(-10),
            "SGT" to utc(+8),
            "SLST" to utc(+5, 30),
            "SRET" to utc(+11),
            "SRT" to utc(-3),
            "SST" to utc(-11),
            "SST" to utc(+8),
            "SYOT" to utc(+3),
            "TAHT" to utc(-10),
            "THA" to utc(+7),
            "TFT" to utc(+5),
            "TJT" to utc(+5),
            "TKT" to utc(+13),
            "TLT" to utc(+9),
            "TMT" to utc(+5),
            "TRT" to utc(+3),
            "TOT" to utc(+13),
            "TVT" to utc(+12),
            "ULAST" to utc(+9),
            "ULAT" to utc(+8),
            "UTC" to utc(0),
            "UYST" to utc(-2),
            "UYT" to utc(-3),
            "UZT" to utc(+5),
            "VET" to utc(-4),
            "VLAT" to utc(+10),
            "VOLT" to utc(+4),
            "VOST" to utc(+6),
            "VUT" to utc(+11),
            "WAKT" to utc(+12),
            "WAST" to utc(+2),
            "WAT" to utc(+1),
            "WEST" to utc(+1),
            "WET" to utc(0),
            "WIT" to utc(+7),
            "WST" to utc(+8),
            "YAKT" to utc(+9),
            "YEKT" to utc(+5)
        )
    }
    return ExtendedTimezoneNamesOrNull!!
}
