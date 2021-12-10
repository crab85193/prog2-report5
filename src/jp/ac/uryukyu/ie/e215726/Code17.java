package jp.ac.uryukyu.ie.e215726;

import java.io.*;

public class Code17 {
    public static void main(String[] args){
        FileWriter fw = new FileWriter("data.txt");
        try{
            fw.write("hello!");
        }catch(Exception e){
            System.out.println("エラーです。");
        }finally{
            fw.close();
        }
    }
}
