package src;

import java.util.List;

public class Aphabetizer implements IChangeObserver {
    public void registerWith(TElement element) {
        TElement.registerWithChangeEvent(this);
    }
    public void notify(Lines changedLine) {
        if(changedLine.name == "shiftedLines"){
            // do something
        }
    }

    public void organizeLines(List<String> lines){
        for(int i = 1; i < lines.size(); i++) {
            String actual = lines.get(i);
            int j = i - 1;
            
            while(j >= 0 && actual.charAt(0) < lines.get(j).charAt(0)) {
                lines.set(j+1, lines.get(j));
                j--;
            }
            
            lines.set(j+1, actual);
        
        }
    
    }
    
}