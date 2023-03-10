package src;

public class Prueba {
    
    public Prueba() {
    }

    public static void main(String[] args) {

        Prueba ejemploPrueba = new Prueba();

        Lines inputLines = new Lines("inputLines");
    
        Lines shiftedLines = new Lines("shiftedLines"); 

        
        ejemploPrueba.readInputs(inputLines);
       // ejemploPrueba.alphabetizer(inputLines);
        ejemploPrueba.circularShift(inputLines, shiftedLines);
        ejemploPrueba.output(shiftedLines);
    }

    public void readInputs(Lines inputLines) {

        Input input = new Input();
        
        input.readLines(inputLines);
    }

    public void circularShift(Lines inputLines, Lines shiftedLines) {
        CircularShift shift = new CircularShift();
        TElement.addChangeObservers(shift);
        shift.circularShift(inputLines, shiftedLines);
    }

    public void alphabetizer(Lines inputLines) {
        Aphabetizer order = new Aphabetizer();
        TElement.addChangeObservers(order);
        order.organizeLines(inputLines.getLines());
    }

    public void output(Lines shiftedLines) {
        Output output = new Output();

        output.printLines(shiftedLines);
    }
    
}
