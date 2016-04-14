package MyOwnTest;

/**
 * Created by Admin on 12.04.2016.
 */
public class Test8
{
    public static void main(String[] args) throws Exception
    {
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>
            //допишите здесь ваш код
    {
        public SimpleObject<String> getInstance()
        {
            String s = "";
            return null;
        }
    }
}
