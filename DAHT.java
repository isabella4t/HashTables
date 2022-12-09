import java.util.Arrays;

public class DAHT {
    DA[] HT;
    int HTsize;

    public DAHT(int size){
        HT = new DA[size];
        HTsize = size;
    }

    
    public void insert(DA data){
        //prevent collisions
        if(HT[data.getKey()]!=null){
            System.out.println("Index already occupied");
            throw new ArrayIndexOutOfBoundsException();
        }
        else HT[data.getKey()] = data;
        //Overflow+underflow
        //Makes key = to index and makes it correspond to the data
    }

    public void delete(DA data){
        if(data.getVal()==HT[data.getKey()].getVal()) HT[data.getKey()] = null;
        else{
            System.out.println("DA not at index");
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public DA search(int key){
        return HT[key];


    }

//world's most complex hash (I don't remember writing this)
    public int hash(int key){
        return key;
    }

    public void tostring(){
        System.out.println(Arrays.toString(HT));
    }
    public DA[] getHT(){
        return HT;
    }


}
