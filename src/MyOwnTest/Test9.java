package MyOwnTest;

/**
 * Created by Admin on 06.02.2017.
 */
public class Test9
{
    public static void main(String[] args)
    {
        String filename = "1.txt5";

//        if (!filename.substring(filename.length()-4).equals(".txt")) {
        if (!filename.endsWith(".txt")) {
            System.out.println("вижу тхт файл!".toUpperCase());
        }
    }
}
