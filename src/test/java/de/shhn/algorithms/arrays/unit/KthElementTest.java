package de.shhn.algorithms.arrays.unit;

import de.shhn.algorithms.arrays.KthElement;
import de.shhn.algorithms.models.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class KthElementTest {

    @Test
    public void dynamicCompareTest()
    {
        KthElement kthElementAscending = new KthElement(true);
        KthElement kthElementDescending = new KthElement(false);
        Integer param1 = 10;
        Integer param2 = 20;

        // Ascending Compare
        assertEquals(true,kthElementAscending.isConditionTrue(param1,param2));
        assertEquals(false,kthElementAscending.isConditionTrue(param2,param1));
        assertEquals(false,kthElementAscending.isConditionTrue(param2,param2));

        // descending compare test
        assertEquals(false,kthElementDescending.isConditionTrue(param1,param2));
        assertEquals(true,kthElementDescending.isConditionTrue(param2,param1));
        assertEquals(false,kthElementDescending.isConditionTrue(param2,param2));
    }

    @Test
    public void partitiontTest(){
        KthElement kthElementAscending = new KthElement(true);
        KthElement kthElementDescending = new KthElement(false);

        // Test 1
        List<Integer> list = Arrays.asList(5,-2,6,0,4,17,10);
        assertEquals("Ascending failed!", 5,kthElementAscending.partition(list,0,list.size()-1));
        list = Arrays.asList(5,-2,6,0,4,17,10);
        assertEquals("Descending failed!", 1,kthElementDescending.partition(list,0,list.size()-1));

        // Test 2
        list = Arrays.asList(5,-2,6,0,4,17,10,20);
        assertEquals("Ascending failed!", 7,kthElementAscending.partition(list,0,list.size()-1));
        list = Arrays.asList(5,-2,6,0,4,17,10,20);
        assertEquals("Descending failed!", 0,kthElementDescending.partition(list,0,list.size()-1));

        // Test 3
        list = Arrays.asList(5,-2,6,0,4,17,10,20,-10);
        assertEquals("Ascending failed!", 0,kthElementAscending.partition(list,0,list.size()-1));
        list = Arrays.asList(5,-2,6,0,4,17,10,20,-10);
        assertEquals("Descending failed!", 8,kthElementDescending.partition(list,0,list.size()-1));


    }

    @Test
    public void kthBiggestQuickSearchTest()
    {
        KthElement kThElement = new KthElement();
        Integer k = 1;

        // List of Intereger
        List<Integer> integerList = Arrays.asList(0,10,3,-1,32);
        int intExpected = 10;
        assertEquals("Integer list test failed!",intExpected,kThElement.BiggestByQuickSearch(integerList,k));

        integerList = Arrays.asList(6, 5, 0, 1, 4, 8, 9, -2);
        k =3;
        intExpected = 5;
        assertEquals("Integer list test failed!",intExpected,kThElement.BiggestByQuickSearch(integerList,k));

        integerList = Arrays.asList(6, 5, 0, 1, 4, 8, 9, -2);
        k =7;
        intExpected = -2;
        assertEquals("Integer list test failed!",intExpected,kThElement.BiggestByQuickSearch(integerList,k));

        integerList = Arrays.asList(1, 1, 1, 1, 1);
        k =3;
        intExpected = 1;
        assertEquals("Integer list test failed!",intExpected,kThElement.BiggestByQuickSearch(integerList,k));

        integerList = Arrays.asList(1, 1, 1, 1, 1);
        k =0;
        intExpected = 1;
        assertEquals("Integer list test failed!",intExpected,kThElement.BiggestByQuickSearch(integerList,k));

        // List of Double
        List<Double> doubleList = Arrays.asList(16.10,10.1,3.3,-1.4,32.8);
        k = 1;
        double doubleExpected = 16.10;
        assertEquals("Double list test failed!",doubleExpected,kThElement.BiggestByQuickSearch(doubleList,k));

        doubleList = Arrays.asList(16.10,10.1,3.3,-1.4,32.8,22.10,22.15);
        k = 3;
        doubleExpected = 16.10;
        assertEquals("Double list test failed!",doubleExpected,kThElement.BiggestByQuickSearch(doubleList,k));

        doubleList = Arrays.asList(16.10,10.1,3.3,-1.4,32.8,22.10,22.15);
        k = 2;
        doubleExpected = 22.10;
        assertEquals("Double list test failed!",doubleExpected,kThElement.BiggestByQuickSearch(doubleList,k));

        doubleList = Arrays.asList(16.10,10.1,3.3,-1.4,32.8,-10.5654,22.10,22.15);
        k = 6;
        doubleExpected = -1.4;
        assertEquals("Double list test failed!",doubleExpected,kThElement.BiggestByQuickSearch(doubleList,k));


        // List of Students
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"hadi",12));  //5
        studentList.add(new Student(2,"hoda",20));  //0
        studentList.add(new Student(3,"mehdi",14)); //3
        studentList.add(new Student(4,"rohani",0)); //6
        studentList.add(new Student(5,"hasan",16)); //2
        studentList.add(new Student(6,"taghi",19)); //1
        studentList.add(new Student(7,"nilo",13));  //4

        k = 2;
        Student studentExpected = new Student(5,"hasan",16);
        Student actual = (Student) kThElement.BiggestByQuickSearch(studentList,k);
        assertEquals("Student list test Failed!", studentExpected.StudentNumber,actual.StudentNumber);

        k = 0;
        studentExpected = new Student(2,"hoda",20);
        actual = (Student) kThElement.BiggestByQuickSearch(studentList,k);
        assertEquals("Student list test Failed!", studentExpected.StudentNumber,actual.StudentNumber);

        k = 6;
        studentExpected = new Student(4,"rohani",0);
        actual = (Student) kThElement.BiggestByQuickSearch(studentList,k);
        assertEquals("Student list test Failed!", studentExpected.StudentNumber,actual.StudentNumber);

        k = 4;
        studentExpected = new Student(7,"nilo",13);
        actual = (Student) kThElement.BiggestByQuickSearch(studentList,k);
        assertEquals("Student list test Failed!", studentExpected.StudentNumber,actual.StudentNumber);


    }

    @Test
    public void kthSmallestQuickSearchTest()
    {
        KthElement kThElement = new KthElement();
        Integer k = 1;

        // List of Intereger
        List<Integer> integerList = Arrays.asList(0,10,3,-1,32);
        int intExpected = 0;
        assertEquals("Integer list test failed!",intExpected,kThElement.SmallestByQuickSearch(integerList,k));

        integerList = Arrays.asList(6, 5, 0, 1, 4, 8, 9, -2);
        k =3;
        intExpected = 4;
        assertEquals("Integer list test failed!",intExpected,kThElement.SmallestByQuickSearch(integerList,k));

        integerList = Arrays.asList(6, 5, 0, 1, 4, 8, 9, -2);
        k =7;
        intExpected = 9;
        assertEquals("Integer list test failed!",intExpected,kThElement.SmallestByQuickSearch(integerList,k));

        integerList = Arrays.asList(1, 1, 1, 1, 1);
        k =3;
        intExpected = 1;
        assertEquals("Integer list test failed!",intExpected,kThElement.SmallestByQuickSearch(integerList,k));

        integerList = Arrays.asList(1, 1, 1, 1, 1);
        k =0;
        intExpected = 1;
        assertEquals("Integer list test failed!",intExpected,kThElement.SmallestByQuickSearch(integerList,k));

        // List of Double
        List<Double> doubleList = Arrays.asList(16.10,10.1,3.3,-1.4,32.8);
        k = 1;
        double doubleExpected = 3.3;
        assertEquals("Double list test failed!",doubleExpected,kThElement.SmallestByQuickSearch(doubleList,k));

        doubleList = Arrays.asList(16.10,10.1,3.3,-1.4,32.8,22.10,22.15);
        k = 3;
        doubleExpected = 16.10;
        assertEquals("Double list test failed!",doubleExpected,kThElement.SmallestByQuickSearch(doubleList,k));

        doubleList = Arrays.asList(16.10,10.1,3.3,-1.4,32.8,22.10,22.15);
        k = 2;
        doubleExpected = 10.1;
        assertEquals("Double list test failed!",doubleExpected,kThElement.SmallestByQuickSearch(doubleList,k));

        doubleList = Arrays.asList(16.10,10.1,3.3,-1.4,32.8,-10.5654,22.10,22.15);
        k = 6;
        doubleExpected = 22.15;
        assertEquals("Double list test failed!",doubleExpected,kThElement.SmallestByQuickSearch(doubleList,k));

        // List of Students
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"hadi",12));  //1
        studentList.add(new Student(2,"hoda",20));  //6
        studentList.add(new Student(3,"mehdi",14)); //3
        studentList.add(new Student(4,"rohani",0)); //0
        studentList.add(new Student(5,"hasan",16)); //4
        studentList.add(new Student(6,"taghi",19)); //5
        studentList.add(new Student(7,"nilo",13));  //2

        k = 2;
        Student studentExpected = new Student(7,"nilo",13);
        Student actual = (Student) kThElement.SmallestByQuickSearch(studentList,k);
        assertEquals("Student list test Failed!", studentExpected.StudentNumber,actual.StudentNumber);

        k = 0;
        studentExpected = new Student(4,"rohani",0);
        actual = (Student) kThElement.SmallestByQuickSearch(studentList,k);
        assertEquals("Student list test Failed!", studentExpected.StudentNumber,actual.StudentNumber);

        k = 6;
        studentExpected = new Student(2,"hoda",20);
        actual = (Student) kThElement.SmallestByQuickSearch(studentList,k);
        assertEquals("Student list test Failed!", studentExpected.StudentNumber,actual.StudentNumber);

        k = 4;
        studentExpected = new Student(5,"hasan",16);
        actual = (Student) kThElement.SmallestByQuickSearch(studentList,k);
        assertEquals("Student list test Failed!", studentExpected.StudentNumber,actual.StudentNumber);


    }
}
