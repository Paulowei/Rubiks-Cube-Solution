package com.moderneinstein.core.cube;
import org.w3c.dom.Node;
import java.util.Arrays;
import java.util.logging.*;
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
import java.lang.Thread;
//import java.lang.char;
public class CubeOperator extends Thread implements Comparable<CubeOperator>{
    /*The CubeNode object is bound to a custom Thread object
    //this custom thread object is an instance of the CubeOperator class.
    //The CubeOperator then calls the methods of of the CubeNode class;
    //The operations have to be in the sorted order, in order for the operate(CubeNode&,int&) function to convert the
    //characters to integers accurately.
    //This is one of the central modules to this project,however, only contributes to the 
    //modular composability of this software, is prone to change if te build operation of the .jar file 
    //tends to be unsuccessful, or unsatisfactory.
    //
    */
    public static final LinkedList<CornerPiece> solution = new LinkedList<CornerPiece>();
    private int quotientScore;
    public static Integer count;
    public static String str = count.toString();
    public Random random = new Random();
    public CubeOperator(){
        this(CubeOperator.str,5);
    }
    public CubeOperator(String str,int n){
        setPriority(n);
        setName(str);
        count++;
    }
    public static synchronized void operate(CubeNode node,int n){
        switch(n){
            case 1:
                node.RotateB(1);
                break;
            case 2:
                node.RotateD(1);
                break;
            case 3:
                node.RotateF(1);
                break;
            case 4:
                node.RotateL(1);
                break;
            case 5:
                node.RotateR(1);
                break;
            case 6:
                node.RotateU(1);
                break;
            case 7:
                node.RotateB(-1);
                break;
            case 8:
                node.RotateD(-1);
                break;
            case 9:
                node.RotateF(-1);
                break;
            case 10:
                node.RotateL(-1);
                break;
            case 11:
                node.RotateR(-1);
                break;
            case 12:
                node.RotateU(-1);
                break;
            default:
                break;
        }
    }
    //A polymorphic signature for the above method
    public static synchronized void operate(CubeNode cube,int[] arr){
        for(int i=0;i<arr.length;i++){
            CubeOperator.operate(cube,arr[1]);
        }
    }
    public static synchronized void operate(CubeNode cube,char character){
        char[] argv1 = new char[]{'R','L','U','D','F','B','r','l','u','d','f','b'};
        //argv = {"R","L","U","D","F","B"};
        //char[] argv2 = new char[]{"r","l","u","d","f","b"};
        Arrays.sort(argv1);
    int var1 = Arrays.binarySearch(argv1,character);
    CubeOperator.operate(cube,var1);
    }
    public static synchronized void operate(CubeNode cube,Algorithms alg){
        char[] array = alg.getValue().toCharArray(); 
        for(int i=0;i<array.length;i++){
            CubeOperator.operate(cube,array[i]);
        }
    }

