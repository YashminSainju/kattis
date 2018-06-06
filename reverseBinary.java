import java.util.*;
import java.io.*;
public class reverseBinary{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String original = Integer.toBinaryString(Integer.parseInt(br.readLine()));
        String reverse  = "";
        int length = original.length();
        for(int i = 0; i < length; i++){
            reverse += original.charAt(length- i - 1);
        }
        int result = Integer.parseInt(reverse,2);
        System.out.println(result);
    }
}