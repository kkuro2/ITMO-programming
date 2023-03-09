package Objects.Alive;

import Exceptions.InvalidNameException;
import Interfaces.Waitable;
import Objects.NotAlive.House;

public class Junior extends Human implements Waitable {
    public Junior(String name, House house) {
        super(house);
        try {
            if (!name.equals("Малыш")) 
                throw new InvalidNameException();
            this.name = name;
        } catch (InvalidNameException e) {
            System.out.println(e);
            System.out.println("Дайте верное имя " + this.getClass());
            this.name = "NO_NAME";
        }
    }

    public void thinkSo() {
        System.out.print(getName() + " тоже так думал. ");
    }

    @Override
    public void hadToWait() {
        System.out.print("Раньше ему подолгу приходилось ждать, ");
    }

    public void feelToTalk(Carlson carlson) {
        System.out.print("И вдруг " + getName() + " почувствовал, что ему, во что бы то ни стало, надо поговорить с " + carlson.getName() + "ом. ");
    }
    
    public void pullAndPull() {
        System.out.print("Он дёрнул за шнурок раз, другой, третий... ");
    }
    
    public void sorry() {
        System.out.println("- Прости, - сказал " + getName() + ", - я не знал, что ты спишь.");
    }

    public void doubt() {
        System.out.println("- Разве ты плохо спишь? - спросил " + getName() + ". ");
    }

    public void thinkHowSad() {
        System.out.println("“Как это печально”, - подумал " + getName() +" и сказал:");
    }
    
    public void isItReallyBad() {
        System.out.println("- Мне так жаль... У тебя в самом деле так плохо со сном?");
    }

    public void searchForAPresent(Human carlson) {
        System.out.println(getName() + " не хотел, чтобы " + carlson.getName() + " сердился, и стал искать, что бы ему подарить.");
    }
    
}