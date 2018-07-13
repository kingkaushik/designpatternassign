package SyncDoc;

public class Dermatologist implements AppointmentsBook {
    private String docType="Dermatologist";


    @Override
    public String getDocType() {
        return docType;
    }
}
