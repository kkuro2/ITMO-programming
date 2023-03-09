package Objects.NotAlive;

import java.util.Objects;

import Interfaces.Arrangable;
import enums.BellType;

public class Bell implements Arrangable {
    private BellType type;
    private House house;

    public Bell(BellType type) {
        this.type = type;
    }
        
    public BellType getType() {
        return type;
    }
        
    public House getHouse() {
        return house;
    }
        
    public void setHouse(House house) {
        this.house = house;
    }

    public void whichBell() {
        System.out.print(" -- из тех, что подвязывают коровам, ");
    }

    @Override
    public void beArrangedInACertainWay() {
        System.out.print("Звонок был устроен таким образом: ");
    }
        
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bell bell = (Bell) obj;
        return type == bell.type &&
                Objects.equals(house, bell.house);
    }
        
    @Override
    public int hashCode() {
        return Objects.hash(type, house);
    }
        
    @Override
    public String toString() {
        return "Bell{" +
                "type=" + type +
                ", house=" + house +
                '}';
    }
}