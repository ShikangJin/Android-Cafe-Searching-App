package com.example.cmpe277lab3;

import java.util.ArrayList;
import java.util.List;

public class CafeProvider {
    static private List<Cafe> data = new ArrayList<>();

    // Fake Data Generate
    static public void generateData() {
        data.clear();
        data.add(new Cafe("0", "Bajis Cafe", 4.4, "2423 Old Middlefield Way, Mountain View, CA 94043", 37.415424, -122.097867));
        data.add(new Cafe("1", "Peet's Cafe", 4.2, "801 W El Camino Real suite a, Mountain View, CA 94040", 37.391210, -122.081119));
        data.add(new Cafe("2", "Pearl Cafe", 4.2, "506 Showers Dr suite a, Mountain View, CA 94040", 37.404606, -122.107613));
        data.add(new Cafe("3", "Regal Bagel Café", 4.4, "570 N Shoreline Blvd, Mountain View, CA 94043", 37.404016, -122.079364));
        data.add(new Cafe("4", "Ocha Tea Cafe", 3.0, "1350 Grant Rd, Mountain View, CA 94040", 37.379049, -122.077432));
        data.add(new Cafe("5", "Starbucks", 4.2, "1037-C, El Monte Ave, Mountain View, CA 94040", 37.392341, -122.094789));
        data.add(new Cafe("6", "Starbucks", 3.2, "570 N Shoreline Blvd, Mountain View, CA 94040", 37.404546, -122.079082));
        data.add(new Cafe("7", "Starbucks", 4.3, "580 N Rengstorff Ave, Mountain View, CA 94043", 37.413409, -122.094960));
        data.add(new Cafe("8", "Tea Annie", 4.4, "1712 Miramonte Ave suite a, Mountain View, CA 94040", 37.374848, -122.087835));
    }

    static public List<Cafe> getData() {
        return data;
    }

}
