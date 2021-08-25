package com.wukongnotnull.repository;

import com.wukongnotnull.domain.Address;
import com.wukongnotnull.domain.Family;
import com.wukongnotnull.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//author: 悟空非空也（B站/知乎/公众号）
@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private  PersonRepository  personRepository;

    // 存
    @Test
    void save() {
        Person person = new Person();
        person.setId("002");
        person.setLastName("杨");
        person.setFirstName("过");

        Address address = new Address();
        address.setNation("中国");
        address.setVillage("江苏省盐城市某某村3号");
        person.setAddress(address);

        List<Family> familyList = new ArrayList<>();
        Family father = new Family();
        father.setType("father");
        father.setName("杨康");
        Family mother = new Family();
        mother.setType("mother");
        mother.setName("穆念慈");
        familyList.add(father);
        familyList.add(mother);
        person.setFamilyList(familyList);

        Person person1 = personRepository.save(person);

        System.out.println("person1 = " + person1);

    }
    // 取（读）
    @Test
    void findPersonByFirstName() {
        Optional<Person> personByFirstName = personRepository.findPersonByFirstName("过");
        if (personByFirstName.isPresent()) {
            Person person = personByFirstName.get();
            System.out.println("person = " + person);
        }


    }
}