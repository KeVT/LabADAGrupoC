//Ej6MergekSortedLists.java

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ej6MergekSortedLists {

    static ListNode merge(ListNode [] heads){
        //Dadas unas listas ordenadas, se juntan todas las listas y estas se ordenan de forma ascendente.
        //Utilizando colas de prioridad.
        ListNode resultHead=null;
        ListNode current = null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {      
            public int compare(ListNode o1, ListNode o2) {
                return o1.data-o2.data;
            }
        });
        for (int i = 0; i <heads.length ; i++) {
            if(heads[i]!=null){
                pq.offer(heads[i]);
            }
        }

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            if(resultHead==null){
                resultHead = node;
                current = node;
            }else {
                current.next = node;
                current = current.next;
            }
            if(node.next!=null){
                pq.add(node.next);
            }
        }
        return resultHead;
    }
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
    }

    static void print(ListNode node){
        ListNode current = node;
        while(current!=null){
            System.out.print(" - "+ current.data );
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);
        print(list1);
        
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        print(list2);
        
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);
        print(list3);

        ListNode [] heads = new ListNode [] {list1, list2, list3};
        ListNode result = merge(heads);
        System.out.println("Output: ");
        print(result);
    }
    
}

//Resultado
 - 1 - 4 - 5
 - 1 - 3 - 4
 - 2 - 6
Output: 
 - 1 - 1 - 2 - 3 - 4 - 4 - 5 - 6
