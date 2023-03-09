package src;

import java.util.Scanner;

public class Input {

    public Input() {
    }

    public void readLines (Lines inputLines){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las lineas de texto (para terminar introduce una linea vacia):");

        String line = scanner.nextLine();

        while (!line.isEmpty()){

            inputLines.storageLines(line);

            line = scanner.nextLine();

        }

        scanner.close();

    }
    
}
