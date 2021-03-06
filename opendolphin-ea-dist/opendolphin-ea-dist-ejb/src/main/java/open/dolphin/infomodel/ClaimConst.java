package open.dolphin.infomodel;

public final class ClaimConst {
    
    public static final String DISEASE_MASTER_SYSTEM = "mml.codeSystem.diseaseMaster=ICD10_2001-10-03MEDIS";
    public static final String CLASS_CODE_ID    = "Claim007";	// fÃs×æªe[uID
    public static final String SUBCLASS_CODE_ID = "Claim003";	// èZAÞ¿AòÜæªe[uID
    public static final String NUMBER_CODE_ID   = "Claim004";	// ÊR[he[uID

    /** èZ */
    public static final int SYUGI = 0;

    /** Þ¿ */
    public static final int ZAIRYO = 1;

    /** òÜ */
    public static final int YAKUZAI = 2;

    /** p@ */
    public static final int ADMIN = 3;

    /** Ê */
    public static final int BUI = 4;
    
    /** »Ì¼ */
    public static final int OTHER = 5;

    /** òÜæª àp */
    public static final String YKZ_KBN_NAIYO = "1";

    /** òÜæª Ë */
    public static final String YKZ_KBN_INJECTION = "4";

    /** òÜæª Op */
    public static final String YKZ_KBN_GAIYO = "6";

    /** ZdZR[h àp */
    public static final String RECEIPT_CODE_NAIYO = "210";

    /** ZdZR[h àp@à */
    public static final String RECEIPT_CODE_NAIYO_IN = "211";

    /** ZdZR[h àp@O */
    public static final String RECEIPT_CODE_NAIYO_EXT = "212";
    
    /** ZdZR[h àpï */
    public static final String RECEIPT_CODE_NAIYO_HOKATSU = "213";

    /** ZdZR[h Úp */
    public static final String RECEIPT_CODE_TONYO = "220";

    /** ZdZR[h Úp@à */
    public static final String RECEIPT_CODE_TONYO_IN = "221";

    /** ZdZR[h Úp@O */
    public static final String RECEIPT_CODE_TONYO_EXT = "222";

    /** ZdZR[h Úpï */
    public static final String RECEIPT_CODE_TONYO_HOKATSU = "222";

    /** ZdZR[h Op*/
    public static final String RECEIPT_CODE_GAIYO = "230";

    /** ZdZR[h Op@à*/
    public static final String RECEIPT_CODE_GAIYO_IN = "231";

    /** ZdZR[h Op@O*/
    public static final String RECEIPT_CODE_GAIYO_EXT = "232";

     /** ZdZR[h Opï*/
    public static final String RECEIPT_CODE_GAIYO_HOKATSU = "233";

    public static final String YAKUZAI_TOYORYO = "10";          // òÜ^Ê
    public static final String YAKUZAI_TOYORYO_1KAI = "11";	// òÜ^ÊPñ
    public static final String YAKUZAI_TOYORYO_1NICHI = "12";	// òÜ^ÊPú
    public static final String ZAIRYO_KOSU = "21";		// Þ¿Â
    public static final String INJECTION_310 = "310";
    public static final String INJECTION_320 = "320";
    public static final String INJECTION_330 = "330";
    public static final String INJECTION_311 = "311";
    public static final String INJECTION_321 = "321";
    public static final String INJECTION_331 = "331";

    /** èZifÃs×jR[hÌªÔ */
    public static final String SYUGI_CODE_START = "1";

    /** òÜR[hÌªÔ */
    public static final String YAKUZAI_CODE_START = "6";

    /** Þ¿R[hÌªÔ */
    public static final String ZAIRYO_CODE_START = "7";

    /** p@R[hÌªÔ */
    public static final String ADMIN_CODE_START = "001";

    /** úËüÊR[hÌªÔ */
    public static final String RBUI_CODE_START = "002";

    /** @àû */
    public static final String IN_MEDICINE = "@àû";
    
    /** @Oû */
    public static final String EXT_MEDICINE = "@Oû";

    public static final String SLOT_SYUGI = "èZ";
    public static final String SLOT_NAIYO_YAKU = "àpò";
    public static final String SLOT_TYUSHYA_YAKU = "Ëò";
    public static final String SLOT_GAIYO_YAKU = "Opò";
    public static final String SLOT_YAKUZAI = "òÜ";
    public static final String SLOT_MEDICINE = "ò";
    public static final String SLOT_ZAIRYO = "Þ¿";
    public static final String SLOT_YOHO = "p@";
    public static final String SLOT_BUI = "Ê";
    public static final String SLOT_OTHER = "»Ì¼";
    
    public static final String UNIT_T = "ù";
    public static final String UNIT_G = "";
    public static final String UNIT_ML = "k";
    public static final String UNIT_CAPSULE = "JvZ";
}
