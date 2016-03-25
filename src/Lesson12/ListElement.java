package Lesson12;

/**
 * Created by User on 22.03.2016.
 */
public class ListElement<C> {
    private Object value;
    private ListElement<C> next;

    public ListElement(Object value) {
        this.value = value;
    }

    public int size() {
        if (next == null) {
            return 1;
        } else {
            return next.size() + 1;
        }
    }

    public Object get(int index) {
        if (index == 0) {
            return value;
        } else {
            //ПРОверрка есть ли ссыллка на дрругой объект next это ссылка
            if (next == null) {
                return null;
            }
            return next.get(index - 1);
        }
    }

    public void add(Object o) {
        if (next == null) {
            next = new ListElement<C>(o);
        } else {
            next.add(o);
        }
    }

    public ListElement<C> getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }
}
