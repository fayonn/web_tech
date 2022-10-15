package com.labs.web_tech;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class Item {
    private String firstName;
    private String lastName;
    private int age;
    private int groupNumber;
}
