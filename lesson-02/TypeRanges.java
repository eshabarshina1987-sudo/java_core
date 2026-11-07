/*2. Диапазоны типов — Выведите минимальные и максимальные значения byte, short, int, long, float и double
    через константы классов-обёрток.*/
public class TypeRanges {
    public static void main(String[] args) {
        byte minB = Byte.MIN_VALUE;
        byte maxB = Byte.MAX_VALUE;
        short minS = Short.MIN_VALUE;
        short maxS = Short.MAX_VALUE;
        int minI = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;
        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;
        float minF = Float.MIN_VALUE;
        float maxF = Float.MAX_VALUE;
        double minD = Double.MIN_VALUE;
        double maxD = Double.MAX_VALUE;
        System.out.println("Min_byte:\t\t"+minB+"\t\t\t\t\tMax_byte:\t\t"+maxB);
        System.out.println("Min_short:\t\t"+minS+"\t\t\t\t\tMax_short:\t\t"+maxS);
        System.out.println("Min_integer:\t"+minI+"\t\t\t\tMax_integer:\t"+maxI);
        System.out.println("Min_long:\t\t"+minL+"\tMax_long:\t\t"+maxL);
        System.out.println("Min_float:\t\t"+minF+"\t\t\t\t\tMax_float:\t\t"+maxF);
        System.out.println("Min_double:\t\t"+minD+"\t\t\t\tMax_double:\t\t"+maxD);
    }
}
