import java.util.Scanner;

import datastructures.linkedlist.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList linkedList = new LinkedList();
        

        Scanner sc= new Scanner(System.in);
        String option="Y";

        while("Y".equals(option))
        {
        System.out.println("1.InsertAtFirst\n2.InsertAtLast\n3.InsertAtPos\nEnter Choice:");
        int input= sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Enter data:");
                linkedList.insertAtFirst(sc.nextInt());
                linkedList.printList();
                break;
            case 2:
                System.out.println("Enter data:");
                linkedList.insertAtLast(sc.nextInt());
                linkedList.printList();
                break;
            case 3:
                System.out.println("Enter data & Position:");
                linkedList.insertAtPosition(sc.nextInt(), sc.nextInt());
                linkedList.printList();
                break;
                    
            default:
                System.out.println("Invalid choice!!");
                break;
        }

        System.out.println("\nDo you want to continue(Y/N):");
        option= sc.next();
    }

    }
}
