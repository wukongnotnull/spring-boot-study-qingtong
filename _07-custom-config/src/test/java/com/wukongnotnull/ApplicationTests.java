package com.wukongnotnull;

import com.wukongnotnull.domain.MyProperties;
import com.wukongnotnull.domain.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private MyProperties myProperties;

    @Test
    void contextLoads() {
        System.out.println("myProperties = " + myProperties);

    }


    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testSpringXml(){
        Pet pet = (Pet) applicationContext.getBean("myPet");
        System.out.println("pet = " + pet);

    }

    @Test
    void testConfiguration(){
        Pet aPet = (Pet) applicationContext.getBean("aPet");
        System.out.println("aPet = " + aPet);
    }

}
