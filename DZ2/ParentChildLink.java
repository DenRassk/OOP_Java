/*
 * класс "связь Родитель-Ребёнок"
 */

public class ParentChildLink extends PersonLink{
    
    public ParentChildLink(Person parent, Person child) {
        this.firstPerson = parent;
        this.secondPerson = child;
    }

    public Person getParent() {
        return firstPerson;
      }

    public Person getChild() {
        return secondPerson;
    }

}
