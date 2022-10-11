package attacks;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC,90.0,100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((new Effect().chance(0.1)).success()) {
            Effect.paralyze(p);
        }
    }

    @Override
    public String describe(){
        return "uses Thunderbolt";
    }
}
