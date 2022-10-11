package attacks;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(){
        super(Type.ELECTRIC,50.0,90.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        if ((new Effect().chance(0.7)).success()) {
            p.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }

    @Override
    public String describe(){
        return "uses Charge Beam"; 
    }
}
