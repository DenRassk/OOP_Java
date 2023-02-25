package family.links;/*
 * абстрактный класс связи людей
 */

import family.persons.Person;

public abstract class PersonLink {
    protected Person firstPerson;
    protected Person secondPerson;

    @Override
    public abstract String toString();

}
