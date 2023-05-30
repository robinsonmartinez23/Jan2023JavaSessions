package javasessions.day12_ArrayList_DynamicArray__LoadFactor_VirtualCapacityConcept;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        //ArrayList -- Default class
        //create the object of ArrayList
        //ArrayList belongs to java.util package
        //vc = virtual capacity
        //pc = physical capacity
        //LF = load factor
        //By default vc of ArrayList is 10
        //Physical capacity of empty ArrayList is 0
        //When we reach the maximum of vc (vc = 0, pc = 10) the new vc will be calculated by LF = pc/2
        //The new vc is 10/2 = 5
        //After reach 15 new vc is 15/2 = 7
        //After reach 22 new vc is 22/2 = 11

        //****Cases of uses****
        //Uber = carList
        //Amazon = productList
        //Users = userList
        //images = imageList
        //links = linksList

        ArrayList al = new ArrayList(); // It is a raw ArrayList that's why is giving a warning
                                        // any type of variable can be stored in a raw ArrayList
                                        // pc = 0 vc = 10
        System.out.println(al.size());  //size = 0
        al.add(100);    //0
        al.add(200);    //1             // pc = 2 vc = 8
        System.out.println(al.size());  //size = 2
        al.add(300);    //2
        al.add(400);    //3
        al.add(500);    //4
        System.out.println(al.size());  //size = 5
        System.out.println("--------------");
        System.out.println(al.get(0));  //100
        System.out.println(al.get(4));  //500
        //System.out.println(al.get(5));  //IndexOutOfBoundException (IOB)
        //System.out.println(al.get(-1)); //IndexOutOfBoundException (IOB)
        al.add(600);    //5
        System.out.println(al.get(5));  //600
        System.out.println("--------------");
        System.out.println(al.add(12.33));          //true
        System.out.println(al.add(true));           //true
        System.out.println(al.add('m'));            //true
        System.out.println(al.add("testing"));      //true
        System.out.println(al.size());
        System.out.println(al);
        System.out.println("--------------");
        //Generics in ArrayList
        ArrayList<Integer> marklist = new ArrayList<>(); //pc = 0 vc = 10
        marklist.add(100);                                      //pc = 1 vc = 9
        marklist.add(200);                                      //pc = 2 vc = 8
        System.out.println(marklist.size()); //2
        System.out.println("--------------");
        ArrayList<Double> bmiList = new ArrayList<>();
        bmiList.add(12.33); //0
        //bmiList.add(100);     // Needs to be double
        bmiList.add(100.0); //1
        System.out.println(bmiList.size()); //2
        System.out.println(bmiList.get(1)); //100.0
        System.out.println("--------------");
        ArrayList<String> browserList = new ArrayList<>();
        browserList.add("Chrome");  //0
        browserList.add("Firefox"); //1
        browserList.add("Safari");  //2
        browserList.add("Opera");   //3
        System.out.println(browserList.size()); //4
        System.out.println(browserList.get(1)); //Firefox
        System.out.println(browserList);
        System.out.println("--------------");
        for(int i = 0; i<=browserList.size()-1;i++ ){
            System.out.println(browserList.get(i));
            if(browserList.get(i).equals("Firefox")){
                System.out.println("Mozilla");
                break;
            }
        }
        System.out.println("--------------");
        for (String each : browserList) {
            System.out.println(each);
        }
        System.out.println("--------------");
        // Object ArrayList => We can store any type of data.
        // Employee info = name, age, salary, gender, isEmployee
        ArrayList<Object> empInfoList = new ArrayList<>();
        empInfoList.add("Robin");
        empInfoList.add("Martinez");
        empInfoList.add(43);
        empInfoList.add(120000.5);
        empInfoList.add("M");
        empInfoList.add(true);
        System.out.println(empInfoList.size()); //6
        System.out.println("--------------");
        for (Object each : empInfoList) {
            System.out.println(each);
        }
        System.out.println("--------------");
        System.out.println(empInfoList);
        System.out.println("--------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);    //0
        numbers.add(200);    //1
        numbers.add(300);    //2
        numbers.add(100);    //3   => ArrayList allow repeated elements
        System.out.println(numbers);
        System.out.println("--------------");
        for (Integer each : numbers) {
            System.out.println(each);
            if(each==200){
                System.out.println("It is 200");
                break;
            }
        }

    }
}
