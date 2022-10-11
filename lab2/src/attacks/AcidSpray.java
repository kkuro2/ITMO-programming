package attacks;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class AcidSpray extends SpecialMove {
    public AcidSpray(){
        super(Type.POISON,40.0,100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_DEFENSE, -2);
    }

    @Override
    public String describe(){
        return "uses Acid Spray"; 
    }
}
