public class Lines extends TElement {
    private String name;
    public Line(String line) {
        this.line = line;
    }
    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
        announceChangeEvent(this);
    }
}