import java.util.*;
import java.io.*;

public class acikja{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int count = Integer.parseInt(br.readLine());
        int[] prices = new int[count];
        for(int i = 0; i < count; i++){
            prices[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(prices);
        int[] descend = new int[count];
        for (int i = count-1; i >= 0; i--){
            descend[count-1-i] = prices[i];
        }

        int total = 0;
        for(int i = 0; i < count; i++){
            if((i+1) % 3  > 0){
                total+= descend[i];
            }
        }
        System.out.println(total);
    }
}


