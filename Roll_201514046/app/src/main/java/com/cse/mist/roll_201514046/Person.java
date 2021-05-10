package com.cse.mist.roll_201514046;

import java.io.Serializable;

/**
 * Created by Tonni on 8/08/2017.
 */

public class Person implements Serializable {
    String Name,Item,meat,fruit;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
