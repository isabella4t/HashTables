import java.io.*;
import java.util.Arrays;

public class DAHT {
    int[] HT;
    int HTsize;
    int tomb = 0;

    public DAHT(int size){
        HT = new int[size];
        HTsize = size;
        for(int i = tomb; i<HTsize;i++){
            HT[i] = tomb;
        }
    }

    public void insert(int val){
         if(HT[hash(val)] == tomb){
             HT[hash(val)] = val;
             return;
         }
         for(int i = hash(val); i<HTsize;i++){
             if(HT[i] == tomb) {
                 HT[i] = val;
                 return;
             }
         }
        //throw overflow error here
        //Decided not to do chaining overflow+underflow
    }

    public void delete(int key){
        HT[key] = tomb;
/*
        if(HT[hash(key)]==val){
            HT[hash(key)] = tomb;
            return;
        }
        int acc = 1;
        for(int i = hash(key); i<HTsize;i++){
            if(HT[i] == val) {
                HT[i] = tomb;
                return;
            }
        }

 */
        //ret index does not exist

    }

    public int search(int val){
        int ret = hash(val);
        if(HT[hash(val)] == val){
            return ret;
        }
        for(int i = hash(val); i<HTsize;i++){
            if(HT[i] == val) {
                return i;
            }
        }
        return -1;
        //throw does not exist
    }

//ensures that return val will be less than HTsize
    private int hash(int key){
        if(key<HTsize) return key;
        int ret = key;
        int acc = 1;
        while(ret>=HTsize){
            ret = ret%HTsize+acc;
            acc++;
        }
        return ret;
    }

    public String tostring(){
        return Arrays.toString(HT);
    }


}
