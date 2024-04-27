package com.pratham.demo.Beans.specs;

import com.pratham.demo.Beans.Interfaces.Engine;

public class EngineType implements Engine{
    String type;
    public EngineType(){
        type="unk";
    }
    public EngineType(String type){
        this.type=type;
    }
    @Override
    public String specs() {
        // TODO Auto-generated method stub
        return type;
    }
    
}
