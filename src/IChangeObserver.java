public interface IChangeObserver{
    void registerWith(TElement element);
    void notify(Lines changedLine);
}