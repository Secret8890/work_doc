package com.actbase.rest.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService{
    //유저 이름에 맞게 인사하는 메소드
    @Override
    public String say(String name) {
        String word = null;
        name = replaceString(name).trim();
        if(name.isEmpty()) {
            word = "이름을 입력하지 않았습니다.";
        } else {
            //name = name.replaceAll("\'", "");
            word = (name +="님 반갑습니다.");
        }
        return word;
    }

    //한글, 영문, 숫자를 제외한 모든특수문자를 공백 처리하는 메소드
    private String replaceString(String str) {
        String match = "[^\uAC00-\uD7A30-9a-zA-Z]";
        str = str.replaceAll(match, "");
        return str;
    }
}
