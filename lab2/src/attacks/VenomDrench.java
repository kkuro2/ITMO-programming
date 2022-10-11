package attacks;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;

public class VenomDrench extends StatusMove {
    public VenomDrench(){
        super(Type.POISON,0.0,100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (p.getCondition() == Status.POISON){
            p.setMod(Stat.ATTACK, -1);
            p.setMod(Stat.SPECIAL_ATTACK, -1);
            p.setMod(Stat.SPEED, -1);
        }
    }

    @Override
    public String describe(){
        return "uses Venom Drench";
    }
}
