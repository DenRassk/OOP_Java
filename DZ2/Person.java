/*
 * класс персона
 */

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String secondName;
    private LocalDate dateBirthday;
    private String sex;
    

    public Person(String firstName, String secondName, LocalDate dateBirthday, String sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateBirthday = dateBirthday;
        this.sex = sex;
    }
    

    @Override
    public String toString() {
        return " Фамилия: " + getSecondName() + 
            ", имя: " + getFirstName() +
            ", день рождения: " + getDateBirthday() +
            ", пол: " + getSex();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getDateBirthday() {
        return this.dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


  }