package LinkedList;


public class Main {
    public static void main(String[] args) {
        SingleLinkedListTest sll = new SingleLinkedListTest();
        sll.insertLinkedList(1,0);
        sll.insertLinkedList(2,1);
        sll.insertLinkedList(3,2);
        sll.insertLinkedList(4,3);
        System.out.println("before deletion.");
        sll.traverseLinkedList();
        sll.delete(2);
        System.out.println("after deletion.");
        sll.traverseLinkedList();
        sll.searchNode(5);

        sll.insertLinkedList(5, 4);
        System.out.println("\nsearch test again");
        sll.searchNode(5);
        System.out.println("list printout after find");
        sll.traverseLinkedList();
    }
}
