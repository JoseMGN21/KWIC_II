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
    
}
