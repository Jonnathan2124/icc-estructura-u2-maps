package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        LinkedHashMap();
        treeHashMap();

    }

    public void hashMap(){
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Mazana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        //contaisKey
        System.out.println("Hay para: "+mapa.containsKey("Pera"));
        System.out.println("Hay para: "+mapa.containsKey("Kiwi"));

        //Obtener el valor
        System.out.println("Valor de pera "+mapa.get("Pera"));

        //Eliminar item
        mapa.remove("Pera");

        System.out.println(mapa);
    }

    public void LinkedHashMap(){
        LinkedHashMap<String, Integer> linkMapa = new LinkedHashMap<>();

        linkMapa.put("Mazana", 10);
        linkMapa.put("Pera", 11);
        linkMapa.put("Durazno", 5);
        linkMapa.put("Mango", 6);
        
        System.out.println("linked Map");
        System.out.println(linkMapa);

    }

    public void treeHashMap(){
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Mazana", 10);
        treeMap.put("Pera", 11);
        treeMap.put("Durazno", 5);
        treeMap.put("Mango", 6);

        System.out.println("tree map");
        System.out.println(treeMap);

    }
}
