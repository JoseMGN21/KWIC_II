public class CircularShift implements IChangeObserver {
    public void registerWith(TElement element) {
        TElement.registerWithChangeEvent(this);
    }
    public void notify(Lines changedLine) {
        if(changedLine.name == "inputLines") {
            CircularShift(changedLine);
        }
    }

    public void circularShift(Lines inputLines) {
        for(int i = 0; i < inputLines.getLines().size(); i++) {
            String line = inputLines.getLines().get(i);
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
                shiftedLines.storageLines(newLine);
            }
        }
    }
}