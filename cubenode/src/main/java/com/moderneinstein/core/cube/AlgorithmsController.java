package com.moderneinstein.core.cube;
import java.util.Arrays;
import java.util.logging.*;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.Iterator;
import java.lang.Math;
import java.lang.Thread;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.Collections;
import jdk.internal.util.ArraysSupport;
import java.lang.OutOfMemoryError; 
import java.util.logging.Logger;
import java.util.logging.Level;
public class AlgorithmsController{
    public char[] array1;
    public int length;
    public AlgorithmsController(Algorithms algorithm ){
        this(algorithm.getValue());
        //array1[7]= 
    }
    public AlgorithmsController(char[] args){
        array1 = args;
    }
    public AlgorithmsController(String args){
        array1= AlgorithmsController.convert(args);
    }
    public static char[] convert(String str){
        //array1 = str.toCharArray();
        return str.toCharArray();
    }
    public static void main(String[] args){
        //Algorithms commute1 = new Algorithms("R");
    }
}