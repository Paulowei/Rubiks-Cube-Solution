import java.util.Map;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.StringBuffer;
import java.security.AuthProvider;
import java.net.HttpCookie;
import java.util.List;
public class TestClass1{

    //public Integer var1;
    public String str1;
    public Integer[] array1;
    public LinkedList<HttpCookie> arr1;
    //public Object[] obj;
    public TestClass1(){

    }
    public TestClass1(String  str,int[] arr,List<HttpCookie> list1){
        str1 = str;
        for(int i=0;i<arr.length;i++){
            intArray1[i]=Integer.valueOf(arr[i]);
        }
        obj1 = new LinkedList<HttpCookie>(list1);
    }
    public static void main(){

    }
    public int[] rand(int[][] a,int[][] d,int[][] plea){
        int n = a.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                d[i][j]=a[i][j];
                plea[i][j]=-1;
            }
        }
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                for(int m=0;m<n;m++){
                    if(d[l][k]<d[l][m]+d[m][k]){
                        d[l][k]=d[l][m]+d[m][k];
                        plea[l][m]=d[l][k];
                    }
                }
            }
        }
        return plea;
    }
}