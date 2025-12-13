public class Main {
    public static void main(String[] arg){
        // 1
        Person person = new Person("Kim");
        Welder welder = new Welder("Emilly","middle");
        System.out.println(person.displayDetails());
        System.out.println(welder.displayDetails());
        // 2
         Employee employee = new Employee("Jennifer" , "Lue",3000);
         Manager manager = new Manager("Tiffany", "Leo",5000,0.2);
         System.out.println(manager.getBaseSalary());
         System.out.println(manager.totalSalary());
         // 3
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.area();
        Cuboid cuboid = new Cuboid(4,5,8);
        cuboid.surfaceArea();
        cuboid.volume();

        Triangle triangle = new Triangle(4);
        triangle.area();

        Pyramid pyramid = new Pyramid(9);
        pyramid.surfaceArea();
        pyramid.volume();

        Prism prism = new Prism(6,5);
        prism.surfaceArea();
        prism.volume();

        // 4
        Product product = new Product("Watch",5);
        System.out.println(product.getGrossPrice());
        ImportedProduct importedProduct = new ImportedProduct("Watch",5,15);
        System.out.println(importedProduct.getGrossPrice());
        Product product1 = new Product("Watch",5);
        System.out.println(product1.getGrossPrice());
        System.out.println(product1.getGrossPrice());
        ImportedProduct importedProduct2 = new ImportedProduct("Watch",100,15);
        System.out.println(importedProduct2.getGrossPrice());
        System.out.println(importedProduct2.getGrossPrice());


    }
}
