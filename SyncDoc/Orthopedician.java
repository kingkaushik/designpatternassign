package SyncDoc;

public class Orthopedician implements AppointmentsBook {

    private String docType="Orthopedician";

    @Override
    public String getDocType() {
        return docType;
    }
}
