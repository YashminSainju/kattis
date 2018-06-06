import java.util.*;
import java.io.*;
public class eightQueens{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int[][] admatrix = new int[8][8];
        int total = 0;
        for(int i = 0; i < 8; i++){
            String row = br.readLine();
            for (int j = 0; j < 8; j++){
                if (row.charAt(j) == '*'){
                    admatrix[i][j] = 1;
                    total++;
                }else{
                    admatrix[i][j] = 0;
                }
            }
        }
        if(total != 8){
            System.out.println("invalid");
            return;
        }
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (admatrix[i][j] == 1){
                    if(!canMove(i,j,admatrix)){
                        System.out.println("invalid");
                        return;
                    }
                }
            }
        }
        System.out.println("valid");
    }
    public static boolean canMove(int x, int y, int[][] board){
        for(int i = 0; i < 8; i++){
            if (board[i][y] == 1 && i != x){
                return false;
            }
        }
        for (int j = 0; j < 8; j++){
            if(board[x][j] == 1 && j != y){
                return false;
            }
        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j <8; j++){
                if(( x != i) && (y != j) && (i == -j+x+y || i == j-y+x)){
                    if(board[i][j] == 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}