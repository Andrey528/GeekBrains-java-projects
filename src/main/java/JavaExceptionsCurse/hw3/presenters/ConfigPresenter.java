package JavaExceptionsCurse.hw3.presenters;

import JavaExceptionsCurse.hw3.exceptions.CheckUserNameException;
import JavaExceptionsCurse.hw3.exceptions.ConvertToIntException;
import JavaExceptionsCurse.hw3.exceptions.IOExceptionWithCode;
import JavaExceptionsCurse.hw3.exceptions.InsufficientlyDataException;
import JavaExceptionsCurse.hw3.models.FileWorker;
import JavaExceptionsCurse.hw3.models.User;
import JavaExceptionsCurse.hw3.views.ConsoleView;

import java.util.ArrayList;
import java.util.Scanner;

public class ConfigPresenter {
    private ConsoleView view = new ConsoleView(new Scanner(System.in));

    public void buttonClick() {
        try {
            ArrayList res = view.parseUserInput();
            User user = new User(
                    (String) res.get(0),
                    (String) res.get(1),
                    (String) res.get(2),
                    (int) res.get(3)
            );

            FileWorker fw = new FileWorker((String) res.get(2), user);
            fw.saveToTxt();
        } catch (CheckUserNameException | ConvertToIntException | InsufficientlyDataException | IOExceptionWithCode e) {
            view.showMessage(e.toString());
        }
    }
}
