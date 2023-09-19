package org.launchcode;

public class VinylRecord extends Disc implements OpticalDisc {

    public VinylRecord(double storageCapacity, String title, String year, double runtime) {
        super(storageCapacity, title, year, runtime);
    }

    @Override
    public String spin() {
        return this.getTitle() + " is a vinyl record and spins at speeds of " + 33 + " " + 45 + " or " + 75 + " rpms";

    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeData(double storage, String data) {
        if (this.getExtraStorage() - storage >= 0) {
            double storageLeft = this.getExtraStorage() - storage;
            this.setAddedStorage(storageLeft);
            System.out.println(data + "is being recorded to the " + this.getTitle() + " Vinyl.");
        } else {
            System.out.println("There is not enough space left on this Vinyl for " + storage + " mb's of data. There is " +
                    "only " + this.getExtraStorage() + " available.");
        }

    }

    @Override
    public void readData() {
        this.setIsLoaded(true);
        System.out.println("Vinyl is now on the track, " + "systems show: " + this.getIsLoaded() + ", please use report data method to see it's contents.");

    }

    @Override
    public void reportData() {
        System.out.println(this);
    }
}
