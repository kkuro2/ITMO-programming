package pokemon;
import attacks.AcidSpray;
import attacks.ChargeBeam;
import attacks.FlashCannon;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eelektross extends Pokemon {
    public Eelektross(String name,int lvl){
        super(name,lvl);
        this.addType(Type.ELECTRIC);
        this.setStats(85.0, 115.0, 80.0, 105.0, 80.0, 50.0);
        this.addMove(new ChargeBeam());
        this.addMove(new ThunderWave());
        this.addMove(new AcidSpray());
        this.addMove(new FlashCannon());
    }
}
