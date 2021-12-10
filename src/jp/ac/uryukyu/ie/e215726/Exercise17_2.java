package jp.ac.uryukyu.ie.e215726;

public class Exercise17_2 {
    public static void main(String[] args){
        try{
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException 例外をcatchしました");
            System.out.println("--スタックトレース（ここから）--");
            e.printStackTrace();
            System.out.println("--スタックトレース（ここまで）--");
        }

    }
}
