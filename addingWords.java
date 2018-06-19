import java.util.*;
import java.io.*;

public class addingWords{
    public static void main (String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        Hashtable<String,Integer> h = new Hashtable<String,Integer>();

        try{

            while (true){

                String line = br.readLine();

                if(line.equals("clear")){
                    h = new Hashtable<String,Integer>();
                }else{
                    String[] words = line.split(" ");

                    if(words[0].equals("def")){
                        h.put(words[1],Integer.parseInt(words[2]));
                    }else if (words[0].equals("calc")){
                        int result = 0;
                        boolean valid = true;
                        boolean add = true;

                        for(int i = 1; i < words.length-1; i = i + 2){
                            if(h.containsKey(words[i])){
                                result = add ? result + h.get(words[i]) : result - h.get(words[i]);
                                add = words[i+1].equals("+");
                            }else{
                                valid = false;
                                break;
                            }
                        }

                        System.out.print(line.substring(5) + " ");

                        if(h.contains(result) && valid){
                            Set<String> keySet = h.keySet();
                            for(String key: keySet){
                                if(result == h.get(key)){
                                    System.out.print(key + "\n");
                                    break;
                                }
                            }
                        }else{
                            System.out.print("unknown\n");
                        }
                    }
                }
            }
        }catch(Exception e){}
    }
} 