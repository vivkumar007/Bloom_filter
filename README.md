# Bloom filters: explanation, use cases and examples

Bloom filter is an exotic data structure. It is used to tell whether an element is in the set or not. Bloom filters are memory efficient and fast data structure. It is a probabilistic data structure. It tells that **an item is definitely not in the **set** or **may be in the set.**

# Visualisation of Bloom Filter
Most important operations of a bloom filter are **test** and **add**.
**Test** is used to check whether a given element is in the set or not. If it returns:

-	false then the element is definitely not in the set.
-	true then the element is probably in the set. The false positive rate is a function of the bloom filter’s size and 

-	Add simply adds an element to the set. Removal is impossible without introducing false negatives, but extensions to the bloom filter are possible that allow removal e.g. counting filters.

![bloom-filter](https://user-images.githubusercontent.com/29231034/41744799-825ef6e2-75c2-11e8-9e81-45647c10f85d.png)


# Use cases:
> The classic example is using bloom filters to reduce expensive disk (or network) lookups for non-existent keys. Bloom filters are being used by NoSQL database engines, especially by key/value stores in order to efficiently query data stores. If an element is not in the bloom filter than we know that we don’t need an expensive lookup operation. If the key is in the bloom filter then we know we can query the data stores for the given key. We can expect some false positives which needed to be handled by the engine.

>  Bloom filter can be used anywhere where false positives are OK and can be handled but false negatives are not acceptable.

> Bloom filters can also be used to reduce I/O operations and thus increase performance.


A bloom filter doesn’t store the elements themselves, this is the important part. You don’t use a bloom filter to test if an element is present, you use it to test whether it’s certainly **not** present, since it guarantees no false negatives.

### How does it work?
-	The bloom filter essentially consists of a bit vector (BitSet) of length m.
-	 To add an item to the bloom filter, we feed it to k different hash functions and set the bits at the resulting positions. For example, bit vector can be m=50 cells in length and k=3 means, 3 hash functions will be applied to the key. Note that sometimes the hash functions produce overlapping positions, so less than k positions may be set.
-	To test if an item is in the filter, again we feed it to the k hash functions. This time, we check to see if any of the bits at these positions are not set. If any are not set, it means the item is definitely not in the set. Otherwise, it is probably in the set. More hash function you use, less likely you will get false positives.
-	Bloom filters are space efficient, since it uses bit vectors only. Given a Bloom filter with m bits and k hashing functions, both insertion and membership testing are O(k). That is, each time you want to add an element to the set or check set membership, you just need to run the element through the k hash functions and add it to the set or check those bits.



### To Run/Test an example in Eclipse
* Install JDK and eclipse/intellij idea
* Pull the source code 
* Execute the "Bloom_filter/src/BloomFilterTest.java" in any apllication(eclipse/intellij idea)
* Follow the given instruction **output.txt**
