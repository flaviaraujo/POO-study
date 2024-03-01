import java.util.Arrays;

public class Ficha2 {

//---------------------ex1a-----------------------------------

    public int minimo(int[] array){
        int min = array[0];

        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }

        return min;
    }

//---------------------ex1b-----------------------------------

    public int[] entreIndices (int[] array, int i, int f) {
        int size = f - i;
        int[] res = new int[size];
        System.arraycopy(array, i, res, 0, size);
        return res;
    }


//---------------------ex1c-----------------------------------

    public int[] comuns(int[] array1, int[] array2){
        int[] res = new int[array1.length];
        int ind = 0;
        for(int i = 0; i < array1.length; i++){
            boolean found = false; 
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    found = true; 
                }
            
                for(int k = 0; k<ind && !found; k++){
                    if(res[k] == array1[i]){
                        found = true;
                    }
                }
                if(!found){
                    res[ind] = array1[i];
                    ind++;
                }
            }
        }
        int[] resFinal = new int[ind];
        System.arraycopy(res, 0, resFinal, 0, ind);
        return resFinal;
    }
    

//---------------------ex3a-----------------------------------

    public int[] ordenaCrescente(int[] array5){
        int aux = 0;

        // Bubble sort
        for(int i = 0; i < array5.length; i++){
            for(int j = i+1; j < array5.length; j++){
                if(array5[i] > array5[j]){
                    aux = array5[i];
                    array5[i] = array5[j];
                    array5[j] = aux;
                }
            }
        }

        return array5;
    }

//---------------------ex3b---TODO--------------------------------

//---------------------ex4a-----------------------------------

   public String[] stringsExistentes(String[] arrayStrings){
    
        String[] res = new String[arrayStrings.length];
        int ires = 0;
        System.out.println(Arrays.toString(arrayStrings));

        for(int i = 0; i < arrayStrings.length; i++){
            for(int j = i+1; j < arrayStrings.length; j++){
                if(arrayStrings[i].equals(arrayStrings[j])){
                     
                }
            }
        }

        String[] resFinal = new String[ires];
        System.arraycopy(res, 0, resFinal, 0, ires);

        return resFinal;
   }

}
