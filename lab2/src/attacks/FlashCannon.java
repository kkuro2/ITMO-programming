package attacks;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class FlashCannon extends SpecialMove {
    public FlashCannon(){
        super(Type.STEEL,80.0,100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((new Effect().chance(0.1)).success()) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    public String describe(){
        return "uses Flash Cannon"; 
    }
}
