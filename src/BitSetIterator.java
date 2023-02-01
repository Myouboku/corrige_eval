import java.util.BitSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BitSetIterator implements Iterator<Boolean> {
    private final BitSet bitSet;
    private int index;

    public BitSetIterator(BitSet bitSet) {
        this.bitSet = bitSet;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bitSet.length();
    }

    public Boolean next() {
        if (!hasNext()) throw new NoSuchElementException();
        return bitSet.get(index++);
    }
}
