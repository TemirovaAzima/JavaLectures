
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
        // 5  // polymorphism
        Publication publication = new Publication("Idol",500);
        Publication audioBook = new AudioBook("AtomicHabits",1000,30,false);
        Publication book = new Book("Harry Potter",100,256);
        System.out.println(publication);
        System.out.println(audioBook);
        System.out.println(book);
        System.out.println(Publication.currentNumPublication());
        //6
        Point2D twoD = new Point2D(1,2);
        Point2D twoD2 = new Point2D(4,6);
        Point3D threeD = new Point3D(6,5,4);

        System.out.println("3d - 2d = " + threeD.distance(twoD));
        System.out.println("2d - 2d = " + twoD.distance(twoD2));
        System.out.println("3d - 3d =" + threeD.distance(threeD));
//        System.out.println(point2D1.distance(point2D2));
//        Point3D point1 = new Point3D(1,2,3);
//        Point3D point2 = new Point3D(4,6,5);
//        System.out.println(point3D.distance(point3D2));
//        System.out.println(point1.distance(point2));
//        System.out.println(point2.distance(point1));






    }
}
