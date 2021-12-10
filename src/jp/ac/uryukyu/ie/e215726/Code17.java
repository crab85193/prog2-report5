package jp.ac.uryukyu.ie.e215726;

import java.io.*;

public class Code17 {
    public static void main(String[] args){
        FileWriter fw = null;
        try{
            fw = new FileWriter("data.txt");
            fw.write("hello!");
        }catch(Exception e){
            System.out.println("エラーです。");
        }
        fw.close();
    }
}
