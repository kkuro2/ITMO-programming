package attacks;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Haze extends StatusMove {
    public Haze(){
        super(Type.ICE,0.0,0.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        int hp = (int)p.getStat(Stat.HP);
        p.restore();
        p.setMod(Stat.HP, hp);
    }

    public String describe(){
        return "uses Haze";
    }
}
