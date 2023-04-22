package javaIntorduction.homeWork6.Task1;

public class Laptop {
    private Integer ram;
    private Integer hdd;
    private String operatingSystem;
    private Integer videoCard;
    private String cpu;

    public Laptop(Integer ram, Integer hdd, String operatingSystem, Integer videoCard, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.videoCard = videoCard;
        this.cpu = cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(Integer videoCard) {
        this.videoCard = videoCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return String.format("НОУТБУК {ОЗУ: %s, ЖД: %s, ОС: %s, видеокарта: %s, процессор: %s}", ram, hdd, operatingSystem, videoCard, cpu);
    }
}
