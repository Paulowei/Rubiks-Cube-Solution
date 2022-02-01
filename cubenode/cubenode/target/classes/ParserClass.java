package com.moderneinstein.core.cube;
//import com.moderneinstein.core.cube.TestClass1;
//import com.moderneinstein.core.cube.TestClass2;
import java.util.Arrays;
//import jdk.internal.util.ArraysSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.spi.*;
import java.net.HttpCookie;
import java.security.AlgorithmParameterGenerator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.EnumMap;
import java.util.Iterator;
public class ParserClass{
    public ParserClass(){
        System.out.println("ParserClass Object Created");
    }
    public static TestClass2 parse1(TestClass1 class1){
        TestClass2 class2 = new TestClass2();
        class2.obj = new Object();
        class2.obj2 = class1.obj1;
        class2.str2 = new StringBuffer(class1.str1);
        class2.array2 = new Double[class1.array1.length];
        for(int i = 0;i<class1.array1.length;i++){
            class2.array2[i] = Double.parseDouble
            (Integer.toString(class1.array1[i]));
            //class2.array2[i] = (Double)(class1.array1[i])
        }
        class2.arr2 = new ArrayList<HttpCookie>();
        Iterator<HttpCookie> itr = class1.arr1.iterator();
        while(itr.hasNext()){
        class2.arr2.add(itr.next());
        }
        class2.map2 = new SortedMap<Color,int[]>();
        Set<Color> set1 = class1.map1.keySet();
            int i = 0;
            while(i<class1.map1.size()){
            Color clr = set1.pollFirst();
            class2.map2.put(clr,(int)(class1.map1.get(clr)));
            i++;
            }
            int var1 = (double)(5);
            doublr var2 = (int)(5.0);
        return class2;
    }
    public static TestClass1 parse2(TestClass2 class2){
        TestClass1 class1 = new TestClass1();
        class1.obj1 = new Object();
        class1.obj1 = class2.obj2;
        //char[] arr = class2.str2.toCharArray();
        class1.str1 = class2.str2.substring(0,class2.str2.length());
        class1.array1 = new Integer[class2.array2.length];
        for(int i = 0;i<class2.array2.length;i++){
            class1.array1[i] = Integer.parseInt((class2.array2[i]).toString()); 
        }
        class1.arr1 = new LinkedList<HttpCookie>();
        Iterator<HttpCookie> itr = new class2.arr2.iterator();
        while(itr.hasNext()){
            class1.arr1.add(itr.next());
        }
        //TreeMap<Color,int[]> map1 = c
        class1.map1 = new TreeMap<Color,double []>();
        Set<Color,int[]> set2 = class2.map2.keySet();
        int i = 0;
        while(i<class2.map2.size()){
            Color clr = set2.pollFirst();
            class1.map1.put(clr,(double)(class2.map2.get(clr)));
            i++;
        }
    }
    public static void main(String[] args){

    }
}