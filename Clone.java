/**
 * Created by hp on 16/02/2021.
 */
public class Clone {
    public static void main(String[] args){
        int a[]={1,2,3,4};
        int h[]=new int[a.length];
        h=a;
        h[0]++;
        System.out.println("content of a[]");
        for (int i = 0; i < a.length; i++)
        System.out.println( a[i] + " ");
        System.out.println("Contents of b[ ] ");
        for  (int i = 0; i < h.length; i++){
            System.out.println(h[i]+"");
        }
}
}
