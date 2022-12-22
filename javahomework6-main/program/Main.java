package program;
import java.util.*;
// import java.util.HashMap;
// import java.util.Map;

public class Main{

public static void main(String[] args) {
    
    Notebook notebook = new Notebook("Lenovo", 2, 2, "black");
    Notebook notebook2 = new Notebook("Samsung", 1, 3, "silver");
    Notebook notebook3 = new Notebook("HP", 3, 4, "white");


    System.out.println(notebook);
    System.out.println(notebook2);
    System.out.println(notebook3);

    System.out.println(notebook.equals(notebook));
    System.out.println(notebook.equals(notebook3));
    
    Set<Notebook> notebooks = new HashSet<>();
    notebooks.add(notebook);
    notebooks.add(notebook2);
    notebooks.add(notebook3);

    System.out.println(notebooks);
    List<Notebook> filtered=new ArrayList<>();
    
    
    for (Notebook note: notebooks){
        int par = note.getRam();
        if(par<3){
            filtered.add(note);
        }
    }
    System.out.println(filtered);
}
}

