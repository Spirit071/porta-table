package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static String getNum(int[][] key, char r, char c){
        int row = r - 'a';
        int column = c - 'a';
        int num = key[row][column];
        return String.valueOf(num);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String msg, emsg2, emsg = "";
        char first, second;
        System.out.println("Enter a message to encrypt:");
        msg = in.next();
        emsg2 = "";
        msg = msg.replaceAll(" ", "");
        if (msg.length() % 2 == 1) msg += 'a';
        
        //make a key porta table
        int [][] table = new int[26][26];
        int k = 1;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; 26 > j; j++) {
                table[i][j] = k;
                k++;
            }
        }
        
        
        
        for (int n = 0; n < msg.length(); n+=2) {
            first = msg.charAt(n);
            second = msg.charAt(n+1);
            emsg2 += getNum(table, first, second) + ",";
        }
        
        for (int i = 0; i < emsg2.length() - 1; i++) emsg += emsg2.charAt(i);
      
        System.out.println("The encrypted message is: " + emsg);
        
    }
    
}
