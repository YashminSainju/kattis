import java.util.*;
import java.io.*;
public class pot{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int count = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i = 0; i < count; i++){
            int number = Integer.parseInt(br.readLine());
            int power = number%10;
            int nonPower = number/10;
            total += Math.pow(nonPower, power);
        }
        System.out.println(total);
    }
}