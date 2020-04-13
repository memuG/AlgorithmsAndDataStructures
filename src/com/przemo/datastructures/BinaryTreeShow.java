package com.przemo.datastructures;

import com.przemo.IShow;

public class BinaryTreeShow<X extends Comparable<X>> implements IShow {
    private Node root;
    private int size;

    public BinaryTreeShow() {
        this.root = null;
    }

    public int size() {
        return size;
    }

    public void add(X item) {
        Node node = new Node(item);
        // the very first item -> set as root
        if (root == null) {
            this.root = node;
            this.size++;
        }
        else {
            insert(this.root, node);
        }
    }

    private void insert(Node parent, Node child) {
        // child less than parent -> goes left
        if (child.getItem().compareTo(parent.getItem()) < 0) {
            //if the left node is null -> set the child here
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            }
            //the left node was not empty -> calling insert again, recursively
            else {
                insert(parent.getLeft(), child);
            }
        }
        //child greater than parent -> goes right
        else if (child.getItem().compareTo(parent.getItem()) > 0) {
            //if the right node is null -> set the child here
            if (parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            }
            // the right node was not empty -> calling insert again, recursively
            else {
                insert(parent.getRight(), child);
            }
        }
    }

    private class Node {
        private Node left;
        private Node right;
        private Node parent;
        private X item;

        public Node(X item) {
            this.item = item;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public X getItem() {
            return item;
        }

        public void setItem(X item) {
            this.item = item;
        }
    }

}
