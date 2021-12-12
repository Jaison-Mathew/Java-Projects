package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

import java.security.Provider;

public class EmployeeService extends Service<ObservableList<String>> {
    @Override
    protected Task<ObservableList<String>> createTask() {
        return new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                String[] names = {"Tim Buchalka,",
                        "Bill Rogers",
                        "Jack Jill",
                        "Joan Andrews",
                        "Mary Johnson",
                        "Bob McDonald" };

                ObservableList<String> employees =  FXCollections.observableArrayList();

                for (int i=0; i<6; i++){
                    employees.add(names[i]);
                    updateMessage("Added " + names[i] + " to the list.");
                    updateProgress(i + 1, 6);           //i+1 is the current progress, and 6 is the maximum progress. Current progress passes the number of names added.
                    Thread.sleep(200);
                }

                return employees;
            }
        };
    }
}
