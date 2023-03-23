import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        int[]massiv = {5,3,78,34,1,-2,6,-56};
//        int tt=0;
//        int yy=0;
//        int j=0;
//        for (int i = 0; i < massiv.length; i++) {
//            for ( j = 0; j < massiv.length; j++) {
//                    if (massiv[i]<massiv[j]){
//                        tt=massiv[i];
//                        massiv[i]=massiv[j];
//                        massiv[j]=tt;
//                    }
//            }
//        }
//        for (int u : massiv) {
//            System.out.println(u);
//        }

//        ArrayList<Integer>hi=new ArrayList<>();
//        hi.add(2);
//        hi.add(5);
//        hi.add(-3);
//        hi.add(29);
//        hi.add(-24);
//        hi.add(0);
//        Collections.sort(hi);
//        System.out.println(hi);
//

        Student student1 = new Student("gula",12);
        Student student2 = new Student("gulzat",11);
        Student student3 = new Student("zhazgul",55);
        Student student4 = new Student("aziza",16);
        Student student5 = new Student("asema",32);
        LinkedList<Student>helo=new LinkedList<>();
        helo.add(student1);
        helo.add(student2);
        helo.add(student3);
        helo.add(student4);
        helo.add(student5);
        Collections.sort(helo);
        System.out.println(helo);

    }
}