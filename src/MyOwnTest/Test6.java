package MyOwnTest;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by Admin on 24.03.2016.
 */
public class Test6
{
    public static void main(String[] args)
    {
        LinkedHashSet<Dog> dset = new LinkedHashSet<Dog>();
        dset.add(new Dog(2));
        dset.add(new Dog(1));
        dset.add(new Dog(3));
        dset.add(new Dog(5));
        dset.add(new Dog(4));

        Iterator<Dog> iterator = dset.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public  static class Dog {
        int size;

        public Dog(int s) {
            size = s;
        }

        public String toString() {
            return size + "";
        }
    }
}
