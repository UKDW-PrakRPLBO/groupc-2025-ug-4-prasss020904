package org.example;

public class VGA extends Colokan {
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        double ratio = (double) harga / 30000;
        if (ratio < 1) {
            return promisedBandwidth - (promisedBandwidth * (1 - ratio));
        } else {
            return promisedBandwidth;
        }
    }
}