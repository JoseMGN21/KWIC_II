public class Aphabetizer implements IChangeObserver {
    public void registerWith(TElement element) {
        TElement.registerWithChangeEvent(this);
    }
    public void notify(Lines changedLine) {
        if(changedLine.name == "shiftedLines"){
            // do something
        }
    }
    
}
