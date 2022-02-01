import java.util.LinkedList;
import java.lang.Thread;
import java.util.PriorityQueue;
import java.util.*;
import java.util.ListIterator;
import java.util.Iterator;
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
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.Collections;
import java.lang.NullPointerException;
import java.util.List;
import java.util.Random;
/**
 * This is a central module to this project, and thus is key to the operation of it.
 * This is a 
 */
public class ThreadQueue<E extends Thread> extends PriorityQueue<E>{
    private LinkedList<E> array1;
    private ListIterator<E> iterator = array1.listIterator();
    public ThreadQueue(){
        super();
        array1 =  new LinkedList<E>(); 
        iterator = array1.listIterator();

    }
    public ThreadQueue(Comparator<E> comp){
        super(comp);
        array1 =  new LinkedList<E>(); 
        iterator = array1.listIterator();
    }
    public ThreadQueue(int initialCapacity,Comparator<E> comp){
        super(initialCapacity,comp);
        array1 = new LinkedList<E>();
        iterator = array1.listIterator();
    }
    public boolean initialiseIterator(){
        while(iterator.hasPrevious()!=true){
            iterator.previous();
        }
        return iterator.next()==array1.get(0);
    }
    public <E extends Thread> void prioritize(int n){
        int i=0;
        initialiseIterator();
        while(i<=n){
            array1.add(this.poll());
            i++;
        }
        //dispatching each thread
        for(int j=0;j<array1.size();j++){
           iterator.next().start();
        }
        array1.clear();
    }
    //public <E extends Thread> void 
    public static void main(String[] args){
        LinkedList<CubeNode> list2 = new LinkedList<CubeNode>();
        LinkedList<CubeOperator> list1 = new LinkedList<CubeOperator>();
        CubeOperator operator = new CubeOperator("First",5);
        list1.add(operator);
        ThreadQueue<CubeOperator> queue1 = new ThreadQueue<CubeOperator>();
        queue1.add(operator);
        System.out.println(queue1.remove().toString());
    }
}