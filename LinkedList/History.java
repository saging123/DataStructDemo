// Singly Linked List
public class History {
    private String url;
    public History next;

    // constructor
    public History() {
        this.url = "";
        this.next = null;
    }
    public History(String url) {
        this.url = url;
        this.next = null;
    }
    public History(String url, History next) {
        this.url = url;
        this.next = next;
    }
    public void setUrl(String url) {
        // validation
        // should have no Special Charactyer except .,:,/ 
        this.url = url;
    }

    public String getUrl() {
        // formatting
        return url;
    }

}
