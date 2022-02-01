package com.moderneinstein.core.cube;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.lang.Integer;
import java.lang.Number;
public class Template<E extends Comparable>{
    public  Comparator<E >[] array1 = new Object[10];
    public Object object;
    public int head=0;
    public <E> Template(Object[] args){
        array1 = (Object[])args;
        object = array1[head];
    }
    public <E> Template(List<Object> args){
        //array1 = args.toArray();
        for(int i=0;i<args.size();i++){
            array1[i]=args.get(i);
        }
        object = array1[head];
    }
    public <E> Object[] incrementArrayM(){
        if(array1[1] instanceof Integer){
            for(int i=0;i<array1.length;i++){
                array1[i]= array1[i]*n;
            }
        }
        return array1;
    }
    public <E> Object[] incrementArrayA(int n){
        if(array1[1] instanceof Integer){
            for(int i=0;i<array1.length;i++){
                array1[i]= array1[i]+n;
            }
        }
        return array1;
    }
    public <E> void perform(Function FNCS){
        Object[] obj1 = FNCS(1);
    }
    public static void main(String[] args){
        Integer[] array2 = new Integer[]{3,4,5,6,7,8,};
        //array2 = {3,4,5,6,7,8,9};
        Template<Integer> template1 = new Template((Integer[])array2);
        System.out.println(Arrays.toString(template1.array1));
        System.out.println(template1.object);
        ArrayList<Integer> array3 = new ArrayList<Integer>(4);
        array3.add(4);
        array3.add(4);
        array3.add(4);
        array3.add(4);
        Template<Integer> template2 = new Template(array3);
        System.out.println(Arrays.toString(template2.array1));
        System.out.println(template2.object);
        String[] array4 = new String[]{"FGH","SHK","CRY","PTO"};
        Template<String> template3 = new Template(array4);
        System.out.println(Arrays.toString(template3.array1));
        System.out.println(template3.object);
    }
}
