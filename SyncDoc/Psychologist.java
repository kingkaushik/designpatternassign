package SyncDoc;

public class Psychologist implements AppointmentsBook {

    private String docType="Psychologist";


    @Override
    public String getDocType() {
        return docType;
    }
}
