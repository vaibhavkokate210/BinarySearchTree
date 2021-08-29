package com.datastructure.binarysearchtree;

import java.util.Scanner;

public class BinarySearchTreeRunner 
{
	public static void main(String[] args) 
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(56);
		bst.insert(30);
		bst.insert(70);
		bst.insert(22);
		bst.insert(40);
		bst.insert(60);
		bst.insert(95);
		bst.insert(11);
		bst.insert(65);
		bst.insert(3);
		bst.insert(16);
		bst.insert(63);
		bst.insert(67);
		bst.display();
		System.out.println("\nEnter key tobe searched ");
		Scanner sc=new Scanner(System.in);
		if(bst.search(sc.nextInt()))
		  System.out.println("key found");
		else
			System.out.println("key not found");
	}

}
