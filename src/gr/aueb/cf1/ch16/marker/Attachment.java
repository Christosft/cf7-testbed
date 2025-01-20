package gr.aueb.cf1.ch16.marker;

public class Attachment extends IArchivable {
    private String filename;
    private String extencion;

    public Attachment() {

    }

    public Attachment(String filename, String extencion) {
        this.filename = filename;
        this.extencion = extencion;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }
}
