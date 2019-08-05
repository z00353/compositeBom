// Here we create an abstract that briefly defines the billed objects:
// The components will have: "name" and "price" which will be used throughout the system
// The components should:
// 1. Have their "name" and "price" able to be taken
// 2. Be added
// 3. Be iterated through
// 4. Get counted

import java.util.Collections;
import java.util.Iterator;

public abstract class Component {
    private String name;
    private long price;

    public Component(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    // Default implementation for child management operations
    public boolean add(Component component) {
        return false;
    }

    public Iterator<Component> iterator() {
        return Collections.emptyIterator();
    }

    public int getChildCount() {
        return 0;
    }
}
