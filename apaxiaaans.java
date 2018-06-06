import java.io.*;

public class apaxiaaans{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String line = br.readLine();
        char prev = line.charAt(0);
        String result = "";
        result+=line.charAt(0);
        for(int i = 1; i < line.length(); i++){
            if(line.charAt(i) != prev){
                result+=line.charAt(i);
                prev = line.charAt(i);
            }
        }
        System.out.println(result);
    }

}


