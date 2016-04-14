package MyOwnTest;

/**
 * Created by Admin on 12.04.2016.
 */
public class Test7
/* Баг в initializeIdAndName
1. Подумать, что в программе неправильно.
2. Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Поправить программу, чтобы компилировалась и работала.
*/

{
    public static void main(String[] args) throws Exception
    {
        System.out.println(new Matrix().NEO);
        System.out.println(new Matrix().TRINITY);
    }

    static class Matrix
    {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject
    {
        DBObject initializeIdAndName(int id, String name);
    }

    static class User implements DBObject
    {
        int id;
        String name;

        public DBObject initializeIdAndName(int id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString()
        {
            return String.format("User has name %s, id = %d", name, id);
        }
    }

}
