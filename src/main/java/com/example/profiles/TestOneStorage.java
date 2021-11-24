package com.example.profiles;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestOneStorage extends CrudRepository<JpaTestOne, String> {
}
