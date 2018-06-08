import java.util.*;
import java.io.*;

public class hissingMicrophone{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String line = br.readLine();
        for(int i = 0; i < line.length()-1; i++){
            if(line.charAt(i) == 's' && line.charAt(i+1) == 's'){
                System.out.println("hiss");
                return;
            }
        }
        System.out.println("no hiss");
    }
}