import java.util.Random;


public class Main {

    public static void main(String[] args) {
        short[] a = new short[15];
        for (short i = 17;i >= 3;i--){
            a[17-i] = i;
        }


        float[] Ran = new float[20];
        Random random = new Random();
        for (int i = 0;i < 20;i++){
            Ran[i] = random.nextFloat(25) - 12;
        }


        double[][] b = new double[15][20];
        for (int i = 0;i < 15;i++){
            for (int j = 0;j < 20;j++){
                double x = Ran[j];
                int olala = a[i];
                switch(olala){
                    case 10 :
                        b[i][j] = (Math.pow(Math.E,Math.pow(x,2*x))/(Math.pow(Math.pow(Math.E,x)*(Math.log(Math.abs(x))-1),Math.pow(x,0.25/x)) + 3/4));
                        break;
                    case 4,5,9,12,13,15,16 :
                        b[i][j] = Math.cos(Math.cos(Math.pow(Math.E,x)));
                        break;
                    default :
                        b[i][j] = Math.log(Math.pow(Math.tan(Math.atan(Math.pow(Math.E,Math.pow(Math.pow(-Math.cos(x),2),1/3)))),2));
                }
            }
        }
        for (int i = 0;i < 15;i++){
            for (int j = 0;j < 20;j++){
                System.out.printf("%-9.3f",b[i][j]);
            }
            System.out.println();
        }
    }
}