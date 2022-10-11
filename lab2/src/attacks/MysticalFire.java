package attacks;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;

public class MysticalFire extends SpecialMove {
    public MysticalFire(){
        super(Type.FIRE,75.0,100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    public String describe(){
        return "uses Mystical Fire"; 
    }
}
