package com.javarush.testweb.lv17.ls06.ts01;

/**
 * Created by Admin on 20.04.2016.
 */
import java.util.ArrayList;
import java.util.List;

/* Заметки для всех
Класс Note будет использоваться нитями.
Поэтому сделай так, чтобы лист notes находился в общей памяти
*/

public class Solution {
    public static class Note {

        public volatile List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}