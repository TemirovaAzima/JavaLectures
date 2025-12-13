public class ImportedProduct extends Product {
    private double importDuty;

    public ImportedProduct(String name,double netPrice,double importDuty){
        super(name,netPrice);
        this.importDuty = importDuty;
    }

    public double getGrossPrice(){
//        double duty = getNetPrice() * importDuty/100;
//        double vat = (getNetPrice() + duty) * getVatRate()/100;
//        return getNetPrice() + duty + vat;

        double priceWithDuty = getNetPrice()* (1 + importDuty/100);
        return priceWithDuty * (1 + getVatRate()/100);
//        double duty = getNetPrice() * (1 + importDuty/100);
//        setNetPrice(duty);           // Wrong way but works
//        return super.getGrossPrice();
    }
}
