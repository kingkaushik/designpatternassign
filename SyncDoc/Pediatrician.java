package SyncDoc;

public class Pediatrician implements AppointmentsBook {

    private String docType="Pediatrician";

    @Override
    public String getDocType() {
        return docType;
    }
}
