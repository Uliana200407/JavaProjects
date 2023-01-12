package org.example.mathActions;

import org.springframework.stereotype.Component;

@Component
public class Addition {
    public float getAddition(float num1,float num2){
        return num1+num2;
    }
}
