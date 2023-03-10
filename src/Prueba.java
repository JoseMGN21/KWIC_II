package src;

public class Prueba {
    
    public Prueba() {
    }

    public static void main(String[] args) {

        Prueba ejemoPrueba = new Prueba();

        Lines inputLines = new Lines("inputLines");
    
       // Lines shiftedLines = new Lines("shiftedLines"); 

        ejemoPrueba.readInputs(inputLines);
        ejemoPrueba.alphabetizer(inputLines);
        ejemoPrueba.output(inputLines);
    }

    public void readInputs(Lines inputLines) {

        Input input = new Input();
        
        input.readLines(inputLines);
    }

    public void alphabetizer(Lines inputLines) {
        Aphabetizer order = new Aphabetizer();
        
        order.organizeLines(inputLines.getLines());
    }

    public void output(Lines shiftedLines) {
        Output output = new Output();

        output.printLines(shiftedLines);
    }
    
}
