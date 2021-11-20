public class LogicalOperation {
    public void array2print(int[] y){
        for(int i = 0; i < y.length; i++){
            System.out.println(y[i]);
        }
    }

    //Cerinta 1 Arrays optionala
    //Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
    public int opt1 (int[]x, int pozitie, int valoare) {
        for (int i = x.length - 1; i > pozitie; i--) {
            x[i] = x[i - 1];
        }
        return x[pozitie] = valoare;
    }

    //Cerinta 2 Arrays optionala
    //Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.
    public void opt2 (int[]x){
        int a = x[0];
        int b = x[0];
        for(int i=1; i < x.length; i++) {
            if(x[i] > b)
                b = x[i];
            else if (x[i] < a)
                a = x[i];
        }
        System.out.println("Cel mai mic numar este: " + a);
        System.out.println("Cel mai mare numar este : " + b);
    }


    //Cerinta 3 Arrays optionala
    //Creati o metoda care sa inverseze valorile unui array de int-uri.
    public void opt3 (int[] x){
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length - (1 + i)];
            x[x.length-(i + 1)] = temp;
        }
    }

    //Cerinta 4 arrays optionala
    //Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.
    public int[] optDuplicate (int[] x){
        int[] array = new int[x.length/2];
        int p = 0;
        for(int i = 0; i < x.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < x.length; j++){
                if (i != j){
                    if (x[i] == x[j]){
                        isDuplicate = true;
                    }
                }
            }
            if (isDuplicate == true){
                int exists = 0;
                for(int k = 0; k < p; k++){
                    if(x[i] == array[k]){
                        exists = 1;
                    }
                }
                if (exists == 0) {
                    array[p] = x[i];
                    p++;
                }
            }
        }
        int[] finalArray = new int[p];
        for (int i = 0; i < p; i++){
            finalArray[i] = array[i];
        }
        return finalArray;
    }

    //Cerinta 5 optionala
    public static void opt5(int[] arr1, int[] arr2, int m, int n){
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }

    //Cerinta 6 optionala
    //Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.
    public int[] array6opt(int[] x){
        int temp = 0;
        for (int i = 0; i <x.length; i++) {
            for (int j = i+1; j <x.length; j++) {
                if(x[i] >x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }
}
