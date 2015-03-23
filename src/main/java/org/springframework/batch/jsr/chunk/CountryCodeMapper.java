package org.springframework.batch.jsr.chunk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountryCodeMapper {

	private static final Map<String, Set<String>> mapping = new HashMap<String, Set<String>>();

	static {
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] {"ABW", "AW"});
		values.add(new String[] {"AFG", "AF"});
		values.add(new String[] {"AGO", "AO"});
		values.add(new String[] {"AIA", "AI"});
		values.add(new String[] {"ALB", "AL"});
		values.add(new String[] {"ARE", "AE"});
		values.add(new String[] {"ARG", "AR"});
		values.add(new String[] {"ARM", "AM"});
		values.add(new String[] {"ASM", "AS"});
		values.add(new String[] {"ATB", "AQ"});
		values.add(new String[] {"AUA", "AU"});
		values.add(new String[] {"AUT", "AT"});
		values.add(new String[] {"AUZ", "AU"});
		values.add(new String[] {"AZE", "AZ"});
		values.add(new String[] {"BCR", "BE"});
		values.add(new String[] {"BDI", "BI"});
		values.add(new String[] {"BEN", "BJ"});
		values.add(new String[] {"BFA", "BF"});
		values.add(new String[] {"BFR", "BE"});
		values.add(new String[] {"BGD", "BD"});
		values.add(new String[] {"BGR", "BG"});
		values.add(new String[] {"BHF", "BA"});
		values.add(new String[] {"BHR", "BH"});
		values.add(new String[] {"BHS", "BM"});
		values.add(new String[] {"BIS", "BA"});
		values.add(new String[] {"BLM", "BL"});
		values.add(new String[] {"BLR", "BY"});
		values.add(new String[] {"BLZ", "BZ"});
		values.add(new String[] {"BMU", "BM"});
		values.add(new String[] {"BOL", "BO"});
		values.add(new String[] {"BRA", "BR"});
		values.add(new String[] {"BRB", "BB"});
		values.add(new String[] {"BRN", "BN"});
		values.add(new String[] {"BTN", "BT"});
		values.add(new String[] {"BVT", "BV"});
		values.add(new String[] {"BWA", "BW"});
		values.add(new String[] {"BWR", "BE"});
		values.add(new String[] {"CAF", "CF"});
		values.add(new String[] {"CAN", "CA"});
		values.add(new String[] {"CCK", "CC"});
		values.add(new String[] {"CHE", "CH"});
		values.add(new String[] {"CHH", "CN"});
		values.add(new String[] {"CHI", "CN"});
		values.add(new String[] {"CHX", "CL"});
		values.add(new String[] {"CIV", "CI"});
		values.add(new String[] {"CMR", "CM"});
		values.add(new String[] {"COD", "CD"});
		values.add(new String[] {"COG", "CG"});
		values.add(new String[] {"COK", "CK"});
		values.add(new String[] {"COL", "CO"});
		values.add(new String[] {"COM", "KM"});
		values.add(new String[] {"CPV", "CV"});
		values.add(new String[] {"CRI", "CR"});
		values.add(new String[] {"CUB", "CU"});
		values.add(new String[] {"CUW", "CW"});
		values.add(new String[] {"CYM", "CY"});
		values.add(new String[] {"CYN", "CY"});
		values.add(new String[] {"CYP", "CY"});
		values.add(new String[] {"CZE", "CZ"});
		values.add(new String[] {"DEU", "DE"});
		values.add(new String[] {"DJI", "DJ"});
		values.add(new String[] {"DMA", "DM"});
		values.add(new String[] {"DNK", "DK"});
		values.add(new String[] {"DOM", "DO"});
		values.add(new String[] {"DZA", "DZ"});
		values.add(new String[] {"ECD", "EC"});
		values.add(new String[] {"ECG", "EC"});
		values.add(new String[] {"EGY", "EG"});
		values.add(new String[] {"ENG", "GB"});
		values.add(new String[] {"ERI", "ER"});
		values.add(new String[] {"EST", "EE"});
		values.add(new String[] {"ESX", "ES"});
		values.add(new String[] {"ETH", "ET"});
		values.add(new String[] {"FIN", "FI"});
		values.add(new String[] {"FJI", "FJ"});
		values.add(new String[] {"FLK", "FK"});
		values.add(new String[] {"FRO", "FO"});
		values.add(new String[] {"FSA", "TF"});
		values.add(new String[] {"FSM", "FM"});
		values.add(new String[] {"FXC", "FR"});
		values.add(new String[] {"FXX", "FR"});
		values.add(new String[] {"GAB", "GA"});
		values.add(new String[] {"GAZ", "IL"});
		values.add(new String[] {"GEA", "GE"});
		values.add(new String[] {"GEG", "GE"});
		values.add(new String[] {"GHA", "GH"});
		values.add(new String[] {"GIN", "GN"});
		values.add(new String[] {"GLP", "GP"});
		values.add(new String[] {"GMB", "GM"});
		values.add(new String[] {"GNB", "GW"});
		values.add(new String[] {"GNK", "GQ"});
		values.add(new String[] {"GNR", "GQ"});
		values.add(new String[] {"GRC", "GR"});
		values.add(new String[] {"GRD", "GD"});
		values.add(new String[] {"GRL", "GL"});
		values.add(new String[] {"GTM", "GT"});
		values.add(new String[] {"GUF", "GF"});
		values.add(new String[] {"GUM", "GU"});
		values.add(new String[] {"GUY", "GY"});
		values.add(new String[] {"HKG", "HK"});
		values.add(new String[] {"HMD", "HM"});
		values.add(new String[] {"HND", "HN"});
		values.add(new String[] {"HRV", "HR"});
		values.add(new String[] {"HTI", "HT"});
		values.add(new String[] {"HUN", "HU"});
		values.add(new String[] {"IDN", "ID"});
		values.add(new String[] {"IMN", "IM"});
		values.add(new String[] {"INX", "IN"});
		values.add(new String[] {"IOT", "IO"});
		values.add(new String[] {"IRK", "IQ"});
		values.add(new String[] {"IRL", "IE"});
		values.add(new String[] {"IRN", "IR"});
		values.add(new String[] {"IRR", "IQ"});
		values.add(new String[] {"ISL", "IS"});
		values.add(new String[] {"ISR", "IL"});
		values.add(new String[] {"ITD", "IT"});
		values.add(new String[] {"ITP", "IT"});
		values.add(new String[] {"ITX", "IT"});
		values.add(new String[] {"ITY", "IT"});
		values.add(new String[] {"JAM", "JM"});
		values.add(new String[] {"JEY", "JE"});
		values.add(new String[] {"JOR", "JO"});
		values.add(new String[] {"JPH", "JP"});
		values.add(new String[] {"JPK", "JP"});
		values.add(new String[] {"JPO", "JP"});
		values.add(new String[] {"JPS", "JP"});
		values.add(new String[] {"JPX", "JP"});
		values.add(new String[] {"JPY", "JP"});
		values.add(new String[] {"KAB", "KZ"});
		values.add(new String[] {"KAS", "PK"});
		values.add(new String[] {"KAZ", "KZ"});
		values.add(new String[] {"KEN", "KE"});
		values.add(new String[] {"KGZ", "KG"});
		values.add(new String[] {"KHM", "KH"});
		values.add(new String[] {"KIR", "KI"});
		values.add(new String[] {"KNA", "KN"});
		values.add(new String[] {"KOJ", "KP"});
		values.add(new String[] {"KOS", "RS"});
		values.add(new String[] {"KOX", "KP"});
		values.add(new String[] {"KWT", "KW"});
		values.add(new String[] {"KXI", "KP"});
		values.add(new String[] {"LAO", "LA"});
		values.add(new String[] {"LBN", "LB"});
		values.add(new String[] {"LBR", "LR"});
		values.add(new String[] {"LBY", "LY"});
		values.add(new String[] {"LCA", "LC"});
		values.add(new String[] {"LIE", "LI"});
		values.add(new String[] {"LKA", "LK"});
		values.add(new String[] {"LSO", "LS"});
		values.add(new String[] {"LTU", "LT"});
		values.add(new String[] {"LUX", "LU"});
		values.add(new String[] {"LVA", "LV"});
		values.add(new String[] {"MAC", "MO"});
		values.add(new String[] {"MAF", "MF"});
		values.add(new String[] {"MAR", "MA"});
		values.add(new String[] {"MCO", "MC"});
		values.add(new String[] {"MDA", "MD"});
		values.add(new String[] {"MDG", "MG"});
		values.add(new String[] {"MDV", "MV"});
		values.add(new String[] {"MEX", "MX"});
		values.add(new String[] {"MHL", "MH"});
		values.add(new String[] {"MKD", "MK"});
		values.add(new String[] {"MLI", "ML"});
		values.add(new String[] {"MLT", "MT"});
		values.add(new String[] {"MMR", "MM"});
		values.add(new String[] {"MNE", "ME"});
		values.add(new String[] {"MNG", "MN"});
		values.add(new String[] {"MNP", "MP"});
		values.add(new String[] {"MOZ", "MZ"});
		values.add(new String[] {"MRT", "MR"});
		values.add(new String[] {"MSR", "MS"});
		values.add(new String[] {"MTQ", "MQ"});
		values.add(new String[] {"MUS", "MU"});
		values.add(new String[] {"MWI", "MW"});
		values.add(new String[] {"MYS", "MY"});
		values.add(new String[] {"MYT", "YT"});
		values.add(new String[] {"NAM", "NA"});
		values.add(new String[] {"NCL", "NC"});
		values.add(new String[] {"NER", "NE"});
		values.add(new String[] {"NFK", "NF"});
		values.add(new String[] {"NGA", "NG"});
		values.add(new String[] {"NIC", "NI"});
		values.add(new String[] {"NIU", "NU"});
		values.add(new String[] {"NJM", "NO"});
		values.add(new String[] {"NLX", "NL"});
		values.add(new String[] {"NOW", "NO"});
		values.add(new String[] {"NPL", "NP"});
		values.add(new String[] {"NRU", "NR"});
		values.add(new String[] {"NSV", "NO"});
		values.add(new String[] {"NZA", "NZ"});
		values.add(new String[] {"NZC", "NZ"});
		values.add(new String[] {"NZN", "NZ"});
		values.add(new String[] {"NZS", "NZ"});
		values.add(new String[] {"OMN", "OM"});
		values.add(new String[] {"PAK", "PK"});
		values.add(new String[] {"PAN", "PA"});
		values.add(new String[] {"PAZ", "PT"});
		values.add(new String[] {"PCN", "PN"});
		values.add(new String[] {"PER", "PE"});
		values.add(new String[] {"PHL", "PH"});
		values.add(new String[] {"PLW", "PW"});
		values.add(new String[] {"PMD", "PT"});
		values.add(new String[] {"PNB", "PG"});
		values.add(new String[] {"PNX", "PG"});
		values.add(new String[] {"POL", "PL"});
		values.add(new String[] {"PRI", "PR"});
		values.add(new String[] {"PRK", "KP"});
		values.add(new String[] {"PRX", "PT"});
		values.add(new String[] {"PRY", "PY"});
		values.add(new String[] {"PYF", "PF"});
		values.add(new String[] {"QAT", "QA"});
		values.add(new String[] {"REU", "RE"});
		values.add(new String[] {"ROU", "RO"});
		values.add(new String[] {"RUA", "RU"});
		values.add(new String[] {"RUE", "RU"});
		// "RUK", "??"
		values.add(new String[] {"RWA", "RW"});
		values.add(new String[] {"SAH", "MA"});
		values.add(new String[] {"SAU", "SA"});
		values.add(new String[] {"SCT", "GB"});
		values.add(new String[] {"SDN", "SD"});
		values.add(new String[] {"SDS", "SS"});
		values.add(new String[] {"SEN", "SN"});
		values.add(new String[] {"SGG", "GS"});
		values.add(new String[] {"SGP", "SG"});
		values.add(new String[] {"SLB", "SB"});
		values.add(new String[] {"SLE", "SL"});
		values.add(new String[] {"SLV", "SV"});
		values.add(new String[] {"SMR", "SM"});
		values.add(new String[] {"SOL", "SO"});
		values.add(new String[] {"SOP", "SO"});
		values.add(new String[] {"SOX", "SO"});
		values.add(new String[] {"SPM", "PM"});
		values.add(new String[] {"SRS", "RS"});
		values.add(new String[] {"SRV", "RS"});
		values.add(new String[] {"STA", "ST"});
		values.add(new String[] {"STS", "ST"});
		values.add(new String[] {"SUR", "SR"});
		values.add(new String[] {"SVK", "SK"});
		values.add(new String[] {"SVN", "SI"});
		values.add(new String[] {"SWE", "SE"});
		values.add(new String[] {"SWZ", "SZ"});
		values.add(new String[] {"SXM", "SX"});
		values.add(new String[] {"SYU", "IR"});
		values.add(new String[] {"SYX", "IR"});
		values.add(new String[] {"TCA", "TC"});
		values.add(new String[] {"TCD", "TD"});
		values.add(new String[] {"TGO", "TG"});
		values.add(new String[] {"THA", "TH"});
		values.add(new String[] {"TJK", "TJ"});
		values.add(new String[] {"TKL", "TK"});
		values.add(new String[] {"TKM", "TM"});
		values.add(new String[] {"TLP", "TL"});
		values.add(new String[] {"TLX", "TL"});
		values.add(new String[] {"TON", "TO"});
		values.add(new String[] {"TTD", "TT"});
		values.add(new String[] {"TTG", "TT"});
		values.add(new String[] {"TUN", "TN"});
		values.add(new String[] {"TUR", "TR"});
		values.add(new String[] {"TUV", "TV"});
		values.add(new String[] {"TWN", "TW"});
		values.add(new String[] {"TZA", "TZ"});
		values.add(new String[] {"UGA", "UG"});
		values.add(new String[] {"UKR", "UA"});
		values.add(new String[] {"URY", "UY"});
		values.add(new String[] {"USB", "US"});
		values.add(new String[] {"USH", "US"});
		values.add(new String[] {"USK", "US"});
		values.add(new String[] {"UZB", "UZ"});
		values.add(new String[] {"VCT", "VC"});
		values.add(new String[] {"VEN", "VE"});
		values.add(new String[] {"VGB", "VG"});
		values.add(new String[] {"VIR", "VI"});
		values.add(new String[] {"VNM", "VN"});
		values.add(new String[] {"VUT", "VU"});
		values.add(new String[] {"WEB", "IL"});
		values.add(new String[] {"WLS", "GB"});
		values.add(new String[] {"WSM", "WS"});
		values.add(new String[] {"YEM", "YE"});
		values.add(new String[] {"YES", "YE"});
		values.add(new String[] {"ZAX", "ZA"});
		values.add(new String[] {"ZMB", "ZM"});
		values.add(new String[] {"ZWE", "ZW"});

		for (String[] strings : values) {
			if(mapping.containsKey(strings[1])) {
				mapping.get(strings[1]).add(strings[0]);
			} else {
				Set<String> countries = new HashSet<String>();
				countries.add(strings[0]);
				mapping.put(strings[1], countries);
			}
		}
	}

	public static Set<String> mapCountryCode(String code) {
		return mapping.get(code);
	}

}
