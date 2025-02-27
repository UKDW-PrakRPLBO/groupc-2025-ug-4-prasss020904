package org.example;

public abstract class Colokan {
    public int harga;
    public double promisedBandwidth;
    public String merk;

    public Colokan(int harga, double promisedBandwidth, String merk) {
        this.harga = harga;
        this.promisedBandwidth = promisedBandwidth;
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public abstract double getRealBandwidth();

}
