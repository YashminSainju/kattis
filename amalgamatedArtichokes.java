import java.util.*;
import java.io.*;

public class amalgamatedArtichokes{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split(" ");
        int p = Integer.parseInt(line[0]);
        int a = Integer.parseInt(line[1]);
        int b = Integer.parseInt(line[2]);
        int c = Integer.parseInt(line[3]);
        int d = Integer.parseInt(line[4]);
        int n = Integer.parseInt(line[5]);

        double max = 0;
        double maxLoss = 0;

        for (int i = 1; i < n + 1; i++){
            double price = p * (Math.sin(a*i + b) + Math.cos(c*i + d) + 2);
            if(maxLoss < max - price){
                maxLoss = max - price;
            }
            if(price > max){
                max = price;
            }
        }

        System.out.format("%6f",maxLoss);
    }
} 