package com.techlabs.inheritance;
import java.io.Serializable;

public class SerializationClass implements Serializable {
	private String name;
    private int value;

    public SerializationClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String toString() {
        return "SerializationClass(" + "name: '" + name + '\'' + ", value;" + value + ')';
    }
}
