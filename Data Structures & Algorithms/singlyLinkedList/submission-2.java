class LinkedList {

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if(index < 0 || index >= size){
            return false;
        }else if(index == 0){
            head = head.next;
            if (size == 1) tail = null;
        }else{
            Node prev = head;
            for(int i = 0; i < index - 1; i++){
                prev = prev.next;
            }
            prev.next = prev.next.next;
            if(index == size -1){
                tail = prev;
            }
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;
        for(int i = 0; i < size; i++){
            list.add(curr.val);
            curr = curr.next;
        }
        return list;
    }
}
