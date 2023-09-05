package org.launchcode;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(String name, Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }


//    public String getName() {
//        return name;
//    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem newItem) {
        this.items.add(newItem);
    }

    public void removeItem(MenuItem itemToDelete) {
        this.items.remove(itemToDelete);
    }

}
