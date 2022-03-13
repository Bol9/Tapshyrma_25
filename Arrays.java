public class Array {


    public void met() {
        Random random = new Random();
        int[] array = new int[50];

        for (int i = 0; i < 50; i++) {
            array[i] = random.nextInt(0, 2);


        }
        System.out.println(Arrays.toString(array));
    }
}
}
