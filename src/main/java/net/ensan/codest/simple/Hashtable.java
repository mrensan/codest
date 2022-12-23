package net.ensan.codest.simple;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Simple educational hashtable implementation
 */
public class Hashtable<K, V> implements Map<K, V> {

    private static final int DEFAULT_INITIAL_SIZE = 100;
    private final int initialSize;

    private int size = 0;

    private final LinkedList<?>[] values;

    public Hashtable(final int initialSize) {
        if (initialSize < 2) {
            throw new IllegalArgumentException("Initial size should be greater than 1");
        }
        this.initialSize = initialSize;
        values = new LinkedList<?>[initialSize];
    }

    public Hashtable() {
        this(DEFAULT_INITIAL_SIZE);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    public V get(Object key) {
        validateKey(key);
        final LinkedList<Entry<K, V>> linkedListInHash = getLinkedListInHash((K)key);
        if (linkedListInHash == null) {
            return null;
        }
        for (final Entry<K, V> entry: linkedListInHash) {
            if (key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        validateKey(key);
        LinkedList<Entry<K, V>> linkedListInHash = getLinkedListInHash(key);
        if (linkedListInHash == null) {
            linkedListInHash = new LinkedList<>();
        }
        linkedListInHash.add(new EntryImp<>(key, value));
        values[calculateIndex(key)] = linkedListInHash;
        size++;
        return value;
    }

    @Override
    public V remove(Object key) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static class EntryImp<K, V> implements Entry<K, V> {

        private final K key;
        private V value;

        public EntryImp(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return this.value;
        }
    }

    private int calculateIndex(K key) {
        return (key.hashCode() & 0x7FFFFFFF) % initialSize;
    }

    @SuppressWarnings("unchecked")
    private LinkedList<Entry<K, V>> getLinkedListInHash(K key) {
        int index = calculateIndex(key);
        return (LinkedList<Entry<K, V>>)values[index];
    }

    private void validateKey(Object key) {
        if (key == null) {
            throw new NullPointerException("key is null");
        }
    }
}
