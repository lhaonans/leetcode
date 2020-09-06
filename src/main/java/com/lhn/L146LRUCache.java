package com.lhn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lhn
 * @date 2020/8/25 21:12
 */
public class L146LRUCache {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* capacity */);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4
    }
}

class LRUCache {
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode() {
        }

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private DLinkedNode head, tail;
    private Map<Integer, DLinkedNode> cache;

    private int capacity;
    private int size;


    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.capacity = capacity;
        this.size = 0;

        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        DLinkedNode dLinkedNode = cache.get(key);
        if (dLinkedNode == null) {
            return -1;
        }
        removeNode(dLinkedNode);
        addToHead(dLinkedNode);
        return dLinkedNode.value;
    }

    public void put(int key, int value) {
        DLinkedNode dLinkedNode = cache.get(key);
        if (dLinkedNode == null) {
            dLinkedNode = new DLinkedNode(key, value);
            cache.put(key, dLinkedNode);
            addToHead(dLinkedNode);
            size++;
            if (size > capacity) {
                DLinkedNode tailPrev = tail.prev;
                removeNode(tailPrev);
                cache.remove(tailPrev.key);
                size--;
            }
        } else {
            dLinkedNode.value = value;
            removeNode(dLinkedNode);
            addToHead(dLinkedNode);
        }
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
}