package jp.ac.uryukyu.ie.e215726;

public class Exercise17_3 {
    public static void main(String[] args){
        try{
            String i = "三";
            Integer.parseInt(i);
        }catch(NumberFormatException e){
            System.out.println(e.getClass().getSimpleName() + "例外をcatchしました");
        }
    }
}
