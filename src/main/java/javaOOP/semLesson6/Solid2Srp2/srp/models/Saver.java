package javaOOP.semLesson6.Solid2Srp2.srp.models;

import javaOOP.semLesson6.Solid2Srp2.srp.models.Order;

import java.io.FileWriter;
import java.io.IOException;

public class Saver implements Savable {
    private String fileName;
    private javaOOP.semLesson6.Solid2Srp2.srp.models.Order order;

    public Saver(String fileName, Order order) {
        this.fileName = fileName;
        this.order = order;
    }

    @Override
    public void saveToJson() {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
