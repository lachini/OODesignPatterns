/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class RectFactory {
    static Map<String, RectType> rectTypes=new HashMap<>();
    
    public static RectType getRectTypes(String name,Color color, String newRect){
        RectType result=rectTypes.get(name);
        if(result==null){
            result=new RectType(name,color,newRect);
            rectTypes.put(name, result);
        }
        return result;
    }
}
