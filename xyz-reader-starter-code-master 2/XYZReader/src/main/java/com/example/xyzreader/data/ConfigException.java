package com.example.xyzreader.data;

public class ConfigException extends Error {

    String msg;

    public ConfigException(String str){
        this.msg=str;
    }

    public String toString(){
        return "Error: "+msg;
    }
}
