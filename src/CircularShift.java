public class CircularShift implements IChangeObserver {
    public void registerWith(TElement element) {
        TElement.registerWithChangeEvent(this);
    }
    public void notify(Lines changedLine) {
        if(changedLine.name == "inputLines") {
            // do something
        }
    }
}