package sagor;

import java.util.Scanner;

public class sagor6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("phy");
        int phy = s.nextInt();//88
        System.out.println("che");
        int che = s.nextInt();//95
        System.out.println("bio");
        int bio = s.nextInt();//90
        float avg = ((phy+che+bio)/300f)*100;
        System.out.println("avg: ");
        System.out.println(avg);//91



    }
}
