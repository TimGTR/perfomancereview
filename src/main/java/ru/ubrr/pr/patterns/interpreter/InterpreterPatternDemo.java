package ru.ubrr.pr.patterns.interpreter;

public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression person1 = new TerminalExpression("Person1");
        Expression person2 = new TerminalExpression("Person2");

        Expression isSingle = new OrExpression(person1, person2);

        System.out.println("Is single? " + isSingle.interpret("Person1"));
        System.out.println("Is single? " + isSingle.interpret("Person2"));
        System.out.println("Is single? " + isSingle.interpret("Person3"));
    }
}

