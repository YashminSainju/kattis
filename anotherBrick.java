import java.util.*;
import java.io.*;

public class anotherBrick{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split(" ");
        int h = Integer.parseInt(line[0]);
        int w = Integer.parseInt(line[1]);
        int n = Integer.parseInt(line[2]);
        String[] input = br.readLine().split(" ");
        int height = 0;
        int width = 0;
        for(int i = 0; i < n; i++){
            int brick = Integer.parseInt(input[i]);
            width+=brick;
            if( width > w ){
                System.out.println("NO");
                return;
            }else if(width == w){
                height++;
                width = 0;
            }
            if(height == h){
                System.out.println("YES");
                return;
            }
        }
    }
}