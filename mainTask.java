import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class mainTask {

    public static void main(String[] args) {
        Notebooks nb1 = new Notebooks("MSI Titan GT77 12UHS-208RU", 419900, 17.3, "Intel Core i9 2300 МГц", 8, 3072);
        Notebooks nb2 = new Notebooks("Lenovo IdeaPad 5 14ITL05", 48900, 14.0, "Intel Core i3 3000 МГц", 4, 256);
        Notebooks nb3 = new Notebooks("Samsung Galaxy Book NP750", 78990, 15.6, "Intel Core i7 2800 МГц", 16, 256);
        Notebooks nb4 = new Notebooks("ASUS X515EA-BQ189", 53990, 15.6, "Intel Core i5 2400 МГц", 8, 256);
        Notebooks nb5 = new Notebooks("HP ProBook 450 G9", 83990, 15.6, "Intel Core i5 1300 МГц", 8, 512);

        int filter = 0;
        Scanner scan = new Scanner(System.in);

        HashSet<Notebooks> allNB = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5));

        printMenu();
        filter = scan.nextInt();

        if (filter == 1) {
            Map<String, Integer> res = new HashMap<>();
            for (var el : allNB) {
                res.put(el.getModel(), el.getPrice());
            }
            List<Map.Entry<String, Integer>> result = res.entrySet().stream()
            .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
            .collect(Collectors.toList());
            System.out.println();
            for (var el : result) {
                System.out.print("| " + el.getKey() + " | " + el.getValue() + " руб | \n");
            }
        }
        if (filter == 2) {
            Map<String, Double> res = new HashMap<>();
            for (var el : allNB) {
                res.put(el.getModel(), el.getMonitor());
            }
            List<Map.Entry<String, Double>> result = res.entrySet().stream()
            .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
            .collect(Collectors.toList());
            System.out.println();
            for (var el : result) {
                System.out.print("| " + el.getKey() + " | " + el.getValue() + "\" | \n");
            }
        }
        if (filter == 3) {
            Map<String, Integer> res = new HashMap<>();
            for (var el : allNB) {
                res.put(el.getModel(), el.getRam());
            }
            List<Map.Entry<String, Integer>> result = res.entrySet().stream()
            .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
            .collect(Collectors.toList());
            System.out.println();
            for (var el : result) {
                System.out.print("| " + el.getKey() + " | " + el.getValue() + " GB | \n");
            }
        }
        if (filter == 4) {
            Map<String, Integer> res = new HashMap<>();
            for (var el : allNB) {
                res.put(el.getModel(), el.getSsd());
            }
            List<Map.Entry<String, Integer>> result = res.entrySet().stream()
            .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
            .collect(Collectors.toList());
            System.out.println();
            for (var el : result) {
                System.out.print("| " + el.getKey() + " | " + el.getValue() + " GB | \n");
            }
        }

        scan.close();
    }

    public static void printMenu() {
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - отфильтровать ноутбуки по цене");
        System.out.println("2 - отфильтровать ноутбуки по размеру экрана");
        System.out.println("3 - отфильтровать ноутбуки по RAM");
        System.out.println("4 - отфильтровать ноутбуки по SSD");
        System.out.println();
    }

    
}