public class Examen {

    private static int[] filas(int valor, int num) {
        int[] array = new int[num];
        int c = 0;
        for (int i = 0; i < num; i++){
            array[i] = valor + c--;
        }
        return array;
    }
    public static int[][] vecMat(int[] vec, int num) {
        // Ponga aquí su código
        int[][] array = new int[vec.length][];
        for (int i = 0; i < array.length; i++){
                array[i] = filas(vec[i], num);
        }
        return array;
    }
}