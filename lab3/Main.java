import Debug.DebugOutput;
import Objects.Alive.Carlson;
import Objects.Alive.Junior;
import Objects.NotAlive.Bell;
import Objects.NotAlive.House;
import enums.BellType;

public class Main {
    public static void main(String[] args) {
        Bell cowBell = new Bell(BellType.COW);

        House house = new House("123 Main St.", cowBell);
        
        Carlson carlson = new Carlson(house);
        Junior junior = new Junior(house);
        
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
    }
}