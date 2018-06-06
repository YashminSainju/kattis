import java.util.*;
import java.io.*;
public class r2{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] both = br.readLine().split(" ");
        System.out.println(2*Integer.parseInt(both[1])-Integer.parseInt(both[0]));
    }
}