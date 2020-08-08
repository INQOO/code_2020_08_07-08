package todolist;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class TodoList {
    Scanner scanner = new Scanner(System.in);
    List<Todo> tasks = new ArrayList<>();
    long idCounter = 1;

    void run() {
        while(true) {
            showMenu();
            MenuOption choice = askUser();

            switch (choice) {
                case ADD:
                    addTask();
                    break;
                case REMOVE:
                    removeTask();
                    break;
                case SHOW:
                    showTasks();
                    break;
                case EXIT:
                    exit();
            }
        }
    }

    private void exit() {
        // mozna wypisac koniec
        // wygooglujcie, jak zakonczyc program w java
    }

    private void showTasks() {
        // sprawdzic czy sa jakies zadania
        // jesli nie ma, to wypiszmy "brak zadan"
        // jesli sa, to:
        // zapytac o kategorie
        // wypisac wszystkie zadania z listy tasks
        //    ktore maja wybrana kategorie

        // ZROBIC TO STREAMEM
    }

    private void removeTask() {
        // zapytac usera o id
        // wypisac "brak zadania" jesli zadanie o danym id nie istnieje
        // usunac Todo z danym id z listy tasks
    }

    private void addTask() {
        showCategories();
        System.out.print("Podaj kategorię: ");
        Category category = Category.valueOf(scanner.next());

        System.out.print("Podaj nazwę: ");
        String name = scanner.nextLine();

        // stworzyc nowy Todo z ta nazwa i kategoria
        // jako id ustawic biezacy idCounter i zwiekszyc go o 1
        // wiec np. pierwsze todo ma miec id 1, drugie 2, itd.
        // dodajemy Todo do listy tasks
    }

    private void showMenu() {
        System.out.println("=== MENU ===");
        System.out.println("ADD: Dodaj zadanie");
        System.out.println("REMOVE: Usuń zadanie");
        System.out.println("SHOW: Pokaż zadania");
        System.out.println("EXIT: Wylyź");
    }

    private void showCategories() {
        System.out.println("Dostępne kategorie:");
        Arrays.stream(Category.values())
                .forEach(x -> System.out.println(x));
    }

    private MenuOption askUser() {
        System.out.print("Podaj opcję: ");
        String choice = scanner.next();
        return MenuOption.valueOf(choice);
    }
}
