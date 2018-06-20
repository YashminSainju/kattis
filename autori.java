import java.io.*;

public class autori{
    public static void main (String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split("-");
        for(String word:line){
            System.out.print(word.charAt(0));
        }
    }
} 