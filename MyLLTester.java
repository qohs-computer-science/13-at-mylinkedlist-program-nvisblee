// Arun Mariappan P:4, Adams
// this helps me test my MyLinkedList class. 
public class MyLLTester
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList();

        System.out.println("initial list empty " + list.isEmpty());
        System.out.println("initial size " + list.size());
        System.out.println("adding 10 items:\n");

        list.addFirst("A");
        list.addLast("B");
        list.add("C");
        list.addFirst("D");
        list.addLast("E");
        list.add("F");
        list.addLast("G");
        list.addFirst("H");
        list.add("I");
        list.addLast("J");

        System.out.println("list size: " + list.size()); // print list size
        System.out.println("list empty " + list.isEmpty()); // print if list is empty
        System.out.println("item at index 5 " + list.get(5)); // print item at index 5
        System.out.println("replacing index 3 with an X\n"); // replace item at index 3 with "X"

        list.set(3, "X"); // set index 3 to "X"

        System.out.println(list); // print the list
        System.out.println("Removing first " + list.removeFirst()); // remove first item
        System.out.println(list); // print the list
        System.out.println("Removing last " + list.removeLast());// remove last item
        System.out.println(list);// print the list
        System.out.println("Removing index 2 " + list.remove(2)); //  remove item at index 2
        System.out.println(list); // print the list

        System.out.println("final list size " + list.size()); // print final size
        System.out.println("is list empty " + list.isEmpty());// print if list is empty
        System.out.println(list);// print the list
    } // end main
} // end class
