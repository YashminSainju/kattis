import java.util.*;
import java.io.*;

public class aboveAverage{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            String[] line = br.readLine().split(" ");
            int[] numbers = new int[line.length-1];
            for(int j = 1; j < line.length;j++){
                numbers[j-1] = Integer.parseInt(line[j]);
            }
            int total = 0;
            for(int k = 0; k < numbers.length; k++){
                total+=numbers[k];
            }
            double average = total/numbers.length;
            int result = 0;
            for(int number: numbers){
                if(number > average){
                    result++;
                }
            }
            System.out.format("%.3f", (double) result*100/numbers.length);
            System.out.print("% \n");
        }
    }
}