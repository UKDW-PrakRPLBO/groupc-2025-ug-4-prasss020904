package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }


    @Override
    public double getRealBandwidth() {
        double ratio = (double) harga / 50000;
        if (ratio < 0.5) {
            return promisedBandwidth * 0.5;
        } else if (ratio < 1) {
            return promisedBandwidth * ratio;
        } else {
            return promisedBandwidth;
        }
    }
    }