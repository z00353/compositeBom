// This class decides what to do with the children aka the components
// It overrides the default methods of the abstract class Component making them more specific

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeComponent extends Component {
    // We need to list each and every child aka component
    private List<Component> children = new ArrayList<Component>();

    // CompositeComponent inherits the variables "name" and "price"
    // from its parent - Component
    // We DO NOT override these
    public CompositeComponent(String name, long price) {
        super(name, price);
    }

    // Let the overriding begin! ;)
    @Override
    public long getPrice() {
        long sum = super.getPrice();
        // For-each loop (For each child in children... etc)
        for (Component child : children) {
            sum += child.getPrice();
        }
        return sum;
    }

    @Override
    public boolean add(Component child) {
        return children.add(child);
    }

    @Override
    public Iterator<Component> iterator() {
        return children.iterator();
    }

    @Override
    public int getChildCount() {
        return children.size();
    }
}
