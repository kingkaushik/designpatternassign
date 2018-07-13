package SyncDoc;

public class Gynecologist implements AppointmentsBook {

    private String docType="gynecologist";

    @Override
    public String getDocType() {
        return docType;
    }
}
