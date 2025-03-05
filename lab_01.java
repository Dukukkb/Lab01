public class lab_01 {
    public static void main(String[] args){
        short[] p = mass1();
        float[] x = mass2();
        double[][] e = matri();
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < x.length; j ++) {
                System.out.printf("%8.4f", e[i][j]);
            }
            System.out.println();
        }
    }
//делаем первый массив
    public static short[] mass1() {
        short[] array = new short[8];
        short c = 6;
        for (int i = 0; i < array.length; i++) {
            array[i] = c;
            c += 2;
        }
        return array;
    }
    //делаем второй массив
    public static float[] mass2() {
        float[] array = new float[18];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (-6.0f + Math.random() * 12f);
        }
        return array;
    }
//делаем матрицу
    public static double[][] matri() {
        short[] p = mass1();
        float[] x = mass2();
        double[][] e = new double [8][18];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (p[i] == 12) {
                    double downarg = Math.pow(3.0/4.0 * (x[j] - 3.0), 2);
                    double upperarg = 0.5 * Math.pow(1.0/3.0 * x[j], 3);
                    e[i][j] = Math.cos(Math.pow(downarg,upperarg));
                }
                else if (p[i] == 8 || p[i] == 14 || p[i] == 16 || p[i] == 18) {
                    double verh = Math.pow(Math.pow((0.5 * x[j]) , 2), (2.0 * (2.0/3.0)/(3.0 + x[j])));
                    double niz = 0.5 - Math.pow(Math.pow(x[j], (2.0/3.0)/(1 - x[j]))/ (x[j] * Math.pow(1.0/2.0 - x[j], 2) - 1), 2);
                    e[i][j] = verh / niz;
                }
                else {
                    e[i][j] = Math.asin(Math.exp(Math.cbrt(-Math.pow(Math.tan(Math.cbrt(x[j])), 2))));
                }
            }
        }
    return e;
    }
}