package org.example;

public class TV {
    public int resolution;
    public Colokan colokan;


    public TV(int resolution)
    {
        this.resolution = resolution;
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

    public int getResolution() {
        double bandwidth = colokan.getRealBandwidth();
        int resolution;
        if (bandwidth <= 35) {
            resolution = 480;
        } else if (bandwidth <= 100) {
            resolution = 720;
        } else {
            resolution = 1080;
        }
        if (resolution > this.resolution) {
            return this.resolution;
        }
        return resolution;
    }
}