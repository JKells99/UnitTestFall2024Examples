package com.keyin.entities;

public class ArrayTest {
    public static void main(String[] args) {
////        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(5,5);
////
////
////        twoDimensionalArray.insertValueInTheArray(3,3,5);
////        twoDimensionalArray.traverse2DArray();
////        twoDimensionalArray.deleteValuefromArray(3,3);
////        twoDimensionalArray.traverse2DArray();
//
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        System.out.println(myNumbers[1][2]);

        LinkedList list = new LinkedList();

        list.insertInLinkedList(1,0);
        list.insertInLinkedList(2,1);
        list.insertInLinkedList(3,2);
        list.insertInLinkedList(4,3);
        list.insertInLinkedList(5,4);
        list.insertInLinkedList(6,5);

        list.traverseLinkedList();
        list.searchNode(8);
        list.deleteNode(2);
        list.traverseLinkedList();










    }
}
