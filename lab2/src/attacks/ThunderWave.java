package attacks;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class ThunderWave extends StatusMove {
    public ThunderWave(){
        super(Type.ELECTRIC,0.0,90.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.poison(p);
        if ((new Effect().chance(0.25)).success()) {
            int speed = (int) p.getStat(Stat.SPEED);
            p.setMod(Stat.SPEED, speed/2);
        }
    }

    @Override
    public String describe(){
        return "uses Thunder Wave";
    }
}
