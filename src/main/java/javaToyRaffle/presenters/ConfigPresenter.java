package javaToyRaffle.presenters;

import javaToyRaffle.models.FileHandler;
import javaToyRaffle.models.Toy;
import javaToyRaffle.models.ToyHandler;
import javaToyRaffle.views.ConsoleView;

public class ConfigPresenter {
    private ConsoleView view;
    private ToyHandler toyHandler;
    private FileHandler fileHandler;

    public ConfigPresenter(ConsoleView view, ToyHandler toyHandler, FileHandler fileHandler) {
        this.view = view;
        this.toyHandler = toyHandler;
        this.fileHandler = fileHandler;
    }

    private void processInput(int choice) {
        switch (choice) {
            case 1 -> {
                view.showMessage("""
                        Let's add new toy. Scheme is:
                        String name; 
                        Integer quantity;
                        Double weight.
                        """);
                view.showMessage(toyHandler.addToy(new Toy(
                        toyHandler.getLength(),
                        view.readString(),
                        view.readInt(),
                        view.readDouble()
                )));
                fileHandler.saveToJson(toyHandler.getToys());
            }

            case 2 -> {
                toyHandler.getToys().forEach(item -> view.showMessage(item.toString()));
            }

            case 3 -> {
                Toy prizeToy = toyHandler.raffle();

                if (prizeToy == null) {
                    view.showMessage("No prize? sorry");
                }
                else {
                    view.showMessage("You won " + prizeToy.getName());
                    toyHandler.addPrizeToy(prizeToy);
                }
            }

            default -> {
                view.showMessage("Error in options");
            }
        }
    }

    public void buttonClick() {
        while(true){
            view.showMenu();
            int choice = view.readInt();
            if(choice == 0)
                break;
            if(choice < 0 || choice > 3) {
                view.showMessage("Error in choose. Please enter value from 0 to 3");
                continue;
            }
            processInput(choice);
        }
    }
}
