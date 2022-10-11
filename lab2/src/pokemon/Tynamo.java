package pokemon;
import attacks.ChargeBeam;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Tynamo extends Pokemon {
    public Tynamo(String name, int lvl){
        super(name,lvl);
        this.addType(Type.ELECTRIC);
        this.setStats(35.0,55.0,40.0,45.0,40.0,60.0);
        this.addMove(new ChargeBeam());
        this.addMove(new ThunderWave());
    }
}
