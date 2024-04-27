package Generics;

import java.util.Arrays;

public class CustomArrayList {
    private String[] data;
    private static int DEFAULT_SIZE=10;
    public int size=0;
    public CustomArrayList(){
        this.data=new String[DEFAULT_SIZE];
    }
    public void add(String num){
        if(isFull()) resize();
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        String []temp=new String[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public String remove(){
        String remove=data[--size];
        return remove;
    }
    public void set(int index,String value){
        data[index]=value;
    }
    @Override 
    public String toString(){
        return Arrays.toString(data)+" "+size;
    }
}
