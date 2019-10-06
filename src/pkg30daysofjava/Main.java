/**
 * File: Main.java
 * Author: Anthony Francis
 * Date: Oct 5, 2019
 * Purpose:
 */
package pkg30daysofjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner in = new Scanner(new File("Students.txt"));
        
        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
        
        in.close();
    }
}
