/**
 * Created by hp on 16/02/2021.
 */
public class Mergin {
    static int[] x={3,5,7,9};
    static int[] z={1,2,3,4,5};
    static int[] p=new int[8];
    static public void margen(){
        int s=z.length;
        for (int i; i<x.length;i++){
            p[i]=x[i];
            p[i]=z[i];
            s++;
        }
        for (int i=0; i<8;i++){
            System.out.println("array:"+p[i]);
        }
    }
    public static void main(String[] args){
        margen();
    }
}
