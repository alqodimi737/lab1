/**
 * Created by hp on 16/02/2021.
 */
public class Search {

    static int[] array={0,1,2,3,4,5,6,7,8,9,10};
    static public void search(int x){
        int start=0;
        int don=array.length;
        int md=start+((don-start)/2);
        for (int i=md;  i<array.length ;){
            if (x==array[i]){
                System.out.println("x = [" + array[i] + "]");break;
            }
            else if (x>array[i]){
                start=md+1;
                md=start+((don-start)/2);
                i=md;
            }
            else if (x<array[i]){
                don=md-1;
                md=start+((don-start)/2);
                i=md;
            }
        }
    }
    public static void main(String[]args){
        search(4);
    }
}
