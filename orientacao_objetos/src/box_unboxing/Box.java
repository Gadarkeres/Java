package box_unboxing;

public class Box {
    public static void main(String[] args) {
        int x = 10;
        Object obj = x;

        int y = (int) obj;

        System.out.println(y);

        int[] numeros = new int[] {
                1, 2, 3, 4,
        };

        // for(int i = 0; i < numeros.length; i++){
        //     int multiplicado = numeros[i] * 2;
        //     System.out.println(multiplicado); 
        // }

        for (int number : numeros){
            int multiplicado =  number * 2;
            System.out.println(multiplicado);
        }

    }
}
