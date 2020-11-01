package com.company;

import java.util.*;

public class TelephoneNumber {
    private Map<String, Set<String>> directory = new HashMap<>();

    public Map<String, Set<String>> getDirectory() {
        return directory;
    }

    public TelephoneNumber() {
        this.directory = directory;
    }

    public void add(String family, String number){
        if (directory.containsKey(family)){
            directory.get(family).add(number);
        }
        else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            directory.put(family, numbers);
        }

    }

    public Set<String> get(String family){
        if (directory.get(family)== null){
            return new HashSet<>();
        }
        return directory.get(family);
    }


}
