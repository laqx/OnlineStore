package OnlineStoreApp.demo.model;

public class Subcategory {
    private long id;
    private Category category;
    private String name;
//    private long category_id;

    public Subcategory(long id, Category category, String name) {
        this.id = id;
    //       this.category = category;
        this.name = name;
        this.category = category;
    }

    public Subcategory() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
