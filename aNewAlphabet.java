import java.util.*;
import java.io.*;

public class aNewAlphabet{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        Hashtable<String, String> h = new Hashtable <String,String>();
        h.put("a", "@");
        h.put("b", "8");
        h.put("c", "(");
        h.put("d", "|)");
        h.put("e", "3");
        h.put("f", "#");
        h.put("g", "6");
        h.put("h", "[-]");
        h.put("i", "|");
        h.put("j", "_|");
        h.put("k", "|<");
        h.put("l", "1");
        h.put("m", "[]\\/[]");
        h.put("n", "[]\\[]");
        h.put("o", "0");
        h.put("p", "|D");
        h.put("q", "(,)");
        h.put("r", "|Z");
        h.put("s", "$");
        h.put("t", "']['");
        h.put("u", "|_|");
        h.put("v", "\\/");
        h.put("w", "\\/\\/");
        h.put("x", "}{");
        h.put("y", "`/");
        h.put("z", "2");

        String line = br.readLine();
        String result = "";
        for(int i = 0; i < line.length(); i++){
            if(h.containsKey(Character.toString(line.charAt(i)).toLowerCase())){
                result+=h.get(Character.toString(line.charAt(i)).toLowerCase());
            }else{
                result+=line.charAt(i);
            }
        }
        System.out.println(result);
    }

}


