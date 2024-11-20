public class Rettangolo {

    private double latoMaggiore;
    private double latoMinore;
    private double area;
    private double perimetro;

    public Rettangolo(double latoMaggiore, double latoMinore){
        this.latoMaggiore = latoMaggiore;
        this.latoMinore = latoMinore;
   }

   public double getLatoMaggiore(){
        return this.latoMaggiore;
   }

    public double getLatoMinore(){
        return this.latoMinore;
    }

    public double getArea(){
        return this.latoMaggiore * this.latoMinore;
    }

    public double getPerimetro(){
        return 2 * (this.latoMinore + this.latoMaggiore);
    }

    public void stampa2Rettangoli(Rettangolo rett1, Rettangolo ret2){
        double sommaArea = rett1.getArea() + ret2.getArea();
        double sommaPerimetro = rett1.getPerimetro() + ret2.getPerimetro();

        System.out.println("AREA RETTANGOLO1: " + rett1.getArea() +
                " PERIMETRO RETTANGOLO1: " + rett1.getPerimetro() +
                "\nAREA RETTANGOLO2: " + ret2.getArea() +
                " PERIMETRO RETTANGOLO2: " + ret2.getPerimetro() +
                "\nSOMMA AREA DEI 2 RETTANGOLI: " +  sommaArea +
                "\nSOMMA PERIMETRI DEI 2 RETTANGOLI: " + sommaPerimetro

        );
    }

    public void stampaRettangolo(){
        System.out.println("LATO MAGGIORE: " + this.latoMaggiore +
                "\nLATO MINORE: "+ this.latoMinore +
                "\nAREA: " + this.getArea() +
                "\nPERIMETRO: " + this.getPerimetro());
    }
}
