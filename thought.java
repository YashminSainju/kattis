import java.util.*;
import java.io.*;

public class thought{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int[] poss = {16,8,1,0};
        Hashtable<Integer,String> h = new Hashtable<Integer,String>();
        h.put(16,"4 * 4");
        h.put(8,"4 + 4");
        h.put(1,"4 / 4");
        h.put(0,"4 - 4");
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        for(int number : poss){
            for(int pos : poss){
                ht.put(pos + number, h.get(pos)+ " + " + h.get(number));
                if (number != 0 && number != 8 && !ht.containsKey(pos-number)){ht.put(pos - number, h.get(pos)+ " - " + h.get(number));}
            }
            if(!ht.containsKey(256)){ ht.put(216,"4 * 4 * 4 * 4");}
            if(!ht.containsKey(68)){ht.put(68,"4 * 4 * 4 + 4");}
            if(!ht.containsKey(16)){ht.put(16,"4 * 4 * 4 / 4");}
            if(!ht.containsKey(60)){ht.put(60,"4 * 4 * 4 - 4");}
            if(!ht.containsKey(8)){ht.put(8,"4 + 4 * 4 / 4");}
            if(!ht.containsKey(24)){ht.put(24,"4 + 4 * 4 + 4");}
            if(!ht.containsKey(1)){ht.put(1,"4 / 4 * 4 / 4");}
            if(!ht.containsKey(-60)){ht.put(-60,"4 - 4 * 4 * 4");}
            if(!ht.containsKey(-8)){ht.put(-8,"4 - 4 * 4 + 4");}
            if(!ht.containsKey(-16)){ht.put(-16,"4 - 4 * 4 - 4");}
            if(!ht.containsKey(7)){ht.put(7,"4 - 4 / 4 + 4");}
            if(!ht.containsKey(-1)){ht.put(-1,"4 - 4 / 4 - 4");}
            if(!ht.containsKey(9)){ht.put(9,"4 + 4 / 4 + 4");}
            if(!ht.containsKey(4)){ht.put(4,"4 + 4 / 4 / 4");}
            if(!ht.containsKey(-4)){ht.put(-4,"4 / 4 / 4 - 4");}

        }

        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            int number = Integer.parseInt(br.readLine());
            if (number <= 256){
                if(ht.containsKey(number)){
                    System.out.println(ht.get(number)+" = "+number);
                } else{
                    System.out.println("no solution");
                }
            }else {
                System.out.println("no solution");
            }

        }
    }
}
