package jp.ac.uryukyu.ie.e215726;

public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch(NullPointerException e){
            System.out.println(e.getClass().getSimpleName() + "が発生");
            System.out.println("-----MESSAGE-----");
            System.out.println(e.getMessage());
        }
    }
}
