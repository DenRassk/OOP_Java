/*
 * класс "связь Муж - Жена"
 */

public class SpouseLink extends PersonLink{
    
    public SpouseLink(Person husband, Person wife ){
        this.firstPerson = husband;
        this.secondPerson = wife;
    }

    public Person getHusband() {
        return firstPerson;
    }

    public Person getWife() {
        return secondPerson;
    }
}
