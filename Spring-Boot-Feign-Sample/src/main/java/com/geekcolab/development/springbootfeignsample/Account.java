package com.geekcolab.development.springbootfeignsample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    private String accountNumber;
    private String balance;
}
