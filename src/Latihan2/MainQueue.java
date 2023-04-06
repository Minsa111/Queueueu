package Latihan2;



class Link{
    public String dData;
    public Link next;

    public Link(String a){
        dData = a;
    }
    public void displayLink(){
        System.out.println(dData + " ");
    }
}

class FirstLastList{
    public Link first;
    public Link last;

    public FirstLastList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertLast(String aa){
        Link newLink = new Link( aa );
        if(isEmpty()){
            first = newLink;
        }else{
            last.next = newLink;
        }
        last = newLink;
    }

    public String deleteFirst(){
        String temp = first.dData;
        if(first.next == null ){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public String peek(){
        return first.dData;
    }

    public String poll(){
        String tempData =  first.dData;
        first = first.next;
        return tempData;
    }
}

class Queue{
    public FirstLastList theList;

    public Queue(){
        theList = new FirstLastList(  );
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void add(String j){
        theList.insertLast( j );
    }
    public String dequeue(){
        return theList.deleteFirst();
    }
    public void displayQueue(){
        System.out.println("Queue (head-->Tail) : ");
        theList.displayList();
    }
    public String displayPeek(){
        return theList.peek();
    }
    public String displayPoll(){
        return theList.poll();
    }
}

public class MainQueue {

    public void queueExample(){
        Queue queue = new Queue();
        queue.add("Java");
        queue.add( "DotNet" );
        queue.add( "PHP" );
        queue.add( "HTML" );
        System.out.println("remove  : " +queue.dequeue());
        System.out.println("element : " ); queue.displayQueue();
        System.out.println("poll    : " +queue.displayPoll());
        System.out.println("peek    : " +queue.displayPeek());
    }

    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}
