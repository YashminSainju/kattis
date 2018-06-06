import java.util.*;
import java.io.*;

public class dprinter{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int n = Integer.parseInt(br.readLine());
        System.out.println((int)Math.ceil(Math.log10(n)/Math.log10(2)) + 1);
    }
}