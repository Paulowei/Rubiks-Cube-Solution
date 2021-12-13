package com.moderneinstein.core.cube;
import org.w3c.dom.Node;
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
import com.moderneinstein.core.cube.ThreadQueue;
import java.lang.ThreadGroup;
import java.util.Queue;
import java.util.PriorityQueue;
public class ThreadDispatcher{
    //The parent Thread Group, from which other thread groups will be added and dispatched;
    protected static ThreadGroup group = new ThreadGroup("Parent");
    public static int count;
    public ThreadDispatcher(Queue queue){

    }
    public ThreadDispatcher(ThreadGroup gp){
        ThreadDispatcher.count++;
        gp = new ThreadGroup(ThreadDispatcher.group,Integer.toString(count));
    } 
    public ThreadDispatcher(Thread thread){
        ThreadDispatcher.count++;
    }
    public void dispatch(){

    }
    public void extend(){
        ThreadGroup group1 = new ThreadGroup(group,Integer.toString(count));
    }
    public static void main(String[] args){

    }
}