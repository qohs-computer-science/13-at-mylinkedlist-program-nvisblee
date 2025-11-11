// Arun Mariappan P:4, Adams
// this is the class where all of my methods are implemented for the tester class to run and output results.
public class MyLinkedList
{
    private ListNode head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    } // end MyLinkedList constructor

    public int size(){
        return size;
    } // end size

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }// end isEmpty

    public boolean addLast(Object obj)
    {
        ListNode newItem = new ListNode(obj, null);
        ListNode current = head;
        if(head == null){
            head = newItem;
            size++;
            return true;
        } 
        else{
            while(current.getNext() != null){
                current = current.getNext();
            }
        }
        current.setNext(newItem);

        size++;

        return true;
    } // end addLast


    public boolean add(Object obj){
        return addLast(obj);
    } // end add


    public boolean addFirst(Object obj){
        ListNode node = new ListNode(obj, null);
        node.setNext(head);
        head = node;
        size++;
        return true;
    } // end addFirst

    public Object get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        ListNode temp = head;
        int i = 0;
        while(i < index){
            temp = temp.getNext();
            i++;
        }
        return temp.getValue();
    }// end get


    public Object set(int index, Object newValue){
        if(index < 0 || index >= size){
            return null;
        }

        ListNode temp = head;
        int i = 0;
        while(i < index){
            temp = temp.getNext();
            i++;
        }

        Object oldValue = temp.getValue();
        temp.setValue(newValue);
        return oldValue;
    } // end set



    public Object removeFirst(){
        if(head == null){
            return null;
        }
        Object value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    } // end removeFirst

    public Object removeLast(){
        if(head == null){
            return null;
        } 
        if(head.getNext() == null){
            Object value = head.getValue();
            head = null;
            size--;
            return value;
        }

        ListNode current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        
        
        Object value = current.getNext().getValue();
        current.setNext(null);
        size--;
        return value;
    } // end removeLast


    public Object remove(int index){
        if(head == null || index < 0 || index >= size){
            
            return null;
        }

        if(index == 0){
            return removeFirst();
        }

        ListNode temp = head;
        for(int i = 0; i < index - 1; i++){
            
            temp = temp.getNext();
        }

        ListNode removed = temp.getNext();
        Object value = removed.getValue();
        temp.setNext(removed.getNext());
        size--;
        return value;
    } // end remove


    public String toString(){
        String result = "";
        ListNode current = head;
        int i = 0;

        while(current != null){
            result += i + ": " + current.getValue() + "\n";
            current = current.getNext();
            i++;
        }

        return result;
    } // end toString
} // end class
