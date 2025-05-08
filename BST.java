import java.util.*;
class BST
{
 int data;
 BST left,right;
 BST(int data)
 {
  this.data = data;
  this.left = null;
  this.right = null;
 }
}


 
class Solution
{
 static BST insert(BST root,int data)
 {
  if (root == null)
  {
   return new BST(data);
  }
  
  if (root.data == data)
  {
   return root;
  }
  if (data < root.data)
  {
   root.left = insert(root.left,data);
  }
  else
   root.right = insert(root.right,data);
  return root;
 } 




static void inorder(BST root)
{
 if(root != null)
 {
  inorder(root.left);
  System.out.print(root.data + " ");
  inorder(root.right);
 }
}


public static void main(String[] args)
{
 BST root = null;
 Scanner ss = new Scanner(System.in);
 int size = ss.nextInt();
 for(int i=0;i<size;i++)
    root=insert(root,ss.nextInt());
 inorder(root);
}}