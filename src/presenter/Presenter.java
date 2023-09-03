package presenter;

import model.FileExporter;
import model.Person;
import view.View;

public class Presenter {
    public Presenter() {
        view = new View();
    }
    private Person person;
    private View view;
    public void main() throws Exception {
        person = new Person(view.getStrValue("данные пользователя через пробел"));
        person.exportData(new FileExporter());
    }
}
