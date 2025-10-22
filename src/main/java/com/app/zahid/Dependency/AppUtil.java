package com.app.zahid.Dependency;

import java.util.Arrays;
import java.util.List;

public class AppUtil {
   private  AppUtil() {
   }


    public String convertToString(List<String> list) {
       return String.join(",", list);
    }

    public String convertToString(List<String> list, String delimiter) {
       return String.join(delimiter, list);
    }

    public List<String> toList(String list) {
       return Arrays.stream(list.split(",")).toList();
    }
    public void diplay(){
        System.out.println("hello zahid");
    }
}
