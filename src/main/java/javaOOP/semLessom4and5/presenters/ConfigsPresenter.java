//package javaOOP.semLessom4and5.presenters;
//
//import javaOOP.semLessom4and5.models.ConfigStorage;
//import javaOOP.semLessom4and5.models.Option;
//import javaOOP.semLessom4and5.models.PrinterSetting;
//import javaOOP.semLessom4and5.views.base.IView;
//
//public class ConfigsPresenter {
//    private final IView view;
//    private ConfigStorage storage;
//
//    public ConfigsPresenter(IView view, ConfigStorage storage) {
//        this.view = view;
//        this.storage = storage;
//    }
//
//    private Option readOption(){
//        view.showMessage("Enter option name");
//        String name = view.readString();
//        view.showMessage("Enter option name");
//        String value = view.readString();
//        view.showMessage("Option selected?");
//        boolean isSelected = view.readBoolean();
//        return new Option(name, value, isSelected);
//    }
//
//    private PrinterSetting readPrinterSettings(){
//        view.showMessage("Enter option name");
//        String name = view.readString();
//        view.showMessage("Enter option name");
//        String value = view.readString();
//        return new PrinterSetting(name, value);
//    }
//
//    private void proceessInput(int choose) {
//        switch (choose) {
//            case 1 -> {
//                Option option = readOption();
//                storage.addOption(option);
//            }
//            case 2 -> {
//                PrinterSetting printerSetting = readPrinterSettings();
//                storage.addPrinterSetting(printerSetting);
//            }
//            case 3 -> {
//            }
//            case 4 -> {
//            }
//        }
//
//    }
//
//    public void buttonClick() {
//        ConfigStorage storage = new ConfigStorage();
//        while(true){
//            view.showMenu();
//            view.showMessage("Enter your choose: ");
//            int choose = view.readInt();
//            if(choose==0)
//                break;
//            if(choose<0 || choose>4) {
//                view.showMessage("Error in choose. Please enter value from 0 to 4\nEnter your choose: ");
//                continue;
//            }
//            proceessInput(choose);
//        }
//    }
//}
