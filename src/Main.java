public class Main {
    public static void main(String[] args) {
        //Cerinta 1 optional
        LogicalOperation op = new LogicalOperation();
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        op.opt1(my_array, 5 ,1999);
        op.array2print(my_array);
        System.out.println("-----------");

        //Cerinta 2 optionala
        int[] array2opt = {8, 302, 21, 523, 2, 11};
        op.opt2(array2opt);
        System.out.println("-----------");

        //Cerinta 3 optionala
        int[] array3opt = {2, 5, 7, 1, 3, 10};
        op.opt3(array3opt);
        op.array2print(array3opt);
        System.out.println("-----------");

        //Cerinta 4 optionala
        int[] array4opt = {2, 6, 7, 6, 3, 7, 3, 10, 7};
        op.array2print(op.optDuplicate(array4opt));
        System.out.println("-----------");

        //Cerinta 5 optionala
        int[] array01 = {2, 6, 3, 5, 10};
        int[] array02 = {2, 9, 10, 1, 100, 99};
        int m = array01.length;
        int n = array02.length;
        op.opt5(array01, array02, m, n);
        System.out.println("\n-----------");

        //Cerinta 6 optionala
        int[] opt6array = {2, 6, 3, 5, 11};
        op.array2print(op.array6opt(opt6array));
    }
}
