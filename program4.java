// 1.Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class program{
    public static void main(String[] args) {

    LinkedList<Integer> stack = new LinkedList<>();
    stack.add(2);
    stack.add(3);
    stack.add(4);
    stack.add(5);
    stack.add(6);

    System.out.println(stack);
    }
}

// 2.Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.


public class program{
    public static void main(String[] args) {

    Queue<Integer> queue = new LinkedList<>();
    queue.add(5);
    queue.add(4);
    queue.add(3);
    queue.add(2);
    queue.add(1);

    System.out.println(queue);
    }
}

// 3.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class program{
    public static void main(String[] args) {

    LinkedList<Integer> list = new LinkedList<>();
    list.add(20);
    list.add(21);
    list.add(22);
    list.add(23);
    list.add(24);
    List<Integer> reverseinteger = reverse(list);
    
    System.out.println(reverseinteger);

    }
    private static List<Integer> reverse(LinkedList<Integer> lis) {
        List<Integer> nov = new LinkedList<>();
        
        for (int i=0;i<lis.size();i++){
            int current = lis.get(i);
            nov.add(0, current);}
            
        return nov;
    }
}

// 4.Реализовать консольное приложение, которое:
//  * Принимает от пользователя строку вида
//  * text~num
//  * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//  * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//  * Если ввод не содержит символа ~, то завершает программу с ошибкой.
//  * Если введено -1, то выходим

public class program{
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        List<String> storage = new LinkedList<>(); // []
            while (true) {
            String command = sc.next();
            String[] arg = command.split("~"); // string~4
            if (arg.length != 2) {
                throw new IllegalArgumentException();
            }
            if (command == "-1") {
                break;
            }
            String text = arg[0];
            String number = arg[1];
            int num = Integer.parseInt(number);
            int size = storage.size();
            if (size < num) {
                int left = num - size;
                for (int i = left; i >= 0; i--) {
                storage.add("null");
                }
            storage.set(num, text);
              
            }     
            if (!command.contains("~")){ 
                throw new IllegalArgumentException("Введите знак ~");
            }  
            if (command.contains("print")){
                String chet = storage.get(num);
                System.out.println(chet);
                storage.remove(chet);
            }
            System.out.println(storage); 
            }
    }   
}

    
        

