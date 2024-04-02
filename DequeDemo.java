import java.util.LinkedList;

class DequeDemo{
    public static void main (String [] args){
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("========== Deque ==========");
        System.out.println(linkedList +" ("+linkedList.isEmpty()+")");
        System.out.println("\nAdding First and Last Alternately");
        System.out.println("------");
        for(int i=0;i<10;i++){
            String num = "Str"+(i*10);
            linkedList.addFirst(num);
            System.out.println(num+" -> "+linkedList+" ("+linkedList.isEmpty()+")");
            linkedList.addLast(num);
            System.out.println(num+" -> "+linkedList+" ("+linkedList.isEmpty()+")");
        }
        System.out.println();
        System.out.println("Removing First and Last Alternately");
        System.out.println("-----------------------------------");
        for(int i=9;i>=0;i--){
            String num = "Str"+(i*10);
            System.out.println(linkedList+ " ("+linkedList.isEmpty()+") -> "+ num);
            linkedList.removeFirst();
            System.out.println(linkedList+ " ("+linkedList.isEmpty()+") -> "+ num);
            linkedList.removeLast();
        }
        System.out.println(linkedList+" ("+linkedList.isEmpty()+")");

    }
}
