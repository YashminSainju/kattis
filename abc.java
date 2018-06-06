import java.util.*;
import java.io.*;

public class abc{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split(" ");
        int[] numbers = {Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])};
        String[] order = br.readLine().split("");
        Arrays.sort(numbers);
        String result = "";
        for(String letter : order){
            if(letter.equals("A")){
                result+=Integer.toString(numbers[0]) + " ";
            }else if(letter.equals("B")){
                result+= Integer.toString(numbers[1]) + " ";
            }else{
                result+= Integer.toString(numbers[2]) + " ";
            }
        }
        System.out.println(result);

    }
}