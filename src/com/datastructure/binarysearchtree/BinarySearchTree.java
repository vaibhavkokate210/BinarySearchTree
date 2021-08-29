package com.datastructure.binarysearchtree;

public class BinarySearchTree 
{
	public static Node root;
	public BinarySearchTree()
	{
		this.root=null;
	}
	public void insert(int key)
	{
		Node node=new Node(key);
		if(root==null)
		{
			root=node;
		}
		else
		{
			Node current=root;
			Node parent;
			while(true)
			{
				parent=current;
				if(key<current.key)
				{
					current=current.left;
					if(current==null)
					{
						parent.left=node;
						return;
					}
				}
				else
				{
					current=current.right;
					if(current==null)
					{
						parent.right=node;
						return;
					}
				}
			}
		}
	}
	public boolean search(int id)
	{
		Node current = root;
		while(current!=null){
			if(current.key==id){
				return true;
			}else if(current.key>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	public void display()
	{
		display(root);
	}
	private void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.key);
			display(root.right);
		}
	}
}
