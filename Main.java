public class Main {
    public static void main(String[] args){
        testInsert1();
        testInsert2();
        testInsert3();
        testDelete1();
        testSearch1();
        System.out.println("Pass: " + pass + " Fail: " + fail);
    }

    static int pass = 0;
    static int fail = 0;

    public static void testInsert1(){
        DAHT he = new DAHT(30);
        he.insert(3);
        he.insert(33);
        he.insert(34);
        he.insert(333);
        he.insert(3333);
        System.out.println("testInsert1: " + he.tostring());

    }
    public static void testInsert2(){
        DAHT he = new DAHT(5);
        he.insert(3);
        he.insert(33);
        he.insert(34);
        he.insert(333);
        he.insert(3333);
        System.out.println("testInsert2: " + he.tostring());
    }
    public static void testInsert3(){
        DAHT he = new DAHT(15);
        he.insert(3);
        he.insert(33);
        he.insert(32);
        he.insert(33);
        he.insert(33);
        System.out.println("testInsert3: " + he.tostring());
    }

    public static void testDelete1(){
        DAHT me = new DAHT(13);
        me.insert(3);
        me.insert(4);
        me.insert(7);
        me.insert(5);
        me.insert(6);
        System.out.println("testDelete1 bef: " + me.tostring());
        me.delete(4);
        System.out.println("testDelete1 aft: " + me.tostring());

    }
    public static void testSearch1(){
        DAHT me = new DAHT(20);
        me.insert(1);
        me.insert(40);
        me.insert(17);
        me.insert(54);
        me.insert(62);
        System.out.println("testsearch1 : " + me.tostring());
        System.out.println("key of 54: " + me.search(54));
        System.out.println("key of 80: " + me.search(80));
    }
}
