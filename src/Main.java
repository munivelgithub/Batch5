import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
//        Map<Integer,String> a=new HashMap();
//        a.put(1,"velu");
//        //System.out.println(a.hashCode());
//        a.put(2,"VELU");
//        //System.out.println(a.hashCode());
//        System.out.println(a.size());
//        System.out.println(a);
//        //keyExistOrNot(a,"velu");
//        String s = new String("Muni");
       // System.out.println(ClassLayout.parseInstance(s).toPrintable());
        //StringClass.removingspaces();
        //vowels("vijay");
        String a="Vijay ";

        System.out.println(a.toLowerCase());
        char b[]=a.toCharArray();
        System.out.println(a.toUpperCase());
        System.out.println(a.indexOf('i'));
        System.out.println(a.length());
        a=a.trim();
        System.out.println(a.length());

        StringBuilder builder=new StringBuilder();
        builder.append("Ajith");
     builder.reverse();
        System.out.println(builder);


    }

























    public static void keyExistOrNot(Map map,String value){
        // strign is an mutails
        /**
         * jhvjhvjl
         * kgvkjv
         * kjvkjv
         * mjhjvjhvjhvhvhbbmbmhvb
         */

        boolean contain=map.containsValue(value);
        if(contain){
            System.out.println("value is contain");
        }else {
            System.out.println("not contain");
        }
    }
    public static void vowels(String name){
        String v="aeiouAEIOU";
        String r="";//i
        for(int i=0;i<name.length();i++){// vijay
            char a=name.charAt(i);// a
            if(v.indexOf(a)!= -1){  // a 0!=-1
                r=r+a;
            }
        }
        System.out.println(r);
    }
}
