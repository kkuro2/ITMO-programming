package Objects.Alive;

import Objects.NotAlive.House;

public class Carlson extends Human {
    public Carlson(House house) {
        super("Карлсон", house);
    }

    public void hangBell() {
        System.out.print("под карнизом своего домика " + getName() +  " прибил колокольчик");
    }

    public void stretchCord(Human Junior) {
        System.out.print("-- а шнур от него протянул к окну " + Junior.getName() + "а. ");
    }
    
    public void appear() {
        System.out.print("и он тут как тут.");
    }

    public void answerCall() {
        System.out.print("пока не появится " + getName() + ". ");
    }
}