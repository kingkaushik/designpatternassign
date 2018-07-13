package SyncDoc;

public class Gerontologist implements AppointmentsBook {

    private String docType="gerontologist";


    @Override
    public String getDocType() {
        return docType;
    }
}
