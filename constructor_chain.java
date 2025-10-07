class Animal {
    String name;

    Animal(String name) {      // only a parameterized constructor
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);           // must call parent constructor first
        this.breed = breed;    // then do child-specific setup
    }
}