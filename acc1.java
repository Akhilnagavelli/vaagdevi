import java.util.*;
public class acc1 {
    public static void main(String[] args) {
    
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter H");
        int H=sc.nextInt();
        System.out.println("enter v");
        int v=sc.nextInt();
        System.out.println("enter vn");
        int vn=sc.nextInt();
        int h1 =  (int) (H * Math.pow(v / vn, 2));
        System.out.println(h1);
        


      

    }
    
}
