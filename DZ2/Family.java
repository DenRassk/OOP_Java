/*
 * класс - Семья
 */

import java.util.ArrayList;
import java.util.List;


public class Family {
    private ArrayList<PersonLink> links = new ArrayList<>();

    
    // добавление связи родитель - ребёнок
    public void addParentChildLink(Person parent, Person child) {

        links.add(new ParentChildLink(parent, child));
    }

    // добавление связи муж - жена
    public void addSpouse(Person husbran, Person wife) {

        links.add(new SpouseLink(husbran, wife));
    }

    // возвращаем весь список связей
    public List<PersonLink> getPersonLinks() {
        return this.links;
    }


}
