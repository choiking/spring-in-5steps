package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    // What are the beans? @Component
    // What are the dependencies of a bean? @Autowired is the dependency of this @Component
    // Where to search for beans? => No need @SpringBootApplication

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsApplication.class, args);

        BinarySearchImpl binarySearchImpl =
                applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearchImpl1 =
                applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearchImpl);
        System.out.println(binarySearchImpl1);


        System.out.println(binarySearchImpl.binarySearch(new int[] {12, 4, 6}, 3));
    }
}