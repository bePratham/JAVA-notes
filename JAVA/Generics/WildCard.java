package Generics;

import java.util.Arrays;

public class WildCard<T extends String>{
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    public int size=0;
    public WildCard(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()) resize();
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object []temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public Object remove(){
        Object remove=data[--size];
        return remove;
    }
    public void set(int index,Object value){
        data[index]=value;
    }
    @Override 
    public String toString(){
        return Arrays.toString(data)+" "+size;
    }
}

