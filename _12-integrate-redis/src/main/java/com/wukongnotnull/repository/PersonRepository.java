package com.wukongnotnull.repository;
//author: 悟空非空也（B站/知乎/公众号）

import com.wukongnotnull.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person,String> {

    @Override
    <S extends Person> S save(S entity);

    Optional<Person> findPersonByFirstName(String s);


}
