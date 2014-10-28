/*
 * ArrayList.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class ArrayList
{
    private Object[] array;
    private int index;

    public ArrayList(){
        array = new Object[5];
        index = 0;  //index of the first empty position
    }

    public void add(Object o){
        add(index, o);
        //if (index == array.length){
            //Object[] temp = new Object[array.length*2];
            //for (int i=0; i<array.length; i++)
                //temp[i] = array[i];
            //array = temp;
        //}
        //array[index] = o;
        //index++;
    }

    public void add (int index, Object o){
        if (index <= this.index && index>=0){
            if (this.index == array.length){
                Object[] temp = new Object[array.length*2];
                for (int i=0; i<array.length; i++)
                    temp[i] = array[i];
                array = temp;
            }
            for (int i=this.index; i>index; i--)
                array[i] = array[i-1];

            array[index] = o;
            this.index++;
        } else{
            //array[index] = o;
            //this.index = index+1;
            System.out.println("Index out of range.");
        }
    }

    public void clear(){
        array = new Object[5];
        index = 0;
    }

    public boolean contains(Object o){
        for (int i=0; i<index; i++){
            if (array[i] == o)
                return true;
        }
        return false;
    }

    public Object get(int index){
        if (index < this.index && index >= 0){
            return array[index];
        }
        else{
            System.out.println("Index out of range.");
            return null;
        }
    }

    public int indexOf(Object o){
        for (int i=0; i<index; i++){
            if (array[i] == o)
                return i;
        }
        return -1;
    }

    public boolean isEmpty(){
        return (index == 0);
    }

    public int lastIndexOf(Object o){
        for (int i=index-1; i>=0; i--){
            if (array[i] == o)
                return i;
        }
        return -1;
    }

    public boolean remove(Object o){
        for (int i=0; i<index; i++){
            if (array[i] == o){
                for (int j=i; j<index-1; j++){
                    array[j] = array[j+1];
                }
                index--;
                return true;
            }
        }
        return false;
    }

    public int size(){
        return index;
    }

    public Object remove(int index){
        if (index < this.index && index >= 0){
            Object ans = array[index];
            for (int i=index; i<this.index-1; i++){
                array[i] = array[i+1];
            }
            this.index--;
            return ans;
        }else{
            System.out.println("Index out of range.");
            return null;
        }
    }

    public Object set (int index, Object o){
        if (index <= this.index && index >= 0){
            array[index] = o;
            return o;
        }
        else{
            System.out.println("Index out of range.");
            return null;
        }
    }
}

