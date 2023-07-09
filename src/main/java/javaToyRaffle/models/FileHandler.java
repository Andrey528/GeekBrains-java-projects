package javaToyRaffle.models;

import java.io.FileNotFoundException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;

public class FileHandler implements JsonMethods {
    private String fileName;
    private ArrayList<Toy> toys;

    public FileHandler(String fileName) {
        this.fileName = fileName;
        this.toys = new ArrayList<>();
        loadFromJson();
    }

    public FileHandler(String fileName, ArrayList<Toy> toys) {
        this.fileName = fileName;
        this.toys = toys;
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    @Override
    public void loadFromJson(){
        try {
            FileReader reader = new FileReader(fileName);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            JSONArray listOfToysFromJson = (JSONArray) jsonObject.get("toy");

            Iterator i = listOfToysFromJson.iterator();

            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                int id = Math.toIntExact((long) innerObj.get("id"));
                String name = (String) innerObj.get("name");
                int quantity = Math.toIntExact((long) innerObj.get("quantity"));
                double weight = (double) innerObj.get("weight");
                Toy toy = new Toy(id, name, quantity, weight);
                toys.add(toy);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveToJson(ArrayList<Toy> toysToSave) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"toy\": [\n");
            for (Toy toy: toysToSave) {
                writer.write("{\n");
                writer.write("\"id\":" + toy.getId() + ",\n");
                writer.write("\"name\":\"" + toy.getName() + "\",\n");
                writer.write("\"quantity\":" + toy.getQuantity() + ",\n");
                writer.write("\"weight\":" +  toy.getWeight() + "\n");
                writer.write("},\n");
            }
            writer.write("]\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
