package demo

class Person {
    String firstName
    String lastName
    Integer age

    static constraints = {
        firstName blank: false
        lastName blank: false
        age min: 1
    }
}
