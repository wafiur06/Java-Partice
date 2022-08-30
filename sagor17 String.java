package sagor;

public class sagor4 {
    public static void main(String[] args) {
       String s = "sagor";
      String s = "wafi";
      int b = s.length();
        System.out.println(b);
        String e = s.toLowerCase();
        System.out.println(e);
        String t = s.toUpperCase();
        System.out.println(t);
        String non = "     Wafiur      ";
        System.out.println(non);
        System.out.println(non.trim());
        System.out.println(s.substring(2));
        System.out.println(s.substring(1,3));
        System.out.println(s.replace('s','p'));
        System.out.println(s.replace("gor","pon"));
        System.out.println(s.startsWith("sagor"));
        System.out.println(s.endsWith("or"));
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf("gor"));*
        String i = "sagorgor";
        System.out.println(i.indexOf("gor"));
        System.out.println(i.indexOf("gor",2));
        System.out.println(i.lastIndexOf("or",3));
        


    }
}
