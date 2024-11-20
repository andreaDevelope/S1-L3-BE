//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //es1
    Rettangolo rett1 = new Rettangolo(10.2, 8.7);
    Rettangolo rett2 = new Rettangolo(18.2, 15.7);

    rett1.getLatoMaggiore();
    rett1.stampa2Rettangoli(rett1, rett2);
    }
}