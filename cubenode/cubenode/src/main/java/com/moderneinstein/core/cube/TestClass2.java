package com.moderneinstein.core.cube;
import java.util.Map;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.StringBuffer;
import java.net.HttpCookie;
import java.util.TreeMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.SortedMap;
import java.util.TreeMap;
import java.awt.Color;
public class TestClass2{
    public Object obj2;
    public StringBuffer str2;
    public Double[] array2;
    public ArrayList<HttpCookie> arr2;
    public TreeMap<Color,int[]> map2;
    //public EnumMap<HttpCookie,String> enumMap;
    public TestClass2(){
        this(null,null,null,null,null);
    }
    //public Double var2;
    //public HttpCookie
    public TestClass2(Map<Color,int[]> map,Object obj1,String str,double[] arr, List<HttpCookie> list1){
        map2 = new TreeMap<Color,int[]>(map);
        obj1 = obj;
        str  = new StringBuffer(str);
        array2 = new Double[arr.length];
        for(int i = 0;i<arr.lenght;i++){
            array2[i] = Double.valueOf(arr[i]);
        }
        arr2 = new ArrayList<HttpCookie>(list1);
    }
    public static void main(String[] args){
        
    }
}