package Objects.Alive;

import Interfaces.Waitable;
import Objects.NotAlive.House;

public class Junior extends Human implements Waitable {
    public Junior(House house) {
        super("Малыш", house);
    }

    public void thinkSo() {
        System.out.print(getName() + " тоже так думал. ");
    }
    
    @Override
    public void hadToWait() {
        System.out.print("Раньше ему подолгу приходилось ждать, ");
    }
}