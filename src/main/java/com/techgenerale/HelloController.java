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
        companyList.add(new Company("Bank of Ghana"));
        companyList.add(new Company("GDPC"));
        companyList.add(new Company("Ministry of Finance"));
        return new GreetRecord(new People("Pearl Esua-Mensah"),List.of(""));
    }

    record GreetRecord(People people,List<Company> companies){}
    record Company(String name){}
    record People(String name){}
}
