package attacks;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(){
        super(Type.POISON,90.0,100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((new Effect().chance(0.3)).success()) {
            Effect.poison(p);
        }
    }

    @Override
    public String describe(){
        return "uses Sludge Bomb";
    }
}