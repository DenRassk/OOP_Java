package family.links;/*
 * класс связь типа Муж - Жена
 */

import family.persons.Person;

public final class SpouseLink extends PersonLink {

    public SpouseLink(Person husband, Person wife) {
        this.firstPerson = husband;
        this.secondPerson = wife;
    }

    public Person getHusband() {
        return firstPerson;
    }

    public Person getWife() {
        return secondPerson;
    }

    @Override
    public String toString() {
        return "Муж: " + getHusband().toString() + ". Жена: " + getWife().toString();
    }
}