    //polymorphic getQuotientScore method.
    public static int getQuotientScore(CubeNode node){
        return node.getQuotientScore();
    }
    //polymorphic setQuotientScore method.
    public static int setQuotientScore(CubeNode node){
        //default implementation will be created tomorrow.
        node.setQuotientScore(0);
        for(int i=0;i<node.linkedList.size();i++){
            if(solution.get(i).equals(node.linkedList.get(i))){
                node.incrementQuotientScore();
            }
            if((Integer)5(Integer)6){

            }
            if(((Integer)(solution.get(i).orientation-node.linkedList.get(i).orientation)).equals((Integer)(
            solution.get(i-1).orientation-node.linkedList.get(i-1).orientation))&&((Integer)
            (solution.get(i).orientation-node.linkedList.get(i).orientation)).equals((Integer)
            (solution.get(i-2).orientation-node.linkedList.get(i-2).orientation))){
                node.incrementQuotientScore(2);
            }
        }
        for(int i=0;i<4;i++){
        if((solution.get(CubeNode.topFace[(i+4)%4]).orientation-node.linkedList.get(CubeNode.topFace[(i+4)%4]).orientation).
            equals((solution.get(CubeNode.topFace[((i-1)+4)%4]).orientation)-
            node.linkedList.get(CubeNode.topFace[(i-1+4)%4]).orientation)&&
            (solution.get(CubeNode.topFace[(i+4)%4]).orientation-node.linkeList.get(CubeNode.topFace[(i+4)%4]).orienation)
            .equals(solution.get(CubeNode.topFace[(i-2)+4]%4).orienation-
            node.linkedList.get(CubeNode.topFace[(i-2+4)%4]).orientation)){
                node.incrementQuotientScore(2);
        }
        if((solution.get(CubeNode.bottomFace[(i+4)%4]).orientation-node.linkedList.get(CubeNode.bottomFace[(i+4)%4])).
            equals((solution.get(CubeNode.bottomFace[((i-1)+4)%4]).orientation)-
            node.linkedList.get(CubeNode.topFace[(i-1+4)%4]).orientation)&&
            (solution.get(CubeNode.bottomFace[(i+4)%4]).orientation-node.linkeList.get(CubeNode.bottomFace[(i+4)%4]).orienation)
            .equals(solution.get(CubeNode.bottomFace[(i-2)+4]%4).orienation-
            node.linkedList.get(CubeNode.bottomFace[(i-2+4)%4]).orientation)){
                node.incrementQuotientScore(2);
        }
        if((solution.get(CubeNode.rightFace[(i+4)%4]).orientation-node.linkedList.get(CubeNode.rightFace[(i+4)%4])).
            equals((solution.get(CubeNode.rightFace[((i-1)+4)%4]).orientation)-
            node.linkedList.get(CubeNode.rightFace[(i-1+4)%4]).orientation)&&
            (solution.get(CubeNode.rightFace[(i+4)%4]).orientation-node.linkedList.get(CubeNode.rightFace[(i+4)%4]).orienation)
            .equals(solution.get(CubeNode.rightFace[(i-2)+4]%4).orientation-
            node.linkedList.get(CubeNode.rightFace[(i-2+4)%4]).orientation)){
                node.incrementQuotientScore(2);
        }
        if((solution.get(CubeNode.leftFace[(i+4)%4]).orientation-node.linkedList.get(CubeNode.leftFace[(i+4)%4]).orientation).
            equals((solution.get(CubeNode.leftFace[((i-1)+4)%4]).orientation)-
            node.linkedList.get(CubeNode.leftFace[(i-1+4)%4]).orientation)&&
            (solution.get(CubeNode.leftFace[(i+4)%4]).orientation-node.linkeList.get(CubeNode.leftFace[(i+4)%4]).orienation)
            .equals(solution.get(CubeNode.leftFace[(i-2)+4]%4).orienation-
            node.linkedList.get(CubeNode.leftFace[(i-2+4)%4]).orientation)){
                node.incrementQuotientScore(2);
        }
        if((solution.get(CubeNode.frontFace[(i+4)%4]).orientation-node.linkedList.get(CubeNode.frontFace[(i+4)%4]).orientation).
            equals((solution.get(CubeNode.frontFace[((i-1)+4)%4]).orientation)-
            node.linkedList.get(CubeNode.frontFace[(i-1+4)%4]).orientation)&&
            (solution.get(CubeNode.frontFace[(i+4)%4]).orientation-node.linkeList.get(CubeNode.frontFace[(i+4)%4]).orienation)
            .equals(solution.get(CubeNode.frontFace[(i-2)+4]%4).orienation-
            node.linkedList.get(CubeNode.frontFace[(i-2+4)%4]).orientation)){
                node.incrementQuotientScore(2);
        }
        if((solution.get(CubeNode.backFace[(i+4)%4]).orientation-node.linkedList.get(CubeNode.backFace[(i+4)%4])).
            equals((solution.get(CubeNode.backFace[((i-1)+4)%4]).orientation)-
            node.linkedList.get(CubNode.backFace[(i-1+4)%4]).orientation)&&
            (solution.get(CubeNode.backFace[(i+4)%4]).orientation-node.linkeList.get(CubeNode.backFace[(i+4)%4]).orienation)
            .equals(solution.get(CubeNode.backFace[(i-2)+4]%4).orienation-
            node.linkedList.get(CubeNode.backFace[(i-2+4)%4]).orientation)){
                node.incrementQuotientScore(2);
        }
        for(int j=0;j<4;j++){
            int k=0;
            if(solution.get(CubeNode.topFace[i])==node.linkedList.get(CubeNode.topFace[i])){
                k++;
                if(k==4){
                node.incrementQuotientScore(2);
                }
            }
        }
        for(int j=0;j<4;j++){
            int k=0;
            if(solution.get(CubeNode.bottomFace[i])==node.linkedList.get(CubeNode.bottomFace[i])){
                k++;
                if(k==4){
                node.incrementQuotientScore(2);
                }
            }
        }
        for(int j=0;j<4;j++){
            int k=0;
            if(solution.get(CubeNode.rightFace[i])==node.linkedList.get(CubeNode.rightFace[i])){
                k++;
                if(k==4){
                node.incrementQuotientScore(2);
                }
            }
        }
        for(int j=0;j<4;j++){
            int k=0;
            if(solution.get(CubeNode.leftFace[i])==node.linkedList.get(CubeNode.leftFace[i])){
                k++;
                if(k==4){
                node.incrementQuotientScore(2);
                }
            }
        }
        for(int j=0;j<4;j++){
            int k=0;
            if(solution.get(CubeNode.frontFace[i])==node.linkedList.get(CubeNode.frontFace[i])){
                k++;
                if(k==4){
                node.incrementQuotientScore(2);
                }
            }
        }
        for(int j=0;j<4;j++){
            int k=0;
            if(solution.get(CubeNode.backFace[i])==node.linkedList.get(CubeNode.backFace[i])){
                k++;
                if(k==4){
                node.incrementQuotientScore(2);
                }
            }
        int temp = node.getQuotientScore();
        //node.quotientScore=0;

        return temp;
}
    //public static int getQuotientScore(CubeNode cube){
      //  return 8;
    //}
    //public  static void setQuotientScore(CubeNode cube){

    //}
    //implementation of the compareTo method of the Comparable<E> interface  
    public int compareTo(CubeOperator operator){
        if(this.getPriority()>operator.getPriority()){
            return 1;
        }
        if(this.getPriority()>operator.getPriority()){
            return -1;
        }
        else{
             return CubeOperator.resolve(this,operator);
        }
    }
    //Resolution technique for threads of equal priority.
    public static int resolve(CubeOperator operator1,CubeOperator operator2){
        if(operator1.getQuotientScore()<Operator2.getQuotientScore()){
            return 1;
        }
        if(operator1.getQuotientScore()<Operator2.getQuotientScore()){
            return -1;
        }
        else{
            //pick a random Thread to execute
            //This line of code may be edited later;
            return (rand.nextInt(1)*2)-1;
        }
    }
    @Override
    public void run(){
        //initalise corner pice object with the number of faces of the cube;
        CornerPieces pieces = new CornerPieces(6);
        pieces.root.RNG(10);
        pieces.generateBinaryTree();

    }
    public static void main(String[] args){

    }
}
