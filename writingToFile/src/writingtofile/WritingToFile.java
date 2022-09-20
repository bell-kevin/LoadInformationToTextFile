/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingtofile;

import java.io.*;
import java.util.*;

/**
 *
 * @author 4800590195
 */
public class WritingToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File outputFile = new File("newScores.txt");
        FileWriter out;
        BufferedWriter writeFile;
        Scanner stdIn = new Scanner(System.in);
        String name;
        double score;
        try {
            out = new FileWriter(outputFile);
            writeFile = new BufferedWriter(out);
            for (int k = 0; k < 5; k++) {
                System.out.print("Enter student name: ");
                name = stdIn.next();
                writeFile.write(name);
                writeFile.newLine();
                System.out.print("Enter test score: ");
                score = stdIn.nextDouble();
                writeFile.write(String.valueOf(score));
                writeFile.newLine();
            }
            writeFile.close();
            out.close();
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Problem writing to file.");
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
