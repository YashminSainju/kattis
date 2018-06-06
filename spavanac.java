import java.util.*;
import java.io.*;
public class spavanac{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] time = (br.readLine()).split(" ");
        int hour = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int result = hour*60+minutes - 45;
        hour = (result/60) % 23;
        minutes = result%60;
        if(minutes < 0){
            minutes = 60 + minutes;
            hour = 24 - hour - 1;
        }
        System.out.println(hour + " " + minutes);
    }
}