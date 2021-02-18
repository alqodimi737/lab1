import java.util.Random;
/**
 * Created by hp on 16/02/2021.
 */
public class Rbeated {
    public static void main(String[] args){
        int[] arry={0,1,2,3,4,5,6,7};
        removeElments(arry);
    }
    static void removeElments(int[] arry){
        Random r= new Random();
        while (arry.length>0){
            int index=r.nextInt(arry.length);
            System.out.println("index"+index+"elment"+arry[index]);
            int[] arry1= new int[arry.length-1];
            for (int i=0;i<index;i++)
                arry1[i]=arry[i];
            for (int i=index;i<arry.length-1;i++)
                arry1[i]=arry[i-1];
            arry=arry1;
        }
    }
}
