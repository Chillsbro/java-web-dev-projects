package org.launchcode;

public class DVD extends Disc implements OpticalDisc {
    public DVD(double storageCapacity, double extraStorage, double rpm, String title, String year, double runtime) {
        super(storageCapacity, extraStorage, rpm, title, year, runtime);
    }

    public DVD(double storageCapacity, double rpm) {
        super(storageCapacity, rpm);
    }

    @Override
    public void spin() {
        System.out.println(this.getTitle() + " spins at a rate of " + this.getRpm() + " rpm");

    }

    @Override
    public void storeData() {
        System.out.println("This CD has " + getExtraStorage() + " mb's of extra data");
        
    }

    @Override
    public void writeData(double storage, String data) {
        if (this.getExtraStorage() - storage >= 0) {
            double storageLeft = this.getExtraStorage() - storage;
            this.setAddedStorage(storageLeft);
        } else {
            System.out.println("There is not enough space left on this CD for that data.");
        }
    }

    @Override
    public void readData() {
        this.setIsLoaded(true);
        System.out.println("DVD is now loaded, " + "systems show: " + this.getIsLoaded() + ", please use report data method to see it's contents.");

    }

    @Override
    public void reportData() {
        System.out.println(this);

    }
    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
