import java.util.*;
import java.io.*;
public class coldputerScience{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        br.readLine();
        String[] temp = br.readLine().split(" ");
        int total = 0;
        for(int i = 0; i < temp.length; i++){
            if(Integer.parseInt(temp[i]) < 0){
                total++;
            }
        }
        System.out.println(total);
    }
}