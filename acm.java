import java.util.*;
import java.io.*;

public class acm{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split(" ");
        String wrong = "";
        int right = 0;
        int score = 0;
        while (line.length > 1){
            if(wrong.contains(line[1]) && line[2].equals("right")){
                score += count(line[1].charAt(0),wrong)*20;
                score += Integer.parseInt(line[0]);
                right++;
            }else if (line[2].equals("right")){
                score+= Integer.parseInt(line[0]);
                right++;
            }else{
                wrong += line[1];
            }
            line = br.readLine().split(" ");
        }
        System.out.println(right + " " + score);
    }
    static int count(char c, String word){
        int result = 0;
        for(int i = 0; i < word.length(); i++){
            if(c == word.charAt(i)){
                result++;
            }
        }
        return result;
    }
}


