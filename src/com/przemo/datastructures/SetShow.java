package com.przemo.datastructures;

import java.util.HashSet;
import java.util.Set;

import com.przemo.IShow;

public class SetShow implements IShow {
    private Set<Object> s = new HashSet<>();


@Override
    public String toString() {
        boolean[] ba = new boolean[20];
        ba[0]=s.add("a");ba[1]=s.add(new Integer(42));ba[2]=s.add("b");ba[3]=s.add("a");ba[4]=s.add(new Object());for(
            int x = 0;
        
            x<ba.length;x++)
        System.out.print(ba[x] + " ");
        System.out.println();
        // TODO Auto-generated method stub
        return super.toString();
    }

}