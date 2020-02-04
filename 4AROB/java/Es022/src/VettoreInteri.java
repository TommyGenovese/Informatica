import javax.swing.text.Element;
import java.util.Arrays;

public class VettoreInteri {
    private int size = 0;
    private int[] vector;


    private char sep = '|';


    public VettoreInteri(int dim){

        this.size = (dim > 0) ? dim: 0;
        vector = new int[dim];

        //initialize vector to 0
        for (int i = 0; i < dim; i++){
            vector[i] = 0;
        }
    }



    public VettoreInteri(String elements) throws NumberFormatException{
        String number = "";
        String []vetS = elements.split("\\|");

/*      for (int i = 0; i < elements.length(); i++){
            if(i == elements.length()-1 && (elements.charAt(i) == '0' || elements.charAt(i) == '1'
                    || elements.charAt(i) == '2' || elements.charAt(i) == '3' || elements.charAt(i) == '4'
                    || elements.charAt(i) == '5' || elements.charAt(i) == '6' || elements.charAt(i) == '7'
                    || elements.charAt(i) == '8' || elements.charAt(i) == '9')){
                dim++;
            }else{
                if (elements.charAt(i) == sep){
                    dim++;
                }
            }
        }   */

        vector = new int[vetS.length];
        int k = 0;
        for(k=0; k<vetS.length; k++){
                vector[k] = Integer.parseInt(number); //puo generare l'eccezione
        }
        size = vector.length;
    }


    public int getMin() throws ErroreVettoreVuoto {
        int min = 1;
        if(size ==0) {
            throw new ErroreVettoreVuoto("Vettore vuoto");
        }else{
            for (int i = 1; i < size; i++) {
                if (vector[i] < min) min = vector[i];
            }
        }
        return min;
    }

    public int search(int e){
        int tro = -1;

        for (int i = 0; i < size && tro == -1; i++){
            if (vector[i] == e) {
                return i;
            }
        }
        if(tro == -1){
            throw new ErroreElementoInesistente();
        }
        return -1;
    }

    public void delate(int e1) throws Eccezione_Num_non_Valido{
        int pos;

        pos = search(e1);
        for()

    }

    public int Size() {
        return size;
    }

    @Override
    public String toString() {
        String out = "";
        if(size>0) {
            for (int i = 0; i < size; i++) {
                out += String.format("v[%d]\t\t->\t\t%d\n", i, vector[i]);
            }
            out += vector[size-1];
        }
        return out;
    }
    
}

