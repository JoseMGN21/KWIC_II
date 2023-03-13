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
            int index = 0;
            String actual = lines.get(i);
            int j = i - 1;
            

           /*  while(Character.toLowerCase(actual.charAt(index)) == Character.toLowerCase(lines.get(j).charAt(index)))
                    index++;
            while(j >= 0 && Character.toLowerCase(actual.charAt(index)) < Character.toLowerCase(lines.get(j).charAt(index))) {
                lines.set(j+1, lines.get(j));
                j--;
            } */

            while(j >= 0 && Character.toLowerCase(actual.charAt(0)) == Character.toLowerCase(lines.get(j).charAt(0))){
                while(Character.toLowerCase(actual.charAt(index)) == Character.toLowerCase(lines.get(j).charAt(index)))
                    index++;
                while(j >= 0 && Character.toLowerCase(actual.charAt(index)) < Character.toLowerCase(lines.get(j).charAt(index))) {
                lines.set(j+1, lines.get(j));
                j--;
            }
            }
            
            lines.set(j+1, actual);
        
        }

    if(lines.size() == 1)

        lines.set(0,lines.get(0));
    }
    
}