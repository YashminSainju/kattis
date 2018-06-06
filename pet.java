import java.util.*;
import java.io.*;

public class pet{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int total = 0;
        int index = 0;
        for (int i = 1; i < 6; i++){
            int newTotal = 0;
            String[] scores = br.readLine().split(" ");
            for(String score: scores){
                newTotal += Integer.parseInt(score);
            }
            if(newTotal > total){
                total = newTotal;
                index = i;
            }
        }
        System.out.println(index + " " + total);
    }
}