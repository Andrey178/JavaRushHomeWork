package MyOwnTest;

/**
 * Created by Admin on 03.03.2016.
 */

public class Test
{

public static void main(String[] args){
    Cat cat1 = new Cat("Vaska");
    Cat cat2 = new Cat("Barsik", 13, 20);
    Cat cat3 = new Cat("Murzik", 8);
    Cat cat4 = new Cat(1, "black");
    Cat cat5 = new Cat(3,"yellow", "Beiker str.");
      System.out.println(cat1.name + " " + cat1.weight + " " + cat1.age);
        System.out.println(cat2.name + " " + cat2.weight + " " + cat2.age);
        System.out.println(cat3.name + " " + cat3.weight + " " + cat3.age);
        System.out.println(cat4.name + " " + cat4.weight + " " + cat4.age);
        System.out.println(cat5.name + " " + cat5.weight + " " + cat5.age);
        System.out.println(cat1.name + " " + cat1.weight + " " + cat1.age + " " + cat1.color + " " + cat1.address);
        System.out.println(cat2.name + " " + cat2.weight + " " + cat2.age + " " + cat2.color + " " + cat2.address);
        System.out.println(cat3.name + " " + cat3.weight + " " + cat3.age + " " + cat3.color + " " + cat3.address);
        System.out.println(cat4.name + " " + cat4.weight + " " + cat4.age + " " + cat4.color + " " + cat4.address);
        System.out.println(cat5.name + " " + cat5.weight + " " + cat5.age + " " + cat5.color + " " + cat5.address);
        System.out.println(cat5);
        }

    public static class Cat
    {
        //напишите тут ваш код
        private String name;
        private int weight = 5;
        private int age = 4;
        private String color;
        private String address;
//            String name; int weight, age; String color, address;
        public Cat(String name) {
//            this.name = name;
            this(name, 84);
        }
        public Cat(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Cat(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }
        public Cat(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
        }

    }
}
