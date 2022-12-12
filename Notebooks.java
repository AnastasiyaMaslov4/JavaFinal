public class Notebooks {
    
    String model;
    Integer price;
    Double monitor;
    String processor;
    Integer ram;
    Integer ssd;

    Notebooks(String mod, Integer pr, Double mon, String proc, Integer r, Integer s){
        model = mod;
        price = pr;
        monitor = mon;
        processor = proc;
        ram = r;
        ssd = s;
    }

    void PrintAllInfo() {
        System.out.println(model + " " + price + " " + monitor + " " + processor + " " + ram + " " + ssd);
    }

    Integer getPrice() {
        return price;
    }

    Double getMonitor() {
        return monitor;
    }

    Integer getRam() {
        return ram;
    }

    Integer getSsd() {
        return ssd;
    }

    String getModel() {
        return model;
    }
    
}
