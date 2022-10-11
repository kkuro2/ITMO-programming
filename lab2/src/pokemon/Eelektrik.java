package pokemon;
import attacks.AcidSpray;
import attacks.ChargeBeam;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eelektrik extends Pokemon {
    public Eelektrik(String name,int lvl){
        super(name,lvl);
        this.addType(Type.ELECTRIC);
        this.setStats(65.0, 85.0, 70.0, 75.0, 70.0, 40.0);
        this.addMove(new ChargeBeam());
        this.addMove(new ThunderWave());
        this.addMove(new AcidSpray());
    }
}
