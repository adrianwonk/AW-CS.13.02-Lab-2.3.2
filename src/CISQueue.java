import java.util.Arrays;

public class CISQueue {
    Integer[] array;
    int size;
    int index;
    public CISQueue(int value){
        array = new Integer[value];
        int size = 0;
        int index = 0;
    }

    public void enqueue(int value){
        array[index] = value;
        index++;
        size++;
    }

    public Object dequeue(){
        if (size == 0)
        {return null;}
        int value = array[0];
        reshuffle();
        index--;
        size--;
        return value;
    }

    public void reshuffle(){
        for (int i = 0; i < index; i++){
            array[i] = array[i+1];
        }
        array[index] = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
    public int size(){
        return size;
    }
    public String toString(){
        String result = "CISQueue{queue=[";
        for (int i = 0; i < array.length; i++){
            result += "" + array[i] + ", ";
        }
        result = result.substring(0,result.length()-2);
        result += "], size=" + size + ", pointer=" + (index - 1) + "}";
        return result;
    }

}
