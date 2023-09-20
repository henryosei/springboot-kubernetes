package com.techgenerale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public GreetRecord hello(){
        List<Company> companyList=new ArrayList<>();
        companyList.add(new Company("LSI"));
        companyList.add(new Company("UTRAK"));
        companyList.add(new Company("Sensio "));
        return new GreetRecord(new People("CEI"),List.of(""));
    }

    record GreetRecord(People people,List<String> companies){}
    record Company(String name){}
    record People(String name){}
}
