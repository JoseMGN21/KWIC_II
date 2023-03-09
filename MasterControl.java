public abstract class MasterControl extends Object {
    private List changeObservers;
    protected void announceChangeEvent(Component changedLine) {
        for(ChangeObserver o : changeObservers) {
            o.notify(changedLine);
        }
    }
    public void registerWithChangeEvent(ChangeObserver o) {
        changeObservers.add(o);
    }
}
