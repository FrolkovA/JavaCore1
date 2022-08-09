package SolvdLaba.University;

public class Security extends Person {
    private Person id;
    private Person name;
    private String post;
    private Person email;
    private Person age;
    private int weight;

    public Security(Person id, Person name, String post, Person email, Person age, int weight) {
        super();

        this.id = id;
        this.name = name;
        this.post = post;
        this.email = email;                   //conctructor
        this.age = age;
        this.weight = weight;

    }

    public Person getId() {
        return id;
    }

    public void setId(Person id) {
        this.id = id;
    }


    public Person getName() {
        return name;
    }

    public void setName(Person name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Person getEmail() {
        return email;
    }

    public void setEmail(String post) {
        this.email = email;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void protect(

    ) {
        //protect

    }
}