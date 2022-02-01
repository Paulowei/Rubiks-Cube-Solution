package com.moderneinstein.core.cube;
import java.awt.Color;
import java.util.Map;
import java.lang.Integer;
import org.w3c.dom.Node;
import jdk.incubator.vector.VectorOperators.Operator;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Iterator;
import java.lang.Math;
import java.lang.Thread;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.Collections;
import java.lang.NullPointerException;
import java.util.List;
import java.util.Random;
/** 
 * This is a program that entails the basic data structure which entails the state of a  corner piece 
 * Rubiks cube,it contains a static color map that maps a color object to an integer values,.
 * in subsequent template classes whicg rely on this module as a template, 
 * the color properties would not be used as it would entail a slight performance cost 
 * to create, and compare Java.awt.Color objects, as the java compliler
 * (javac.exe), has little to no tolerance for inline optimization comparisons of large Objects.(unlike c++)
 * The centralised architecture of this project implies that some modules depend on others, the 
 * "intermediate" modules communicate with the central module.
 * 
*/


public class CornerPiece {
    public static final int length = 3;
    int[] array1 = new int[length];
    public Integer orientation;
    public int[] position = new int[3];
    public static int[] array2 = new int[CornerPiece.length];
    public int defaultPos;
    //It would be imperial to map all the colors to the their corresponding integers;
    //Either Color, or a string representation could be used;
    public static Map<String,Integer> colorMap1; 
    public static Map<Color,Integer> colorMap2;
    public CornerPiece(int a,int b,int c,int orie){
        orientation = orie;
        array1[0]=a;
        array1[1]=b;
        array1[2]=c;
    }
    public CornerPiece(int a,int b,int c){
        //orientaion = orie;
        array1[0]=a;
        array1[1]=b;
        array1[2]=c;
    }
    public CornerPiece(int[] a){
        //orientaion = orie;
        array1[0]=a[0];
        array1[1]=a[1];
        array1[2]=a[2];
    }
    public void rotateR(int n){
        int a = 0;
        if(n==1){
        orientation=(orientation+1)%3;
        position[2]=(position[2]+1)%2;
        }
        if(n==2){
        orientation=(orientation+1)%3;
        position[1]=(position[2]+1)%2;
        }
    }
    public void rotateL(int n){
        orientation=(orientation+1)%3;
        position[2]=(position[2]+1)%2;
    }
    public void rotateU(int n){
        orientation=(orientation+1)%3;
        position[2]=(position[2]+1)%2;
    }
    public void rotateD(int n){
        orientation=(orientation+1)%3;
        position[2]=(position[2]+1)%2;
    }
    public void rotateF(int n){
        orientation=(orientation+1)%3;
        position[2]=(position[2]+1)%2;
    }
    public void rotateB(){
        orientation=(orientation+1)%3;
        position[2]=(position[2]+1)%2;
    }
    public int getDefaultPos(){
        switch(this.array1){
            int pos;
            case {}:
                break;
            case {}:
                break;
            case {}:
                break;
            case {}:
                break;
            case {}:
                break;
            case {}:
                break;
            case {}:
                break;
            case {}:
                break;
            default:
                break;

    }
}
}
