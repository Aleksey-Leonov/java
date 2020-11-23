import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       String[] arrayString = new String[]{"Alex", "Nekit", "Maks"};
       swapArray(arrayString,0,2);
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayArrayList(arrayString,arrayList);
        System.out.println(arrayList);





    }

    public static void swapArray(Object[] array, int relocatable, int place){
        Object buffer;
        buffer = array[relocatable];
        array[relocatable] = array[place]; //
        array[place] = buffer;
    }

    public static ArrayList<Object> arrayArrayList (Object[] array, ArrayList<Object> arrayList) {

        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        return arrayList;
    }



}
