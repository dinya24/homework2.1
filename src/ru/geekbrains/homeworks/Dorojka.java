package ru.geekbrains.homeworks;

public class Dorojka extends Prepyatstvia {
    private int dlina;

    public Dorojka(int dlina) {
        this.dlina = dlina;
    }

    @Override
    String doIt(Deistvia deistvia) {
        return deistvia.run(dlina);
    }
}
