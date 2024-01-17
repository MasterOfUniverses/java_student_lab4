package lab4.MyCode;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class CopyFiels {
    public static void main(String[] args){
        try{
            String inputFileName = "input.txt";
            String outputFileName = "output.txt";
            File inputFile = new File(inputFileName);
            Scanner input = new Scanner(inputFile);
            PrintWriter output = new PrintWriter(outputFileName);
            int countLines=0;
            while(input.hasNextLine()){
                output.println(input.nextLine());
                countLines++;
            }
            System.out.println(countLines);
            output.close();
        }catch (FileNotFoundException e){
            System.out.println("no input file");
            e.printStackTrace();
        }catch(SecurityException e){
            System.out.println("can access input or output file");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("unexpectable io exception");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("unexpectable not-io exception");
            e.printStackTrace();
        }
    }
}
