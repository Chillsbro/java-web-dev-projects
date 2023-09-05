package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private String name;

    public MenuItem(double p, String d, String c, boolean iN, String n) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
        this.name = n;
    }

    @Override
    public String toString() {
        return "\n" + getName() + "\n" +
                "Price: " + this.price + "\n" +
                "Description: " + this.description + "\n" +
                "Category: " + this.category + "\n" +
                "New: " + this.isNew + "\n";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public Boolean getIsNew() {
        return this.isNew;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public Boolean isEqual(Object toBeCompared) {
        MenuItem item = (MenuItem) toBeCompared;
        return item.getName().equals(getName());
    }
}
