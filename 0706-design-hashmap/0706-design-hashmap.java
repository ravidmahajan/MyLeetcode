class MyHashMap {
    int buckets;
    Node[] storage;
    //The key value pairs will be stored in a node, hence create a class for the same
    class Node{
        int key, value;
        Node next;
        
        public Node(int key, int value){
            this.key= key;
            this.value= value;
        }
    }

    public MyHashMap() {
        buckets=10000;
        storage = new Node[buckets];
    }
    
    private int checkBucket(int key){
        return Integer.hashCode(key) % buckets;
        //return key % buckets; 
    }
    
    private Node find(Node head, int key){
        Node prev=head, curr=head.next;
        while(curr!=null && curr.key!=key){
            prev=curr;
            curr=curr.next;
        }
        return prev;
    } 
    
    public void put(int key, int value) {
        int bucketItem = checkBucket(key);
        if(storage[bucketItem]==null){
            storage[bucketItem] = new Node(-1,-1);
        }
        Node prev=find(storage[bucketItem],key); // storage[bucketItem] - dummyNode
        if(prev.next!=null){
            prev.next.value= value;
            return;
        }
        prev.next= new Node(key,value);
    }
    
    public int get(int key) {
         int bucketItem = checkBucket(key);
        if(storage[bucketItem]==null){
            return -1;
        }
         Node prev=find(storage[bucketItem],key); 
         if(prev.next!=null) {
             return prev.next.value;
         }
         return -1;
    }
    
    public void remove(int key) {
        int bucketItem = checkBucket(key);
        if(storage[bucketItem]==null){
            return;
        }
        Node prev=find(storage[bucketItem],key);
        if(prev.next!=null){
            prev.next= prev.next.next;
            return;
        }
        return;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */