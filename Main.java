import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        testConstructor();
        testInsert1();
        testInsert2();
        testInsert3();
        testDelete1();
        testDelete2();
        testDelete3();
        testSearch1();
        testSearch2();

        System.out.println("Pass: " + pass + " Fail: " + fail);
    }

    static int pass = 0;
    static int fail = 0;

    public static void testConstructor(){
        DAHT con = new DAHT(1);
        //con.tostring();
        if(con.getHT()[0]==null) pass++;
        else fail++;
    }

    //testing in index
    public static void testInsert1(){
        DAHT oo = new DAHT(3);
        DA datu = new DA(0,3);
        try{
            oo.insert(datu);
            pass++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("testInsert1: Array Index out of bounds exception");
            fail++;
        }

    }
    
    //Testing out of index
    public static void testInsert2(){
        DAHT me = new DAHT(1);
        DA dato = new DA(3,3);
    try{
        me.insert(dato);
        fail++;
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("testInsert2: Array Index out of bounds exception,pass");
        pass++;
     }
    }
    
    //testing collisions
    public static void testInsert3(){
        DAHT me = new DAHT(2);
        DA a = new DA(1,5);
        DA c = new DA(1,3);
        try{
            me.insert(a);
            me.insert(c);
            fail++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            me.tostring();
            System.out.println("testInsert3: Array Index out of bounds exception, pass");
            pass++;
        }
    }

    //test deletion
    public static void testDelete1(){
        DAHT me = new DAHT(7);
        me.insert(new DA(1,5));
        me.insert(new DA(2,4));
        me.insert(new DA(3,3));
        try{
            me.delete(new DA(2,4));
            me.tostring();
            DA m = new DA();
            if (me.getHT()[2]==null) {
                pass++;
            }
            else{
                System.out.println("testDelete1: Did not set to null, fail");
                fail++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("testDelete1: Array Index out of bounds exception, fail");
            fail++;
        }

    }
    
    //test deleting nonexistant item
    public static void testDelete2(){
        DAHT me = new DAHT(7);
        me.insert(new DA(1,5));
        me.insert(new DA(2,4));
        me.insert(new DA(3,3));
        try{
            me.delete(new DA(2,5));
            fail++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("testDelete2: Array Index out of bounds exception, pass");
            pass++;
        }

    }
    
    //test deleting nonexistant item
    public static void testDelete3(){
        DAHT me = new DAHT(7);
        me.insert(new DA(1,5));
        me.insert(new DA(2,4));
        me.insert(new DA(3,3));
        try{
            me.delete(new DA(7,5));
            fail++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("testDelete3: Array Index out of bounds exception, pass");
            pass++;
        }

    }

    //test return existing item
    public static void testSearch1(){
        DAHT me = new DAHT(7);
        me.insert(new DA(1,5));
        me.insert(new DA(2,4));
        DA test = new DA(3,3);
        me.insert(test);
        me.tostring();
        try{
            if(me.search(3)==test){
                pass++;
            }
            else{
                System.out.println("testSearch1: Search didn't produce same value, fail");
                fail++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("testSearch1: Array Index out of bounds exception, fail");
            fail++;
        }
    }
    
    //test searching out of index
    public static void testSearch2(){
        DAHT me = new DAHT(4);
        me.insert(new DA(1,5));
        me.insert(new DA(2,4));
        DA test = new DA(3,3);
        me.insert(test);
        me.tostring();
        try{
            if(me.search(8)==test){
                fail++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("testSearch2: Array Index out of bounds exception, pass");
            pass++;
        }
    }

}
