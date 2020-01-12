package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(123); //0
        myList.add(4);   //1
        myList.add(67);  //2

       /* System.out.println(myList.size());
        System.out.println(myList.get(0)); <--- otrzymamy 123
*/
        myList.remove(2); //usuwanie

       /* myList.add(999);
        for (int i = 0; i < myList.size(); i++){
            System.out.println(i + " - " + myList.get(i));
        } */
        Iterator<Integer> iterator = myList.iterator();

            while (iterator.hasNext()) {
            if (iterator.next() == 4) {
                iterator.remove();
            }
        }

        for (Integer i : myList) {
            System.out.println(i);
        }

    }
}
