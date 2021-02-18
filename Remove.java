import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**

 */
public class Remove {
   public static int[ ] removtheElment(int[ ] aray,int index)  {

       if (aray == null || index<0 ||index>= aray.length){
           return aray;
       }
       List<Integer>arrayList = IntStream.of(aray).boxed().collect(Collectors.toList());
       arrayList.remove(index);
       return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args){
        int[] ary={10,20,30,40,50};
        System.out.println(Arrays.toString(ary));
        int index =2;
        System.out.println("index the remove"+index);
        ary= removtheElment(ary,index);
        System.out.println(Arrays.toString(ary));
    }
    }
