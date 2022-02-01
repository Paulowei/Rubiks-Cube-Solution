package com.moderneinstein.core.cube;
import java.util.Map;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.StringBuffer;
import java.security.AuthProvider;
import java.net.HttpCookie;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeMap; 
import java.awt.Color;
import java.lang.Integer;
public class TestClass1{

    //public Integer var1;
    public Object obj1;
    public String str1;
    public Integer[] array1;
    public LinkedList<HttpCookie> arr1;
    public TreeMap<Color,int[]> map1;
    public static TreeMap<Color,double[]> map;
    //public Object[] obj;
    public TestClass1(){
        this(null,null,null);
    }
    public void treeMapInit(){
        map.put(new Color(1,0,0),new double[]{1.0,0.0,0.0});
        map.put(new Color(0,1,0),new double[]{0.0,1.0,0.0});
        map.put(new Color(0,0,1),new double[]{0.0,0.0,1.0});
    }
    public TestClass1(Map<Color,double[]> map,Object obj,String  str,int[] arr,List<HttpCookie> list1){
        map1 = new TreeMap<Color,map>(map);
        obj1 = obj ;
        str1 = str;
        array1 = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            array1[i]=Integer.valueOf(arr[i]);
        }
        obj1 = new LinkedList<HttpCookie>(list1);
    }
    public static void main(){

    }
    public int[][] rand(int[][] a,int[][] d,int[][] plea){
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