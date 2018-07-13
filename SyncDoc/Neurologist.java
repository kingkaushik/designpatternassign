package SyncDoc;

public class Neurologist implements AppointmentsBook {

    private String docType="Neurologist";

    @Override
    public String getDocType() {
        return docType;
    }
}
