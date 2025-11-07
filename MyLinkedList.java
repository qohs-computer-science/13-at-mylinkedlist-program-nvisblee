public class MyLinkedList
{
    private ListNode head;
    private int size;

    public MyLinkedList()
    {
        head = null;
        size = 0;
    } // end constructor

    public void add(Object value)
    {
        ListNode newNode = new ListNode(value, null);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    } // end add

    public Object get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ListNode current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.getNext();
        }
        return current.getValue();
    } // end get

    public boolean isEmpty() { 
        if(size == 0 || head == null) {
            return true;
        }
        return false;


    }

    public int size()
    {
        return size;
    } // end size


    public String toString() {
        if (head == null) {
            return "nothing";
        }
        String result = "";
        ListNode current = head;
        int index = 0;
        while (current != null) {
            result += index + ": " + current.getValue();
            if (current.getNext() != null) {
                result += "\n";
            }
            current = current.getNext();
            index++;
        }
        return result;
    }

}
