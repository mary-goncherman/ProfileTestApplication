package com.example.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileTestService {

    public TestOneStorage testOneStorage;

    public ProfileTestService() {}

    @Autowired
    public ProfileTestService(TestOneStorage testOneStorage) {
        this.testOneStorage = testOneStorage;
    }

    public void createTestData() {
        JpaTestOne testOne = new JpaTestOne("Mary");
        testOneStorage.save(testOne);
    }
}
