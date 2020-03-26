package com.example.cmpe277lab3;

public class Cafe {
    public String id;
    public String content;
    public double rating;
    public String address;
    public double lat;
    public double lon;

    public Cafe(String id, String content, double rating, String address, double lat, double lon) {
        this.id = id;
        this.content = content;
        this.rating = rating;
        this.address = address;
        this.lat = lat;
        this.lon = lon;
    }
}
