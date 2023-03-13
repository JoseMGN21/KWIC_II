package src;

import java.util.List;

public class Aphabetizer implements IChangeObserver {
   
    @Override
    public void notifyListener(Lines changedLine) {
        if(changedLine.name == "shiftedLines"){
            organizeLines(changedLine.getLines());
        }
    }

    public void organizeLines(List<String> lines){
        for(int i = 1; i < lines.size(); i++) {
            String actual = lines.get(i);
            int j = i - 1;
            
            while(j >= 0 && checkWordOrder(actual, lines.get(j))) {
                lines.set(j+1, lines.get(j));
                j--;
            } 
            
            lines.set(j+1, actual);
        
        }

    if(lines.size() == 1)
        lines.set(0,lines.get(0));
    }

    public boolean checkWordOrder(String actual, String line) {
        int index = 0;
        while(Character.toLowerCase(actual.charAt(index)) == Character.toLowerCase(line.charAt(index)))
            index++;
        if(Character.toLowerCase(actual.charAt(index)) < Character.toLowerCase(line.charAt(index)))
            return true;
        else
            return false;
    }

}