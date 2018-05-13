package com.demo.Bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by hasee on 2018/5/8.
 */
@Data
@Getter
@Setter
public class User {
    public String loginName;
    public String passWord;
    private String localName;
    private String email;
}
