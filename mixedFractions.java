import java.io.*;

public class mixedFractions{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
        while(x!= 0){
            int quotient = x / y;
            int remainder = x % y;
            System.out.println(quotient + " " + remainder + " / " + y);
            line = br.readLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);
        }
    }

}


