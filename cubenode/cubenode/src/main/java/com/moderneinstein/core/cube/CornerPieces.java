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
    public class CornerPieces extends TreeSet<CubeNode >{
    private LinkedList<CornerPiece> linkedList;
    private LinkedList<CornerPiece> linkedSet;
    private ListIterator<CornerPiece> iterator;
    private int cubeNodeLength;
    private static CubeNode[] array1 = new CubeNode[100];
    public static int[] array2 = new int[8];
    public  CubeNode root;
    public static Logger logger = Logger.getLogger(CornerPieces.class.getName());
    public static final LinkedList<CornerPiece> solution = new LinkedList<CornerPiece>());
    
    public CornerPieces(){
        //call the super() method to instantiate the constructor of the super class(TreeSet<LinkedList>)
        super();
        //instantiate out LinkedList<CornerPiece> Object 
        // the List object returned by the Collections.synchronizedList(List<T extends Object> is casted to an LinkedList<CornerPiece>;
        linkedList = (LinkedList<CornerPiece>)
        Collections.synchronizedList(new LinkedList<CornerPiece>());
        //instantiate the ArrayList<CornerPiece> 
        //the List object returned by the Collections.synchronizedList(List<T extends Object> is casted to an ArrayList;
        ArrayList<int[]> arr1 = (ArrayList<int[]>)
        Collections.synchronizedList(new ArrayList<int[]>(CornerPieces.generateArray(6)));
        //finally , the int[] objects are copied from arr1
        //to linkedList with the help of the polymorphic CornerPiece(int[]) constructor
        for(int i = 0;i<arr1.size ();i++){
            linkedList.add(new CornerPiece(arr1.get(i)));
            linkedSet.add(new CornerPiece(arr1.get(i)));
        }
        iterator = linkedList.listIterator();
        root = new CubeNode(cubeNodeLength);
        root.RNG(20);
        //generateBinaryTree();
        //this = Collections.synchronizedSet(new TreeSet());
    }
    public synchronized void RotateR(int n){
        while(n<0){
            n=(n+4)%4;
            }
        int f=0;
        int[] array1 = new int[]{1,4,6,5};
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
        //It is not appropriate to equate both Object[] variables ,
        //as the object memory references would now point to thesame object.
        //linkedSet = linkedList;
        //so instead, we use an iterator to copy both elements of one linkedList to the other;
        //int h=1;
        //cloning only returns a shallow copy,
        linkedSet = (LinkedList<CornerPiece>)linkedList.clone();
        //cloning only returns a shallow copy,
        //so instead we use an iterator object to copy between both LinkedLists.
        int h=1;
        linkedSet.set(0,linkedList.get(0));
        while(iterator.hasNext()){
            linkedSet.set(h,iterator.next());
            h++;
        }
    }
}
    public synchronized void RotateL(int n){
        while(n<0){
            n=(n+4)%4;
            }
        int f=0;
        int[] array1 = new int[]{3,2,8,7};
        while(f<n){
        for(int i=0;i<4;i++){
            //linkedList.set(i,linkedSet.get((i+1)%8));
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
       // linkedSet = linkedList;
       int h=1;
       linkedSet.set(0,linkedList.get(0));
       while(iterator.hasNext()){
           linkedSet.set(h,iterator.next());
           h++;
       }
    }
    }
    public synchronized void RotateU(int n){
        while(n<0){
        n=(n+4)%4;
        }
        int f=0;
        //initialise rotational array for this specific clockwise rotation(U)
        int[] array1 = new int[]{1,2,3,4};
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
       // linkedSet = linkedList;
       int h=1;
       linkedSet.set(0,linkedList.get(0));
       while(iterator.hasNext()){
           linkedSet.set(h,iterator.next());
           h++;
       }
    }
    }
    public synchronized void RotateD(int n){
        while(n<0){
            n=(n+4)%4;
            }
        int f=0;
        int[] array1 = new int[]{5,6,7,8};
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
        }
       // linkedSet = linkedList;
       int h=1;
       linkedSet.set(0,linkedList.get(0));
       while(iterator.hasNext()){
           linkedSet.set(h,iterator.next());
           h++;
       }
    }
    }
    public synchronized void RotateF(int n){
        while(n<0){
            n=(n+4)%4;
            }
        int[] array1 = new int[]{2,1,5,8};
        int f=0;
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
        //linkedSet = linkedList;
        int h=1;
        linkedSet.set(0,linkedList.get(0));
        while(iterator.hasNext()){
            linkedSet.set(h,iterator.next());
            h++;
        }
    }
    }
    public synchronized void RotateB(int n){
        while(n<0){
            n=(n+4)%4;
            }
        int f=0;
        int[] array1 = new int[]{4,3,7,6};
        //int f=0;
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
        //linkedSet = linkedList;
        int h=1;
        linkedSet.set(0,linkedList.get(0));
        while(iterator.hasNext()){
            linkedSet.set(h,iterator.next());
            h++;
        }
    }
    }
    //public synchronized static void cycle(int[] a ,)
    //This mehod helps to generate an integer object to encapsulate  and
    //represent the state of a cube 
    public static ArrayList<int[]> generateArray(int n){
        //create an ArrayList<int[]> object to hold all the configurations
        ArrayList<int[]> arr1 = new ArrayList<int[]>(n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    if(i!=j||i!=k||j!=k){
                        arr1.add(new int[]{i,j,k});
                    }
                }
            }
    }
    //now type to loop over the list and eliminate unwanted configurations
    //these are configurations with a color(array[n], an its opposite,(array[n-1]), in the 
    //same )
        for(int j=0;j<arr1.size();j++){
            //if(arr1.get(j).contains(i))
            for(int i=1;i<=n/2;i++){
                for(int k=0;k<3;k++){
                    if(arr1.get(j)[k]==i&&arr1.get(j)[k+1%3]==i-1+n/2||
                    arr1.get(j)[k]==i&&arr1.get(j)[k+2%3]==i-1+n/2){
                        arr1.remove(j);
                    }
                }
        }
        }
        return arr1;
    }
    public  CubeNode[] generateBinaryTree(){
        Random random = new Random();
        int i;
        array1[1]=root;
        array1[2]=CubeOperator.Operate(root,random.nextInt(6)+1);
        for(i=1;i<=2000;i++){
        //while(i<=50){
            array1[2*i] = CubeOperator.Operate(array[i],random.nextInt(6)+1);
            array1[2*i+1]=CubeOperator.Operate(array[i],random.nextInt(6)+1);
            i++;
        //}
        if(i==array.length-10){
            CornerPieces.growArray((2*array1.length)-1);
        }
    }
        return array1;
    }
    public static void growArray(int minCapacity){
        try{
        int currentLength = array1.length;
        int prefGrowth = 32;
        int minGrowth = minCapacity - currentLength;
        int newCapacity = ArraysSupport.newLength(currentLength,minGrowth,prefGrowth);
        array1 = Arrays.copyOf(array1,newCapacity);
        }catch(OutOfMemoryError|NullPointerException E){
            logger.log(Level.SEVERE,E.toString());
            E.printStackTrace();
        }
    }
    public static void growArray(int minCapacity,int prefGrowth){
        //int currentLength = array1.length;
        try{
            int currentLength = array1.length;
            //int prefGrowth = 32;
            int minGrowth = minCapacity - currentLength;
            int newCapacity = ArraysSupport.newLength(currentLength,minGrowth,prefGrowth);
            array1 = Arrays.copyOf(array1,newCapacity);
            }catch(OutOfMemoryError|NullPointerException E){
                logger.log(Level.SEVERE,E.toString());
                E.printStackTrace();
            }
        //int prefGrowth = 
    }
    public static void main(String[] args){

    }
}