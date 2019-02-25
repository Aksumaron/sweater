package com.example.sweater.Algorithms.descriptionGenerator;

import com.example.sweater.Algorithms.ExcelExtract.Responder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Group{
    public ArrayList<Responder> people = new ArrayList<>();
    public String name;
    public Group(String name, ArrayList<Responder> responders){
        this.name = name;
        people.addAll(responders);
    }
}
