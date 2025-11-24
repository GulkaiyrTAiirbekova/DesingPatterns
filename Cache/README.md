# CacheHomework — Reviewer's Guide

## Objective
Implement a simple in-memory cache with:
- Keys: `String`
- Values: `Integer`
- Operations:
    - `void put(String key, int value)`
    - `Integer get(String key)` (returns `null` if absent)
    - `void remove(String key)`
    - Optional:
        - `void clear()`
        - `int size()`
        - `boolean containsKey(String key)`

Implementations provided:
- `FIFOCache` — evicts entries in first-in-first-out order
- `LRUCache` — evicts the least recently used entry

Both caches accept a `capacity` parameter at construction. When adding an entry beyond capacity, the cache evicts one existing entry according to its policy.

## Files
- `Cache.java` — interface defining methods.
- `FIFOCache.java` — FIFO implementation using `LinkedHashMap` (insertion order).
- `LRUCache.java` — LRU implementation using `LinkedHashMap` (access order).
- `MainDemo.java` — small demo & smoke tests.
- `README.md` — this file.

## Design notes
- I used Java's `LinkedHashMap` because it provides predictable iteration order:
    - `accessOrder = false` — preserves insertion order (good for FIFO).
    - `accessOrder = true` — preserves access order (good for LRU).
- `removeEldestEntry` is overridden to perform eviction automatically when `size() > capacity`.
- Methods are `synchronized` for simple thread-safety; this is sufficient for homework examples. For high-performance concurrent caches, consider `ConcurrentHashMap` with additional data structures or third-party cache libraries.
- `get` returns `Integer` and `null` if the key doesn't exist. If you prefer primitive `int`, we could return `-1` or throw an exception when absent — choose based on specification. Current implementation returns `Integer` to clearly indicate "not present".

## Time & Space Complexity
- `put`, `get`, `remove`, `containsKey` — average O(1).
- Space: O(capacity).

## How to compile and run
