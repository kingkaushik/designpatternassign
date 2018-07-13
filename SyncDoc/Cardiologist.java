package SyncDoc;

public class Cardiologist implements AppointmentsBook {

    private String docType="cardiologist";

    @Override
    public String getDocType() {
        return docType;
    }
}
