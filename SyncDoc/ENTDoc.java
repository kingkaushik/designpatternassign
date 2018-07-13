package SyncDoc;

public class ENTDoc implements AppointmentsBook {

    private String docType="ent";



    @Override
    public String getDocType() {
        return docType;
    }
}
