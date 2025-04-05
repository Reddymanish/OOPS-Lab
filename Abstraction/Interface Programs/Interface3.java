interface Printer {
    void printDocument(String document);
}


class InkjetPrinter implements Printer {
    public void printDocument(String document) {
        System.out.println("Inkjet Printer: Printing -> " + document);
    }
}


class LaserPrinter implements Printer {
    public void printDocument(String document) {
        System.out.println("Laser Printer: Printing -> " + document);
    }
}


public class Interface3 {
    public static void main(String[] args) {
        Printer inkjet = new InkjetPrinter();
        Printer laser = new LaserPrinter();
       
        inkjet.printDocument("Report.pdf");
        laser.printDocument("Invoice.docx");
    }
}