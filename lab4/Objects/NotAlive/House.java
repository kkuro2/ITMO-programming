package Objects.NotAlive;

import java.util.Objects;

public class House {
    private String address;
    private Bell bell;
        
    public House(String address, Bell bell) {
        this.address = address;
        this.bell = bell;
        this.bell.setHouse(this);
    }
        
    public String getAddress() {
        return address;
    }
        
    public Bell getBell() {
        return bell;
    }
        
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        House house = (House) obj;
        return Objects.equals(address, house.address) &&
                Objects.equals(bell, house.bell);
    }
        
    @Override
    public int hashCode() {
        return Objects.hash(address, bell);
    }
        
    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", bell=" + bell +
                '}';
    }
}