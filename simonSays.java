import java.util.*;
import java.io.*;
public class simonSays{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            String line = br.readLine();
            if (line.startsWith("Simon says")){
                System.out.println(line.substring(10));
            }
        }
    }
}