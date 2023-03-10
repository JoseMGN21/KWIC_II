package src;

public class CircularShift {

    public CircularShift() {
    }

    public String circularShift(String line) {
            String[] words = line.split(" ");
            String newLine = "";
            for(int j = 0; j < words.length; j++) {
                newLine = "";
                for(int k = j; k < words.length; k++) {
                    newLine += words[k] + " ";
                }
                for(int k = 0; k < j; k++) {
                    newLine += words[k] + " ";
                }
            }
            return newLine;
    }

    public void addLineShifted(String Line){
        shiftedLines.storageLines(Line);
    }




    
    
}
