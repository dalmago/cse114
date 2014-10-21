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
        index = 0;
    }

    public void add(Object o){
        if (index == array.length -1){
            Object[] temp = new Object[array.length*2];
            for (int i=0; i<array.length; i++)
                temp[i] = array[i];
            array = temp;
        }
        array[index] = o;
        index++;
    }

    public void add (int index, Object o){
        if (index <= this.index){
            if (index == array.length -1){
                Object[] temp = new Object[array.length*2];
                for (int i=0; i<array.length; i++)
                    temp[i] = array[i];
                array = temp;
            }
            for (int i=this.index; i>=index; i--)
                array[i+1] = array[i];

            array[index] = o;
            this.index++;
        } else{
            array[index] = o;
            this.index = index+1;
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
        return array[index];
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
            if (array[index] == o){
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
        Object ans = array[index];
        for (int i=index; i<this.index-1; i++){
            array[i] = array[i+1];
        }
        this.index--;
        return ans;
    }

    public Object set (int index, Object o){
        array[index] = o;
        return o;
    }
}

