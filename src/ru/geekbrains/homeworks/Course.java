package ru.geekbrains.homeworks;

public class Course {
    private Prepyatstvia[] prepyatstvias;

    public Course(Prepyatstvia... prepyatstvias) {
        this.prepyatstvias = prepyatstvias;
    }



    void doIt(Team team){
        Ucastniki[] ucastnikis = team.getUcastnikis();
        if(ucastnikis.length == 0){
            System.out.println("Команда пуста");
            return;
        }
        for (Ucastniki u: ucastnikis){
            for (Prepyatstvia p: prepyatstvias){
                team.setResult(p.doIt(u));
                if(!u.isOnDistance()){
                    break;
                }
            }
        }
    }

}
