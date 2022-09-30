public class DA {
    private int key;
    private int val;

    public DA(){}

    public DA(int k, int v){
        val = v;
        key = k;
    }
    public int getKey(){
        return key;
    }
    public int getVal(){
        return val;
    }

    public String toString(){
        return "Val: " + val + " Key: " + key;
    }

}
