package pokemon;
import attacks.Haze;
import attacks.SludgeBomb;
import attacks.Swagger;
import attacks.VenomDrench;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seviper extends Pokemon {
    public Seviper(String name,int lvl){
        super(name,lvl);
        this.addType(Type.POISON);
        this.setStats(73.0, 100.0, 60.0, 100.0, 60.0, 65.0);
        this.addMove(new VenomDrench());
        this.addMove(new SludgeBomb());
        this.addMove(new Swagger());
        this.addMove(new Haze());
    }
}
