package org.launchcode;

public class Disc {
    private boolean isLoaded = false;
    private double storageCapacity;
    private String title;
    private String year;
    private double runtime;
    private double extraStorage;

    public Disc(double storageCapacity, double addedStorage, String title, String year, double runtime) {

        this.storageCapacity = storageCapacity;
        this.extraStorage = addedStorage;
        this.title = title;
        this.year = year;
        this.runtime = runtime;
    }

    public Disc(double storageCapacity) {

        this.storageCapacity = storageCapacity;

    }

    public Disc(double storageCapacity, String title, String year, double runtime) {
        this.storageCapacity = storageCapacity;
        this.title = title;
        this.year = year;
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return "Title: " + this.getTitle() + newline +
                "Year Released: " + this.getYear() + newline +
                "Total Runtime: " + this.getRuntime() + " minutes" + newline +
                "Total Storage: " + (this.storageCapacity + this.extraStorage) + " megabytes " + newline +
                "Currently Loaded : " + this.getIsLoaded() + newline;
    }

    public boolean getIsLoaded() {
        return isLoaded;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public double getExtraStorage() {
        return extraStorage;
    }


    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setIsLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public void setAddedStorage(double extraStorage) {
        this.extraStorage = extraStorage;
    }
}
