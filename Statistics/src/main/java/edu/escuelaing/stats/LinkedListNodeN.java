package edu.escuelaing.stats;

public class LinkedListNodeN<E> {
    /**
     * A node for a linked list, performs the basic operations expectec of a node
     */
    E value;
    LinkedListNodeN<E> next;

    public LinkedListNodeN(){
        value= null;
        next= null;
    }

    public LinkedListNodeN(E e){
        value= e;
        next= null;
    }
    
    public void setValue(E e){
    /**
     * Sets the object value of the node
     * @param Object e the Object value of the node
     */
        value= e;
    }

    public E getValue(){
    /**
     * Returns the value of the element
     * @return Element value
     */
        return value;
    }

    public boolean hasNext(){
    /**
     * Returns if it has a next node
     * @returns Boolan 
     */
        if (next==null) return false;
        return true;
    }

    public void setNext(LinkedListNodeN<E> node){
    /**
     * Set the next value pointer of this node to another node
     */
        next= node;
    }

    public LinkedListNodeN<E> getNext(){
    /**
     * Returns the next node
     * @retun LinkedListNodeN next
     */
        return next;
    }

}