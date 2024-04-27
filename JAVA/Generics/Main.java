package Generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList newList = new CustomArrayList();
        newList.add("10");
        newList.add("20");
        System.out.println("newList");
        CustomGenList customGen = new CustomGenList<String>();
        customGen.add(2);
        WildCard wc=new WildCard<String>();
        wc.add("2");
        System.out.println(wc);
    }
}
