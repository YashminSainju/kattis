import java.util.*;
import java.io.*;

public class alphabetSpam{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String line = br.readLine();
        int space = 0, upper = 0, lower = 0, symbols = 0;
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == 95){
                space++;
            }else if (line.charAt(i) >= 65 && line.charAt(i) <= 90){
                upper++;
            }else if(line.charAt(i) >= 97 && line.charAt(i) <= 122){
                lower++;
            }else{
                symbols++;
            }
        }
        System.out.format("%.6f",(double)space/line.length());
        System.out.println();
        System.out.format("%.6f",(double)lower/line.length());
        System.out.println();
        System.out.format("%.6f",(double)upper/line.length());
        System.out.println();
        System.out.format("%.6f",(double)symbols/line.length());
    }
}


