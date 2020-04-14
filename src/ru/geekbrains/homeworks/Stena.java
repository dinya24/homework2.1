package ru.geekbrains.homeworks;

public class Stena extends Prepyatstvia {
    int visota;

    public Stena(int visota) {
        this.visota = visota;
    }
    @Override
    String doIt(Deistvia deistvia) {
        return deistvia.jump(visota);
    }
}
