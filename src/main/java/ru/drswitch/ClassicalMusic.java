package ru.drswitch;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Do my initialized");

    }

    public void doMyDestroy(){

        System.out.println("Do my destroy");
    }

}
