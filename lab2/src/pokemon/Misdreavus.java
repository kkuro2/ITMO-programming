package pokemon;
import attacks.Growl;
import attacks.Rest;
import attacks.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Misdreavus extends Pokemon {
    public Misdreavus(String name, int lvl){
        super(name,lvl);
        this.addType(Type.GHOST);
        this.setStats(60.0,60.0,60.0,85.0,85.0,85.0);
        this.addMove(new Rest());
        this.addMove(new Thunderbolt());
        this.addMove(new Growl());
    }
}
