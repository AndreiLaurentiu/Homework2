package com.factory;

public class AnimalFactory {
        public Animal createAnimal(String animalType)
        {
            if (animalType == null || animalType.isEmpty())
                return null;
            return switch (animalType) {
                case "tiger" -> new Tiger();
                case "monkey" -> new Monkey();
                case "owl" -> new Owl();
                default -> null;
            };
    }
}
