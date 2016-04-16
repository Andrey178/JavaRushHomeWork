package com.javarush.testweb;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Admin on 15.04.2016.
 */
public class lv15ls02ts04
/* ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain]. Параметр конструктора - имя книги.
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook расширьте тип возвращаемого результата.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.
*/

{
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
/*        System.out.println("----------");
        for (Book book : books)
        {
            System.out.println(book);
        }*/
    }

    public abstract static class Book
    {
        private String author;

        public Book(String author)
        {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType()
        {
            String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
            String markTwainOutput = getBook().getName() + " book was written by " + author;

            String output = "output";
            //Add your code here
            if (getBook() instanceof MarkTwainBook) {
                output = markTwainOutput;
            } else if (getBook() instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }


//            return output;
            return output;
        }
        public String toString() {
            return getOutputByBookType();
        }
    }
    public static class MarkTwainBook extends Book {
        String bookname;
        public MarkTwainBook(String bookname)
            {
                super("Mark Twain");
                this.bookname = bookname;
            }
// пункт 3 "расширьте" Book поменяли на MarkTwainBook
            public MarkTwainBook getBook() {return this;}
            public String getName() {return bookname;}
        }
        public static class AgathaChristieBook extends Book {
            String bookname;
            public AgathaChristieBook(String bookname)
            {
                super("Agatha Christie");
                this.bookname = bookname;
            }
            public AgathaChristieBook getBook() {return this;}
            public String getName() {return bookname;}
        }

}
