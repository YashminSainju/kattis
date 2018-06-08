import java.util.*;
import java.io.*;

public class diceCup{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);

        int max = Math.max(x,y);
        int min = Math.min(x,y);

        for(int i = min+1; i < max + 2; i++){
            System.out.println(i);
        }
    }
}