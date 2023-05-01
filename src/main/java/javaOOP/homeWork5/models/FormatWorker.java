package javaOOP.homeWork5.models;

import java.util.ArrayList;
import java.util.List;

public class FormatWorker {
    private ArrayList<SavingFormat> savingFormats;
    private Integer length;

    public FormatWorker(ArrayList<SavingFormat> savingFormats) {
        this.savingFormats = savingFormats;
        this.length = savingFormats.size();
    }

    public String addSavingFormat(SavingFormat format) {
        if (savingFormats.add(format)) {
            length = savingFormats.size();
            return "Success";
        }
        else return "Fail to add saving format";
    }

    public String deleteSavingFormat(Integer index){
        if (length != 0 && 0 <= index && index < length) {
            savingFormats.remove((int) index);
            length = savingFormats.size();
            return "Success";
        }
        else return "Fail to remove saving format";
    }

    public Object getSavingFormatByIndex (Integer index) {
        if (length != 0 && 0 <= index && index < length) return savingFormats.get(index);
        else return "Can't find saving format by input index";
    }

    public List<String> getAllSavingFormats () {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            result.add(i + ") " + "\"" + getSavingFormatByIndex(i).toString() + "\"");
        }
        return result;
    }

    public SavingFormat getSelectedFormat () {
        for (SavingFormat savingFormat: savingFormats)
        {
            if(savingFormat.isSelected()) return savingFormat;
        }
        return null;
    }

    public Object selectFormat (Integer index) {
        if (length != 0 && 0 <= index && index < length) {
            savingFormats.forEach(item -> item.setSelected(false));
            savingFormats.get(index).setSelected(true);
            return "Success";
        }
        else return "Can't find contact by input index";
    }
}
