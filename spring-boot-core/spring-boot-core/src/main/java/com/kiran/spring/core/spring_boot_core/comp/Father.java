package com.kiran.spring.core.spring_boot_core.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Father {

    @Autowired
    @Qualifier("student2")
    private Student student;


    //adding qualifier to reduce ambiguity betweeen the beans
//    public Father(@Qualifier("student2") Student student) {
//        System.out.println("Creating Father Object");
//        this.student = student;
//    }

    public void useStudent()
    {
        System.out.println("using student");
        student.study();

    }

}
