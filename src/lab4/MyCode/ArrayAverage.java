package lab4.MyCode;
import lab4.MyException.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args){
        try{
            String inputFileName = args[0];
            File inFile = new File(inputFileName);
            Scanner input = new Scanner(inFile);
            int result = arrayAverageWorker(input);
            System.out.println(result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please add name of input file to start args");
            String[] newArgs = new String[1];
            newArgs[0] = "input.txt";
            main(newArgs);
        }catch(FileNotFoundException e){
            System.out.println("Input file doesn't exist");
        }catch(ArithmeticException e){
            System.out.println("Not Int Average");
        }catch(CustomDivisionException e){
            System.out.println(e.getMessage());
        }catch(MyException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static int arrayAverageWorker(Scanner input){
        int result=0;
        try{
            int size=0;
            if(input.hasNextInt()){
                size = input.nextInt();
            }else{
                throw new MyException("empty file");
            }
            if(size<0){
                throw new MyException("wrong array size");
            }else if(size>10000){
                throw new MyException("too big array");
            }
            int[] data = new int[size];
            for(int i=0;i<size;i++){
                if(input.hasNextInt()){
                    data[i]=input.nextInt();
                }else{
                    throw new MyException("wrong file: not enough data");
                }
            }
            int sum=0;
            result = arrayAverage(data);
        }catch (Exception e){
            throw new RuntimeException("aAWroker" + e.getMessage());
        }
        return result;
    }
    public static int arrayAverage(int[] data) {
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];
        }
        if(data.length==0){
            throw new CustomDivisionException("ArrayAverage.arrayAverage(69)");
        }
        if(sum%data.length!=0){
            throw new ArithmeticException();
        }
        sum=sum/data.length;
        return sum;
    }
}
