package OnlineStoreApp.demo.model;

public class Category {
    private long id;
    private String name;
    private long subcategory_id;

    public Category(long id, String name, long subcategory_id){
        this.id=id;
        this.name=name;
        this.subcategory_id = subcategory_id;
    }

    public Category(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(long subcategory_id) {
        this.subcategory_id = subcategory_id;
    }
}
