import java.util.*;

public class ArrayIntersect {
    public static int[] intersect(int[] arr1, int[] arr2)
    {
        if(arr1.length>arr2.length){
            return intersect(arr2,arr1);
        }
        Map<Integer,Integer>  m= new HashMap<Integer,Integer>();
        for(int val:arr1){
            m.put(val,m.getOrDefault(val,0)+1);
        }
        int k=0;
        for(int val:arr2){
            if(m.getOrDefault(val,0)>0){
                arr1[k++]=val;
                m.put(val,m.get(val)-1);
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr1[i];
        }
        return res;
    }
    
  public static void main(String args[])
    {
        int[] arr1={4,7,1,0,9};
        int[] arr2={7,0,8};
    int[] res=intersect(arr1,arr2);
        for(int x:res)
            System.out.print(x+" ");
    }
}