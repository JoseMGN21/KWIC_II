import java.util.ArrayList;

public abstract class TElement extends Object {
    private List changeObservers;
    protected void announceChangeEvent(TElement changedElement) {
        for(ChangeObserver o : changeObservers) {
                o.notify(changedElement);
        }
    }
    public void registerWithChangeEvent(ChangeObserver o) {
        changeObservers.add(o);
    }
}
