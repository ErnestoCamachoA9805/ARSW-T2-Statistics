package edu.escuelaing.stats;

/**
 *  A LinkedListNode 
 */
public class LinkedListNodeN<E> {
    /**
     * A node for a linked list, performs the basic operations expectec of a node
     */
    private E value;
    private LinkedListNodeN<E> next;

    /**
     * Creates a node with a value of null
     */
    public LinkedListNodeN(){
        value= null;
        next= null;
    }

    /**
     * Creates a node with a value of e
     * @param  e Element
     */
    public LinkedListNodeN(E e){
        value= e;
        next= null;
    }
    
    /**
     * Sets the object value of the node
     * @param e the Object value of the node
     */
    public void setValue(E e){
        value= e;
    }

    /**
     * Returns the value of the element
     * @return Element value
     */
    public E getValue(){
        return value;
    }

    /**
     * Returns if it has a next node
     * @return Boolean 
     */
    public boolean hasNext(){
        if (next==null) return false;
        return true;
    }

    /**
     * Set the next value pointer of this node to another node
     * @param node the next LinkedList node 
     */
    public void setNext(LinkedListNodeN<E> node){
        next= node;
    }

    /**
     * Returns the next node
     * @return LinkedListNodeN next
     */
    public LinkedListNodeN<E> getNext(){
        return next;
    }

}