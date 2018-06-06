import java.util.*;
import java.io.*;

public class faktor{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] line = br.readLine().split(" ");
        int articles = Integer.parseInt(line[0]);
        double impact = Integer.parseInt(line[1]) - 0.99;
        System.out.println((int)Math.ceil(articles*impact));
    }
}