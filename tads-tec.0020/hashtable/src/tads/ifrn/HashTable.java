package tads.ifrn;

import java.util.LinkedList;

// Part of Cosmos by OpenGenus Foundation
public class HashTable<K, V> {
    private class HTPair {
        K key;
        V value;

        public HTPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object other) {
            HTPair op = (HTPair) other;
            return this.value.equals(op.value);
        }

        public String toString() {
            return "{" + this.key + "->" + this.value + "}";
        }
    }

    private LinkedList<HTPair>[] bucketArray;
    private int size;

    public static final int DEFAULT_CAPACITY = 5;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    private int HashFunction(K key) {
        int hc = key.hashCode();
        hc = Math.abs(hc);

        return hc % this.bucketArray.length;
    }

    public void putListaLigada(K key, V value) throws Exception {
        int bi = HashFunction(key);
        HTPair data = new HTPair(key, value);
        if (this.bucketArray[bi] == null) {
            LinkedList<HTPair> bucket = new LinkedList<>();
            bucket.addLast(data);
            this.size++;
            this.bucketArray[bi] = bucket;
        } else {
            int foundAt = this.bucketArray[bi].indexOf(data);
            if (foundAt == -1) {
                this.bucketArray[bi].addLast(data);
                this.size++;
            } else {
                HTPair obj = this.bucketArray[bi].get(foundAt);
                obj.value = value;
                this.size++;
            }
        }
        double lambda = (this.size * 1.0) / this.bucketArray.length;
        if (lambda > 0.75) {
            rehash();
        }
    }

    public void display() {
        for (LinkedList<HTPair> list : this.bucketArray) {
            if (list != null && !list.isEmpty()) {
                list.forEach((temp) -> {
                    System.out.println(temp.toString());
                });
            } else {
                System.out.println("NULL");
            }
        }
    }

    public V get(K key) throws Exception {
        int index = this.HashFunction(key);
        LinkedList<HTPair> list = this.bucketArray[index];
        HTPair ptf = new HTPair(key, null);
        if (list == null) {
            return null;
        } else {
            int findAt = list.indexOf(ptf);
            if (findAt == -1) {
                return null;
            } else {
                HTPair pair = list.get(findAt);
                return pair.value;
            }
        }
    }

    public V remove(K key) throws Exception {
        int index = this.HashFunction(key);
        LinkedList<HTPair> list = this.bucketArray[index];
        HTPair ptf = new HTPair(key, null);
        if (list == null) {
            return null;
        } else {
            int findAt = list.indexOf(ptf);
            if (findAt == -1) {
                return null;
            } else {
                HTPair pair = list.get(findAt);
                list.remove(findAt);
                this.size--;
                return pair.value;
            }
        }
    }

    public void rehash() throws Exception {
        LinkedList<HTPair>[] oba = this.bucketArray;
        this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[2 * oba.length];
        this.size = 0;
        for (LinkedList<HTPair> ob : oba) {
            while (ob != null && !ob.isEmpty()) {
                HTPair pair = ob.removeFirst();
                this.putListaLigada(pair.key, pair.value);
            }
        }
    }
}
