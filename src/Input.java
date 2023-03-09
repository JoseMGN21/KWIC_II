package src;

import java.util.Scanner;

public class Input {


    public void readLines (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las lineas de texto (para terminar introduce una linea vacia):");
        
        Lines inputLines = new Lines("inputLines");

        String line = scanner.nextLine();

        while (!line.isEmpty()){

            inputLines.storageLines(line);

            line = scanner.nextLine();

        }

        scanner.close();

    }
    
}
