package com.java.ds.hashing;

public class HashTable {
    private HashNode [] buckets;
    private int noOfBuckets;// capacity
    private int size;// No. of key value pair or number of ENTRY

    public HashTable(){
        this(10); // default capacity
    }

    public HashTable(int capacity){
        this.noOfBuckets = capacity;
        this.buckets = new HashNode[noOfBuckets];
        this.size = 0;
    }

    private class HashNode{
        private Integer key; // can be generic
        private String value; // can be generic
        private HashNode next; // reference next node
        HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void put(Integer key, String value){

    }

    public String get(Integer key){
        return null;
    }

    public String remove(Integer key){
        return null;
    }
}
