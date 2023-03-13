package src;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ChangeListener;

public abstract class TElement extends Object {
    private static List<IChangeObserver> changeObservers = new ArrayList<>();
    protected void announceChangeEvent(Lines changedElement) {
        for(IChangeObserver o : changeObservers) {
                o.notifyListener(changedElement);
        }
    }
    public void registerWithChangeEvent(IChangeObserver o) {
        changeObservers.add(o);
    }
    public static void addChangeObservers(IChangeObserver o){
        changeObservers.add(o);
    }
}
