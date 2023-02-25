public enum TypeLink {
    Spouse("cупруг(а)"),
    Father("папа"),
    Mother("мама"),
    Son("cын"), 
    Daughter("дочь"), 
    Sister("сестра"), 
    Brother("брат"), 
    GrandMother("бабушка"),
    GrandFather("дедушка"), 
    Grandson("внук"),
    Granddaughter("внучка"),
    Uncle("дядя"), 
    Aunt("тетя"), 
    Niece("племянница"),
    Nephew("племянник");
    
    private String title;

    TypeLink (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString() {
        return title;
    }
    
    
}
