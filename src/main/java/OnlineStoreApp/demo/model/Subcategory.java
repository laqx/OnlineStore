package OnlineStoreApp.demo.model;

public class Subcategory {
    private long id;
    private Category category;
    private String name;

    public Subcategory(long id, Category category, String name){
        this.id=id;
        this.category=category;
        this.name=name;
    }
    public long getId(){
        return id;
    }
    public Category getCategory(){
        return category;
    }
    public String getName(){
        return name;
    }
}
