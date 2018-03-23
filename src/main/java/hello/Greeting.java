// Greeting class models the greeting representation. 
// Greeting POJO has fields, constructors, and accessors for `id` and content data.

package hello;

// Greeting class definition
public class Greeting {

    // Class fields id and content
    private final long id;
    private final String content;

    // Object constructor
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    // Accessor method for id
    public long getId() {
        return id;
    }

    // Accessor method for content
    public String getContent() {
        return content;
    }
}
