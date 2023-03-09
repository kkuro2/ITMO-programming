import Debug.DebugOutput;
import Exceptions.InvalidNameException;
import Objects.Alive.Carlson;
import Objects.Alive.Junior;
import Objects.NotAlive.Bell;
import Objects.NotAlive.House;
import enums.BellType;

public class Main {
    public static void main(String[] args) throws InvalidNameException {
        Bell cowBell = new Bell(BellType.COW);

        House house = new House("123 Main St.", cowBell);
        
        Carlson carlson = new Carlson("Карлсон", house);
        Junior junior = new Junior("Малыш", house);
        
        cowBell.beArrangedInACertainWay();
        carlson.hangBell();
        cowBell.whichBell();
        carlson.stretchCord(junior);
        DebugOutput.colossally();
        junior.thinkSo();
        DebugOutput.ghostGame();
        junior.hadToWait();
        carlson.answerCall();
        DebugOutput.pullCord();
        carlson.appear();

        junior.feelToTalk(carlson);
        junior.pullAndPull();
        cowBell.bellSound();
        carlson.flyIntoTheWindow();
        DebugOutput.sleepyAndBadMood();
        carlson.resent();
        junior.sorry();
        carlson.shouldHaveKnown();
        carlson.marmot();
        junior.doubt();
        carlson.nod();
        carlson.yeah();
        junior.thinkHowSad();
        junior.isItReallyBad();
        carlson.itIs();
        carlson.shush();
        DebugOutput.insomnia();
        carlson.giveMeAPresent();
        junior.searchForAPresent(carlson);
    }
}