package org.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        /* ----------- (1) create a file ----------- */
    try {
        File file = new File("myfile.txt");
        if (file.createNewFile()){
            System.out.println("file Created : " + file.getName());
        }
    }catch(IOException e) {
        System.out.println("An error has occured.");
        e.printStackTrace();
        }
        System.out.println("--------------------------");

    /* ----------- (2) writing in a file ----------- */
    try {
        FileWriter Writer = new FileWriter("myfile.txt");
        Writer.write("this is my first file\n");
        Writer.close();
        System.out.println("successfully written");
    }catch(IOException e){
        System.out.println("An error has occured.");
        e.printStackTrace();
    }
    System.out.println("--------------------------");

    /* ----------- (3) read the file ----------- */
        try{
            File file = new File("myfile.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println("Read the content of file : ");
                System.out.println(data);
            }
            System.out.println("--------------------------");
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("An error has occured");
            e.printStackTrace();

        }

        /*  ----------- (4) modify the file --------------  */

        String data = "this data is appended";
             //append the file
        try {
            FileWriter output = new FileWriter("myfile.txt",true);
            output.write(data);
            System.out.println("data appended successfully");
            output.close();
        }catch (IOException e){
            System.out.println("An error has occured");
        }
             //delete the file
        File file = new File("myfile.txt");
        if (file.delete()){
            System.out.println("File deleted successfully");
        }else {
            System.out.println("Failed to delete a file.");
        }


    }
}
