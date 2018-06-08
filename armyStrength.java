import java.util.*;
import java.io.*;

public class armyStrength{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            String line = br.readLine();
            if(line.length() < 1){
                line = br.readLine();
            }
            String[] numbers = line.split(" ");
            int g = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);

            String[] gline = br.readLine().split(" ");
            Stack<Integer> gArmy = new Stack<Integer>();
            for(int j = 0; j < g; j++){
                gArmy.push(Integer.parseInt(gline[j]));
            }

            String[] mline = br.readLine().split(" ");
            Stack<Integer> mArmy = new Stack<Integer>();
            for(int j = 0; j < m; j++){
                mArmy.push(Integer.parseInt(mline[j]));
            }

            while(!gArmy.isEmpty() && !mArmy.isEmpty()){
                if(gArmy.peek() >= mArmy.peek()){
                    mArmy.pop();
                }else{
                    gArmy.pop();
                }
            }

            System.out.println(gArmy.isEmpty() ? "MechaGodzilla" : "Godzilla");

        }
    }
}