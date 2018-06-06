import java.util.*;
import java.io.*;
public class bijele{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int[] original = {1, 1, 2, 2, 2, 8};
        String[] input = (br.readLine()).split(" ");
        for(int i = 0; i < 6; i++){
            System.out.print(original[i] - Integer.parseInt(input[i]) + " ");
        }
    }
}