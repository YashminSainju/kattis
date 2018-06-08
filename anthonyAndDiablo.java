import java.util.*;
import java.io.*;

public class anthonyAndDiablo{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split(" ");
        double area = Double.parseDouble(line[0]);
        double perimeter = Double.parseDouble(line[1]);

        System.out.println(Math.pow(perimeter*7/44,2)*22/7 >= area ? "Diablo is happy!" : "Need more materials!");
    }
}