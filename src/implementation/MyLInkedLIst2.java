package implementation;

import myinterface.MyLInkedLIst;
public class MyLInkedLIst2 implements myinterface.MyLInkedLIst {
    private Node head;
    private Node tail;
    private int size;
    public MyLInkedLIst2(){
        head=null;
        tail=null;
        size=0;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public boolean isEmpty(){
    return head==null;
    }

    public void addFirst(int element){
        Node node=new Node(element);
        if (isEmpty()){
            head=node;
            tail=node;
            size++;

        } else{
            node.setNext(head);
            head=node;
            size++;

        }}
        public void traverse(){
            if(!isEmpty()){
                Node temp=head;
                while (temp!=null){
                    System.out.println(temp.getData()+" -->");
                    temp=temp.getNext();
                }
            }else{
                System.out.println("linedis is Empty");
            }


        }    }


