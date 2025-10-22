package com.app.zahid.Dependency;

import java.util.List;

public class AppUtil {
   private  AppUtil() {
   }


    public String convertToString(List<String> list) {
       return String.join(",", list);
    }
}
