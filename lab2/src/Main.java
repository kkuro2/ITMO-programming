import pokemon.Eelektrik;
import pokemon.Eelektross;
import pokemon.Misdreavus;
import pokemon.Mismagius;
import pokemon.Seviper;
import pokemon.Tynamo;
import  ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Eelektrik("NeoMent", 1);
        Pokemon p2 = new Eelektross("eoeqs", 1);
        Pokemon p3 = new Misdreavus("Komiljon", 1);
        Pokemon p4 = new Mismagius("Pahan", 1);
        Pokemon p5 = new Seviper("Slonser", 1);
        Pokemon p6 = new Tynamo("prctl3", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
