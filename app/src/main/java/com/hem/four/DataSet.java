package com.hem.four;

import java.util.ArrayList;
import java.util.List;

public class DataSet {

    public static List<Item> getData(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Title1", "Subtitle1"));
        items.add(new Item("Title2", "Subtitle2"));
        items.add(new Item("Title3", "Subtitle3"));
        items.add(new Item("Title4", "Subtitle4"));
        items.add(new Item("Title5", "Subtitle5"));
        return items;
    }
}
