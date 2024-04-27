package com.example.Vishva.Beans.Interfaces;

public class EngineType implements Engine{
    String type;
    public EngineType(){
        type = "unknown Engine ..";
    }
    public EngineType(String str){
        this.type= str +" Engine";
    }
    @Override
    public String specs(){
        return type;
    }
}
// Today we will start at 9:05