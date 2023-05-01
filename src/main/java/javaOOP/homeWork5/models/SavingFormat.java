package javaOOP.homeWork5.models;

public class SavingFormat {
    private final String name;
    private final String value;
    private boolean isSelected;

    public SavingFormat(String name, String value) {
        this.name = name;
        this.value = value;
        this.isSelected = false;
    }

    public SavingFormat(String name, String value, boolean isSelected) {
        this.name = name;
        this.value = value;
        this.isSelected = isSelected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SavingFormat{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", isSelected=" + isSelected +
                '}';
    }
}
