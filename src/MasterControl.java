import javax.swing.event.ChangeListener;

public class MasterControl{
    public static void main(String[] args) {
        Lines inputLines = new Lines("inputLines");
        Lines shiftedLines = new Lines("shiftedLines");

        ChangeListener shift = new CircularShift();
        ChangeListener order = new Aphabetizer();

        TElement.addChangeObservers(shift);
        TElement.addChangeObservers(order);

        Input input = new Input();
        input.readLines(inputLines);

        Output output = new Output();
        output.printLines(shiftedLines);
    }
}
