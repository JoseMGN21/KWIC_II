package src;

public class Prueba {
    
    public Prueba() {
    }

    public static void main(String[] args) {

        Prueba ejemoPrueba = new Prueba();

        Lines inputLines = new Lines("inputLines");
    
        Lines shiftedLines = new Lines("shiftedLines"); 

        CircularShift shift = new CircularShift();

        Aphabetizer order = new Aphabetizer();
        
        ejemoPrueba.readInputs(inputLines);
        ejemoPrueba.output(shiftedLines);
    }

    public void readInputs(Lines inputLines) {

        Input input = new Input();
        
        input.readLines(inputLines);
    }

    public void output(Lines shiftedLines) {
        Output output = new Output();

        output.printLines(shiftedLines);
    }
    
}
