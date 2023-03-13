package src;

public interface IChangeObserver{
    //void registerWith(TElement element);
    void notifyListener(Lines changedLine);
}