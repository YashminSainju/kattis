import java.util.*;
import java.io.*;

public class tetration{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        double n = Double.parseDouble(br.readLine());
        System.out.format("%.6f", Math.pow(n , 1/n));
    }
}