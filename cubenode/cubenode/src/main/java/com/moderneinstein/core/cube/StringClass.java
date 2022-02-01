package com.moderneinstein.core.cube;
import java.lang.String;
import java.lang.Integer;
import java.lang.StringBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
public class StringClass {
    String str;
    Integer ar5 = 4;
    public StringClass(String str1){
        str = str1;
    }
    public static StringClass strMethod1(StringClass strClass){
        String word = strClass.str;
        //((StringBuffer)word).append(" Shoes");
        Integer int1 = strClass.ar5;
        int1+=4;
        //strClass.ar5+=4;
        //System.out.println(strClass.ar5);
        return strClass;
    }
    public static void main(String[] args){
        StringClass strClass = new StringClass("Great");
        //StringClass str1 = StringClass.strMethod1(strClass);
        StringClass str1 = StringClass.strMethod1(strClass);
        Integer int1 = str1.ar5;
        int1+=4;
        //strClass.ar5+=4;
        Integer int2 = 6;
        int2+=4;
        //System.out.println(int3);
        //System.out.println(int2);
        StringClass str2 = str1;
        str2.ar5+=6;
        //System.out.println(str1.ar5);
        //System.out.println(str1.ar5);
        //System.out.println(str1.str);
        //System.out.println(str1.ar5);
        //strClass.ar5+=6;
        //System.out.println(str1.ar5);
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        for(int i=0;i<6;i++){
            array1.add(i);
        }
        ArrayList<Integer> array2 = new ArrayList(array1);
        array2.add(7);
        //System.out.println(Arrays.toString(array1.toArray()));
        System.out.println(array1);
        //PrintStream stream1 = new PrintStream(new File("StringClass.java"));
        //stream1.println(array1);
        String str = new String();
        System.out.println(str.toCharArray());
        //char[] char1 = new char[10];
        //Char[] char2 = (Char[])char1; 
        //Char char3 = 'H';
        char[] argv1 = new char[]{'R','L','U','D','F','B','r','l','u','d','f','b'};
        //argv = {"R","L","U","D","F","B"};
        //char[] argv2 = new char[]{"r","l","u","d","f","b"};
        Arrays.sort(argv1);
        System.out.println(Arrays.toString(argv1));
        int[] array3 = new int[]{2,3,5,6};
        System.out.println(array3.hashCode());
        
        LinkedList<String> theList  = new LinkedList<String>();
        theList.add("CRY");
        theList.add("PTO");
        theList.add("");
    }
    
}
