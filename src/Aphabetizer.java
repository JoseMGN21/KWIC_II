package src;

import java.util.List;

public class Aphabetizer implements IChangeObserver {
    /*public void registerWith(TElement element) {
        TElement.registerWithChangeEvent(this);
    }*/
    @Override
    public void notifyListener(Lines changedLine) {
        if(changedLine.name == "shiftedLines"){
            organizeLines(changedLine.getLines());
        }
    }

    public void organizeLines(List<String> lines){
        for(int i = 1; i < lines.size(); i++) {
            int index = 0;
            String actual = lines.get(i);
            int j = i - 1;
            
            while(actual.charAt(index) == lines.get(j).charAt(index))
                    index++;
            while(j >= 0 && actual.charAt(index) < lines.get(j).charAt(index)) {
                lines.set(j+1, lines.get(j));
                j--;
            }
            
            lines.set(j+1, actual);
        
        }
    if(lines.size() == 1)
        lines.set(0,lines.get(0));
    }
    
}