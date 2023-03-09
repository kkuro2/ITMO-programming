package Objects.Alive;

import Exceptions.InvalidNameException;
import Objects.NotAlive.House;

public class Carlson extends Human {
    public Carlson(String name, House house) throws InvalidNameException {
        super(house);
        try {
            if (!name.equals("Карлсон")) 
                throw new InvalidNameException();
            this.name = name;
        } catch (InvalidNameException e) {
            System.out.println(e);
            System.out.println("Дайте верное имя " + this.getClass());
            this.name = "NO_NAME";
        }
            
    }

    public void hangBell() {
        System.out.print("под карнизом своего домика " + getName() +  " прибил колокольчик");
    }

    public void stretchCord(Human junior) {
        System.out.print("-- а шнур от него протянул к окну " + junior.getName() + "а. ");
    }

    public void appear() {
        System.out.println("и он тут как тут. ");
    }

    public void answerCall() {
        System.out.print("пока не появится " + getName() + ". ");
    }

    public void flyIntoTheWindow() {
        System.out.print("Вскоре послышалось жужжание моторчика, и " + getName() + " влетел в окно. ");
    }

    public void resent() {
        System.out.println("- Ты, наверно, думаешь, что это не колокольчик, а будильник?  - проворчал он. ");
    }

    public void shouldHaveKnown() {
        System.out.print("- Вот и узнал бы прежде, чем будить. ");
    }
    
    public void marmot() {
        System.out.print("Сам небось дрыхнешь, как сурок, и не можешь понять таких, как я, которым за ночь ни на минуту не удаётся сомкнуть глаз. ");
        class People {
            String toDoPeople(String string) {
                return "И когда наконец хоть ненадолго забывается сном, он вправе ожидать, " + string;
            }
        }
        People people = new People();
        var anonym = new People(){
            String toDoAnonym(){
                return "что друг будет оберегать его покой, а не трезвонить почём зря, словно пожарная машина...";
            }
        };
        System.out.println(people.toDoPeople(anonym.toDoAnonym()));
    }

    public void nod() {
        System.out.println(getName() + " угрюмо кивнул.");
    }

    public void yeah() {
        System.out.println("- Представь себе, да.");
    }

    public void itIs() {
        System.out.println("- Хуже быть не может, - ответил " + getName() + ". - Собственно говоря, ночью я сплю беспробудно и перед обедом тоже, а вот после обеда дело обстоит из рук вон плохо, лежу с открытыми глазами и ворочаюсь с боку на бок.");
    }

    public void shush() {
        System.out.print(getName() + " умолк, ");
    }

    public void giveMeAPresent() {
        System.out.println("- Правда, если бы я получил небольшой подарочек, то, может, перестал бы огорчаться, что ты меня разбудил.");
    }
    
}