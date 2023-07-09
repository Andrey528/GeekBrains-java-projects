package javaToyRaffle.models;

import java.util.ArrayList;

public interface JsonMethods {
    void loadFromJson();
    void saveToJson(ArrayList<Toy> toysToSave);
}
