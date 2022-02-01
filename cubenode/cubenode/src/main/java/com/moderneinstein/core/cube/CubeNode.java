package com.moderneinstein.core.cube;
import org.w3c.dom.Node;
import com.moderneinstein.core.cube.CornerPieces;
import jdk.incubator.vector.VectorOperators.Operator;
import java.util.Arrays;
import java.util.logging.Logger;
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
import jdk.internal.util.ArraysSupport;
import java.lang.NullPointerException;
import java.lang.CloneNotSupportedException;
public class CubeNode extends CornerPieces implements Comparable<CubeNode>{
    /**
     * Like many other programs in this project, this is a precompiles module, which will also 
     * form a core component of the project, this module, however, is a descendant, or a child of the CornerPieces class
     * A CornerPieces object encapsulates the state of the Cube() at any instance in time
     * the
     */
    //initialize the parent, leftChild, and rightChild objects;
    private CubeNode leftChild;
    private CubeNode rightChild;
    private CubeNode parentNode;
    public int length;
    private CornerPiece[] array1; 
    public LinkedList<CornerPiece> linkedList;
    public LinkedList<CornerPiece> linkedSet;
    private ListIterator<CornerPiece> iterator;
    private int quotientScore;
    private ArrayList<CubeNode> temp = 
    (ArrayList<CubeNode>)Collections.synchronizedList(new ArrayList<CubeNode>());
    public static final LinkedList<CornerPiece> solution = new LinkedList<CornerPiece>();
    public static final int[] topFace = new int[]{1,2,3,4};
    public static final int[] bottomFace = new int[]{5,6,7,8};
    public static final int[] rightFace = new int[]{1,4,5,8};
    public static final int[] leftFace = new int[]{2,3,6,7};
    public static final int[] frontFace = new int[]{1,2,5,6};
    public static final int[] backFace = new int[]{3,4,7,8}; 
    //public static final LinkedList<CubeNode> solution = 
    //public static CubeNode[] array1 = new CubeNode[100];
    public char[] path = new char[50];
    public static int[] array2 = new int[8];
    //create a polymorphic constructor;
    //first parametised constructor;
    public CubeNode(int n){
       
            //linkedList = list;
        //call the super() method to instantiate the constructor of the super class(TreeSet<LinkedList>)
        //super();
        //instantiate out LinkedList<CornerPiece> Object 
        // the List object returned by the Collections.synchronizedList(List<T extends Object> is casted to an LinkedList<CornerPiece>;
        linkedList = (LinkedList<CornerPiece>)
        Collections.synchronizedList(new LinkedList<CornerPiece>());
        linkedSet  = (LinkedList<CornerPiece>)
        Collections.synchronizedList(new LinkedList<CornerPiece>());
        //instantiate the ArrayList<CornerPiece> 
        //the List object returned by the Collections.synchronizedList(List<T extends Object> is casted to an ArrayList;
        ArrayList<int[]> arr1 = (ArrayList<int[]>)
        Collections.synchronizedList(new ArrayList<int[]>(CornerPieces.generateArray(n)));
        array1 = new CornerPiece[arr1.size()];
        length = arr1.size();
        //finally , the int[] objects are copied from arr1
        //to linkedList with the help of the polymorphic CornerPiece(int[]) constructor
        for(int i = 0;i<arr1.size ();i++){
            linkedList.add(new CornerPiece(arr1.get(i)));
            linkedSet.add(new CornerPiece(arr1.get(i)));
            array1[i] = new CornerPiece(arr1.get(i));
        }
        iterator = linkedList.listIterator();
        //this = Collections.synchronizedSet(new TreeSet());
    }
    //second parametized constructor;
    public CubeNode(LinkedList<CornerPiece> list){
        if(list!=null){
            //linkedList = list;
            ListIterator<CornerPiece> iterator = list.listIterator();
            int h=1;
            linkedList.set(0,list.get(0));
            linkedSet.set(0,list.get(0));
            while(iterator.hasNext()==true){
                linkedList.set(h,iterator.next());
                linkedSet.set(h,iterator.next());
                h++;
            }
        }
        else{
            throw new NullPointerException();
        }
    }
    //unparametized constructor;
    public CubeNode(){
        this(null);
    }
    public CubeNode getParentNode(){
        return this.parentNode;
    }
    public CubeNode getleftChildNode(){
        return this.leftChild;
    }
    public CubeNode getRightChildNode(){
        return this.rightChild;
    }
    public CubeNode RotateR(int n){
        CubeNode node;
        while(n<0){
            n=(n+4)%4;
            }
            try{
        int f=0;
        int[] array1 = new int[]{1,4,6,5};
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;}
        //It is not appropriate to equate both Object[] variables ,
        //as the object memory references would now point to thesame object.
        //linkedSet = linkedList;
        //cloning only returns a shallow copy,
        //linkedSet = (LinkedList<CornerPiece>)linkedList.clone();
        //so instead, we use an iterator to copy both elements of one linkedList to the other;
        //int h=1;

        //cloning only returns a shallow copy,
        //so instead we use an iterator object to copy between both LinkedLists.
        int h=1;
        linkedSet.set(0,linkedList.get(0));
        while(iterator.hasNext()){
            linkedSet.set(h,iterator.next());
            h++;
        }
        //return this;
    }
    //CubeNode node = new CubeNode(linkedList);
    //CubeNode node = (CubeNode)this.clone();
    node = ((CubeNode[])this.clone())[1];
    //however, to avoid a reference error, we have to clone the CubeNode object
    //return node;
    temp.add(node);
    //return new CubeNode();
    }catch(NullPointerException|CloneNotSupportedException E){
        System.out.println(E.toString());
        E.printStackTrace();
    }
    return temp.remove(0);
    }
    public CubeNode RotateL(int n){
        while(n<0){
            n=(n+4)%4;
            }
            try{
        int f=0;
        int[] array1 = new int[]{3,2,8,7};
        while(f<n){
        for(int i=0;i<4;i++){
            //linkedList.set(i,linkedSet.get((i+1)%8));
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
       // linkedSet = linkedList;
       initialiseIterator();
       int h=1;
       linkedSet.set(0,linkedList.get(0));
       while(iterator.hasNext()){
           linkedSet.set(h,iterator.next());
           h++;
       }
    }
    //CubeNode node = new CubeNode(linkedList);
    CubeNode node = (CubeNode)this.clone();
    //return node;
    temp.add(node);
        }catch(CloneNotSupportedException|ClassCastException|NullPointerException E){
            E.printStackTrace();
        }
        return temp.remove(0);
    }
    public synchronized CubeNode RotateU(int n){
        while(n<0){
        n=(n+4)%4;
        }
        try{
        int f=0;
        //initialise rotational array for this specific clockwise rotation(U)
        int[] array1 = new int[]{1,2,3,4};
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
       // linkedSet = linkedList;
       initialiseIterator();
       int h=1;
       linkedSet.set(0,linkedList.get(0));
       while(iterator.hasNext()){
           linkedSet.set(h,iterator.next());
           h++;
       }
    }
    //CubeNode node = new CubeNode(linkedList);
    //CubeNode node = (CubeNode)this.clone();
    temp.add((CubeNode)this.clone());
        }catch(NullPointerException|ClassCastException|CloneNotSupportedException E){
            E.printStackTrace();
        }
        return temp.remove(0);
    }
    public synchronized CubeNode RotateD(int n){
        while(n<0){
            n=(n+4)%4;
            }
            try{
        int f=0;
        int[] array1 = new int[]{5,6,7,8};
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
        }
       // linkedSet = linkedList;
       initialiseIterator();
       int h=1;
       linkedSet.set(0,linkedList.get(0));
       while(iterator.hasNext()){
           linkedSet.set(h,iterator.next());
           h++;
       }
    }
    CubeNode node = (CubeNode)this.clone();
    temp.add(node);
        }catch(NullPointerException|CloneNotSupportedException E){
            E.printStackTrace();
        }
    return temp.remove(0);
    }
    public synchronized CubeNode RotateF(int n){
        while(n<0){
            n=(n+4)%4;
            }
            try{
        int[] array1 = new int[]{2,1,5,8};
        int f=0;
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
        //linkedSet = linkedList;
        initialiseIterator();
        int h=1;
        linkedSet.set(0,linkedList.get(0));
        while(iterator.hasNext()){
            linkedSet.set(h,iterator.next());
            h++;
        }
    }
    CubeNode node = (CubeNode)this.clone();
        temp.add((CubeNode)this.clone());
        }catch(NullPointerException|CloneNotSupportedException E){
            E.printStackTrace();
        }
    return temp.remove(0);
    }
    public synchronized CubeNode RotateB(int n){
        while(n<0){
            n=(n+4)%4;
            }
            try{
        int f=0;
        int[] array1 = new int[]{4,3,7,6};
        //int f=0;
        while(f<n){
        for(int i=0;i<4;i++){
            linkedList.set(((array1[(i+1)%4])),linkedSet.get((array1[i])));
            f++;
        }
        //linkedSet = linkedList;
        initialiseIterator();
        int h=1;
        linkedSet.set(0,linkedList.get(0));
        while(iterator.hasNext()){
            linkedSet.set(h,iterator.next());
            h++;
            }
        }
    //CubeNode node = new CubeNode(linkedList);
    temp.add((CubeNode)this.clone());
            }catch(NullPointerException|CloneNotSupportedException E){
                E.printStackTrace();
            }
    return temp.remove(0);
    }
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
    //these are configurations with a color(array[n], an its opposite,(array[n+1%3]), on the 
    //same piece)
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
    public int compareTo(CubeNode node){
        if(node==null){
            //System.out.println("The CubeNode object is null.");
            //throw new NullPointerException();
            return 0;
            //throw new NullPointerException();
        }else{
            if(CubeOperator.setQuotientScore(node)<CubeOperator.setQuotientScore(this)){
                return 1;
            }
            if( CubeOperator.setQuotientScore(node)>CubeOperator.setQuotientScore(this)){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    //return new Boolean(true);
    public CubeNode RNG(int n){
        Random random = new Random();
        int[] arr = new int[n];
            for(int i=1;i<=n;i++){
                arr[i]=random.nextInt();
    }
    CubeOperator.operate(this,arr);
    return this;
}
public int hashCode(){
    int f2 = ((Object)(this)).hashCode();
    return f2;
}
public int incrementQuotientScore(){
    this.quotientScore++;
    return this.quotientScore;
}
public int decrementQuotientScore(){
    this.quotientScore--;
    return this.quotientScore;
}
public int incrementQuotientScore(int n){
    this.quotientScore+=n;
    return this.quotientScore;
}
public int decrementQuotientScore(int n){
    this.quotientScore-=n;
    return this.quotientScore;
}
public int getQuotientScore(){
    //this.quotientScore-=n;
    return this.quotientScore;
}
public int setQuotientScore(int n){
    this.quotientScore=n;
    return this.quotientScore;
}
    public boolean initialiseIterator(){
        while(iterator.hasPrevious()!=true){
            iterator.previous();
    }
        return iterator.next()==linkedList.get(0);
    }
}
