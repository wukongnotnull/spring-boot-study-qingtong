package com.wukongnotnull;

import com.wukongnotnull.domain.Person;
import com.wukongnotnull.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
class ApplicationTests {

    @Autowired
    private Person person;

    @Value(value="${flag}")
    private  String flag;

    @Value(value = "${person.id}")
    private  Integer id;

    @Value(value = "${person.name}")
    private  String name;


    @Value(value = "${person.family[0]}")
    private String familyOne;

    @Value(value = "${person.family}")
    private List family;

    @Value(value = "${person.hobbies[0]}")
    private String hobbiesOne;

    @Value(value="${person.hobbies}")
    private String[] hobbies;

    // 对于自定义对象或者Map类型的数据，需要直接取属性值
    @Value(value = "${person.map.level}")
    private Integer level;

    @Value(value="${person.pet.petName}")
    private String  petName;

    //报错：llegalArgumentException: Could not resolve placeholder 'person.pet' in value "${person.pet}"
/*    @Value(value = "${person.pet}")
    private Pet pet;*/

    @Test
    void test2(){
        System.out.println("flag = " + flag);
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("familyOne = " + familyOne);
        System.out.println("family = " + family);
        System.out.println("hobbiesOne = " + hobbiesOne);
        System.out.println("hobbies = " + Arrays.toString(hobbies));
        System.out.println("level = " + level);
        System.out.println("petName = " + petName);
      /*  System.out.println("pet = " + pet);*/
    }


    @Test
    void contextLoads() {
        System.out.println(person);

    }


    @Autowired
    private User user;

    @Test
    void emailValidation(){
        System.out.println("user = " + user);
    }
}
