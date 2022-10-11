package pokemon;
import attacks.Growl;
import attacks.MysticalFire;
import attacks.Rest;
import attacks.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mismagius extends Pokemon {
    public Mismagius(String name, int lvl){
        super(name,lvl);
        this.addType(Type.GHOST);
        this.setStats(60.0,60.0,60.0,105.0,105.0,105.0);
        this.addMove(new Rest());
        this.addMove(new Thunderbolt());
        this.addMove(new Growl());
        this.addMove(new MysticalFire());
    }
}
