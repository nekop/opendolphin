package open.dolphin.rest;

import javax.naming.InitialContext;
import open.dolphin.session.*;

/**
 *
 * @author Kazushi Minagawa, Digital Globe, Inc.
 */
public final class EJBLocator {

    //----------------------------------------------------------------------------------------
    private static final String USER_SERVICE    = "java:module/UserServiceBean";
    private static final String STAMP_SERVICE   = "java:module/StampServiceBean";
    private static final String PVT_SERVICE     = "java:module/PVTServiceBean";
    private static final String PATIENT_SERVICE = "java:module/PatientServiceBean";
    private static final String KARTE_SERVICE   = "java:module/KarteServiceBean";
    private static final String NLAB_SERVICE    = "java:module/NLabServiceBean";
    private static final String APPO_SERVICE    = "java:module/AppoServiceBean";
    private static final String LETTER_SERVICE  = "java:module/LetterServiceBean";
    //----------------------------------------------------------------------------------------
    
    private static UserServiceBeanLocal userServiceBeanLocal;
    private static StampServiceBeanLocal stampServiceBeanLocal;
    private static PVTServiceBeanLocal pVTServiceBeanLocal;
    private static PatientServiceBeanLocal patientServiceBeanLocal;
    private static KarteServiceBeanLocal karteServiceBeanLocal;
    private static NLabServiceBeanLocal labServiceBeanLocal;
    private static AppoServiceBeanLocal appoServiceBeanLocal;
    private static LetterServiceBeanLocal letterServiceBeanLocal;

    static {
        try {
            InitialContext ic = new InitialContext();
            userServiceBeanLocal = (UserServiceBeanLocal) ic.lookup(USER_SERVICE);
            stampServiceBeanLocal = (StampServiceBeanLocal) ic.lookup(STAMP_SERVICE);
            pVTServiceBeanLocal = (PVTServiceBeanLocal) ic.lookup(PVT_SERVICE);
            patientServiceBeanLocal = (PatientServiceBeanLocal) ic.lookup(PATIENT_SERVICE);
            karteServiceBeanLocal = (KarteServiceBeanLocal) ic.lookup(KARTE_SERVICE);
            labServiceBeanLocal = (NLabServiceBeanLocal) ic.lookup(NLAB_SERVICE);
            appoServiceBeanLocal = (AppoServiceBeanLocal) ic.lookup(APPO_SERVICE);
            letterServiceBeanLocal = (LetterServiceBeanLocal) ic.lookup(LETTER_SERVICE);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    public static UserServiceBeanLocal getUserServiceBean() {
        return userServiceBeanLocal;
    }

    public static StampServiceBeanLocal getStampServiceBean() {
        return stampServiceBeanLocal;
    }

    public static PVTServiceBeanLocal getPVTServiceBean() {
        return pVTServiceBeanLocal;
    }

    public static PatientServiceBeanLocal getPatientServiceBean() {
        return patientServiceBeanLocal;
    }

    public static KarteServiceBeanLocal getKarteServiceBean() {
        return karteServiceBeanLocal;
    }

    public static NLabServiceBeanLocal getNLabServiceBean() {
        return labServiceBeanLocal;
    }

    public static AppoServiceBeanLocal getAppoServiceBean() {
        return appoServiceBeanLocal;
    }

    public static LetterServiceBeanLocal getLetterServiceBean() {
        return letterServiceBeanLocal;
    }
}
