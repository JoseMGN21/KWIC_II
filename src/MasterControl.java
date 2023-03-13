package src;

public class MasterControl{
    public static Lines shiftedLines;
    public static Lines inputLines;

    public static void main(String[] args) {
        inputLines = new Lines("inputLines");
        shiftedLines = new Lines("shiftedLines");

        IChangeObserver shift = new CircularShift();
        IChangeObserver order = new Aphabetizer();

        TElement.addChangeObservers(shift);
        TElement.addChangeObservers(order);

        Input input = new Input();
        input.readLines(inputLines);

        Output output = new Output();
        output.printLines(shiftedLines);
    }
}
