package org.example.interview;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

@Data
@AllArgsConstructor
class Emp {
    Long id;
    String name ;
    Double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id.equals(emp.id);
    }

    @Override
    public int hashCode() {
        return id.intValue();
    }
}
public class HashMapPractice {

    public static void main(String[] args) throws InterruptedException {

        //weakhashmap();



        Emp emp = new Emp(123L,"Sushant",1000.0);
        Emp emp1 = new Emp(124L,"Saurabh",2000.0);
        Emp emp2 = new Emp(125L,"Rishabh",3000.0);
        Emp emp3 = new Emp(126L,"Guru",4000.0);
        Emp emp4 = new Emp(126L,"Guru",4000.0);


        Map<Emp,String> map = new HashMap<>();


        map.put(emp,emp.getName());
        map.put(emp1,emp1.getName());
        map.put(emp2, emp2.getName());
        map.put(emp3,emp3.getName());
        map.put(emp4,emp4.getName());

        map.entrySet().forEach(empStringEntry -> System.out.println(empStringEntry.getValue()+"  "+empStringEntry.getKey()));
        String  emp4name = map.get(emp4);
        System.out.println(emp4name);


    }

    public static void weakhashmap() throws InterruptedException {
        Emp emp = new Emp(123L,"Sushant",1000.0);
        Emp emp1 = new Emp(124L,"Saurabh",2000.0);
        Emp emp2 = new Emp(125L,"Rishabh",3000.0);
        Emp emp3 = new Emp(126L,"Guru",4000.0);
        Emp emp4 = new Emp(126L,"Guru",4000.0);





        Map<Emp,String> map = new WeakHashMap<>();

        map.put(emp,emp.getName());
        map.put(emp1,emp1.getName());
        map.put(emp2, emp2.getName());
        map.put(emp3,emp3.getName());

        map.entrySet().forEach(empStringEntry -> System.out.println(empStringEntry.getValue()+"  "+empStringEntry.getKey()));
        emp2 = null;
        emp3 = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("==========================================================================================");
        map.entrySet().forEach(empStringEntry -> System.out.println(empStringEntry.getValue()+"  "+empStringEntry.getKey()));

    }
}
