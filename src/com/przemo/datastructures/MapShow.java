package com.przemo.datastructures;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.przemo.IShow;

class Dog {
    public Dog(String n) {
        name = n;
    }

    public String name;

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Dog) && (((Dog) o).name == name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.length();
    }
}

class Cat {
}

enum Pets {
    DOG, CAT, HORSE
}

public class MapShow implements IShow {

    private Map<Object, Object> hm = new HashMap<Object, Object>();
    private TreeMap<String, String> tm = new TreeMap<>();
    private ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
    private Map<String, String> ht = new Hashtable();


    @Override
    public String toString() {
        tm.ceilingEntry(null);
        tm.headMap("null");
        tm.tailMap("null");
        hm.put("k1", new Dog("aiko"));
        Dog oldValue = (Dog) hm.replace("k1", new Dog("Replaced"));
        hm.put("k2", Pets.DOG);
        hm.put(Pets.CAT, "CAT key");
        Dog d1 = new Dog("clover");
        hm.put(d1, "Dog key");
        hm.put(new Cat(), "Cat key");
        // add some key/value pairs
        // let's keep this reference
        System.out.println(hm.get("k1"));
        String k2 = "k2";
        System.out.println(hm.get(k2));
        Pets p = Pets.CAT;
        System.out.println(hm.get(p));
        System.out.println(hm.get(d1));
        System.out.println(hm.get(new Cat()));
        System.out.println(hm.size());
//        Iterator<Object> keyIterator = hm.keySet().iterator();
//        while (keyIterator.hasNext()) {
//            Object nextKey = keyIterator.next();
//            System.out.println(nextKey.toString());
//            System.out.println(hm.get(nextKey));
//        }
//
//        for (Object key : hm.keySet()) {
//            System.out.println(hm.get(key));
//        }
        hm.forEach((k, v) -> System.out.println(k + " : " + v));

        return "HashMap -> " + hm.toString();
    }
}