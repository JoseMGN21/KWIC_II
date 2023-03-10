package src;

import java.util.ArrayList;
import java.util.List;

public class Lines {

    private String name;
    List<String> lines = new ArrayList<String>();

    public Lines(String name) {
        this.name = name;
    }

    public void storageLines(String line){
        lines.add(line);

    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }
    
}
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