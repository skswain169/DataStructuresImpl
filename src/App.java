import java.util.Scanner;

import datastructures.linkedlist.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList linkedList = new LinkedList();

        Scanner sc = new Scanner(System.in);
        String option = "y";

        while ("y".equals(option)) {
            System.out.println("1.InsertAtFirst\n2.InsertAtLast\n3.InsertAtPos\n4.Reverse List\nEnter Choice:");
            int input = sc.nextInt();

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
                    System.out.println("Enter Position & Data:");
                    linkedList.insertAtPosition(sc.nextInt(), sc.nextInt());
                    linkedList.printList();
                    break;

                case 4:
                    System.out.println("Reverse list:");
                    linkedList.reverseList();
                    linkedList.printList();
                    break;

                default:
                    System.out.println("Invalid choice!!");
                    break;
            }

            System.out.println("\nDo you want to continue(y/n):");
            option = sc.next();
        }

    }
}
