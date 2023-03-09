package Objects.Alive;

import java.util.Objects;
import Objects.NotAlive.House;

public abstract class Human {
    protected String name;
    protected House house;
    
    public Human(String name, House house) {
        this.name = name;
        this.house = house;
    }
    
    public Human(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }
    
    public House getHouse() {
        return house;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Human human = (Human) obj;
        return Objects.equals(name, human.name) &&
               Objects.equals(house, human.house);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, house);
    }
    
    @Override
    public String toString() {
        return "Human{" +
               "name='" + name + '\'' +
               ", house=" + house +
               '}';
    }
}