package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String eng = "Smart";
        return "Неизвестное слово " + eng;

    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String text = word.engToRus();
        System.out.println(text);
            }
}
