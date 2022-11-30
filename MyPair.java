
public class MyPair<K extends Comparable<K>, V extends Comparable<V>> 
implements Comparable<MyPair<K, V>>{
    private K key;
    private V value;

    public MyPair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public String toString(){

        return "(" + key + ", " + value + ")";
    }

    public int compareTo(MyPair<K, V> obj){
        if(this.key.compareTo(obj.key) != 0){
            return this.key.compareTo(obj.key); 
        }
        else{
            if(obj.value.compareTo(this.value) > 0){
            return obj.value.compareTo(this.value);
        }else{
            return -1;
        }
    }
}
}
