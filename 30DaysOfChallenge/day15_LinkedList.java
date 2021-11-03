//https://www.hackerrank.com/challenges/30-linked-list/problem?isFullScreen=false



    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null) {
                head = new Node(data);
                head.data = data;
        }
        else {
                Node node = head;
                while(node.next!=null) {
                        node = node.next;
                }
                node.next = new Node(data);
                node.next.data = data;
        }
        return head;
    }

