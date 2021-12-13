package com.moderneinstein.core.cube;
import java.lang.Object;
import java.lang.String;
public enum Algorithms{
    Commute1("RFRBBRFRBBRR",0),
    Commute2("RRBBRFRBBRFR",1);
    public int length;
    public final  String value;
    public  int ordinal;
    private Algorithms(String val,int ord){
        value = val;
        ordinal = ord;
        length = val.length();
    }
    public String getValue(){
        return this.value;
    }
    public int getOrdinal(){
        return this.ordinal;
    }
}