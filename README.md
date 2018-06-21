Bloom filters: explanation, use cases and examples
Bloom filter is an exotic data structure. It is used to tell whether an element is in the set or not. Bloom filters are memory efficient and fast data structure. It is a probabilistic data structure. It tells that an item is definitely not in the set or may be in the set.

Visualisation of Bloom Filter
Most important operations of a bloom filter are test and add.
Test is used to check whether a given element is in the set or not. If it returns:
•	false then the element is definitely not in the set.
•	true then the element is probably in the set. The false positive rate is a function of the bloom filter’s size and the number and independence of the hash functions used.
Add simply adds an element to the set. Removal is impossible without introducing false negatives, but extensions to the bloom filter are possible that allow removal e.g. counting filters.
 


Use cases:
The classic example is using bloom filters to reduce expensive disk (or network) lookups for non-existent keys. Bloom filters are being used by NoSQL database engines, especially by key/value stores in order to efficiently query data stores. If an element is not in the bloom filter than we know that we don’t need an expensive lookup operation. If the key is in the bloom filter then we know we can query the data stores for the given key. We can expect some false positives which needed to be handled by the engine.
Bloom filter can be used anywhere where false positives are OK and can be handled but false negatives are not acceptable.
Bloom filters can also be used to reduce I/O operations and thus increase performance.
 
A bloom filter doesn’t store the elements themselves, this is the important part. You don’t use a bloom filter to test if an element is present, you use it to test whether it’s certainly not present, since it guarantees no false negatives.
How does it work?
The bloom filter essentially consists of a bit vector (BitSet) of length m.
To add an item to the bloom filter, we feed it to k different hash functions and set the bits at the resulting positions. For example, bit vector can be m=50 cells in length and k=3 means, 3 hash functions will be applied to the key. Note that sometimes the hash functions produce overlapping positions, so less than k positions may be set.
To test if an item is in the filter, again we feed it to the k hash functions. This time, we check to see if any of the bits at these positions are not set. If any are not set, it means the item is definitely not in the set. Otherwise, it is probably in the set. More hash function you use, less likely you will get false positives.
Bloom filters are space efficient, since it uses bit vectors only. Given a Bloom filter with m bits and k hashing functions, both insertion and membership testing are O(k). That is, each time you want to add an element to the set or check set membership, you just need to run the element through the k hash functions and add it to the set or check those bits.


Examples: Wiki
•	Akamai‘s web servers use Bloom filters to prevent “one-hit-wonders” from being stored in its disk caches. One-hit-wonders are web objects requested by users just once, something that Akamai found applied to nearly three-quarters of their caching infrastructure. Using a Bloom filter to detect the second request for a web object and caching that object only on its second request prevents one-hit wonders from entering the disk cache, significantly reducing disk workload and increasing disk cache hit rates.[10]
•	Google BigTable, Apache HBase and Apache Cassandra, and Postgresql[11] use Bloom filters to reduce the disk lookups for non-existent rows or columns. Avoiding costly disk lookups considerably increases the performance of a database query operation.[12]
•	The Google Chrome web browser used to use a Bloom filter to identify malicious URLs. Any URL was first checked against a local Bloom filter, and only if the Bloom filter returned a positive result was a full check of the URL performed (and the user warned, if that too returned a positive result).[13][14]
•	The Squid Web Proxy Cache uses Bloom filters for cache digests.[15]
•	Bitcoin uses Bloom filters to speed up wallet synchronization.[16][17]
•	The Venti archival storage system uses Bloom filters to detect previously stored data.[18]
•	The SPIN model checker uses Bloom filters to track the reachable state space for large verification problems.[19]
•	The Cascading analytics framework uses Bloom filters to speed up asymmetric joins, where one of the joined data sets is significantly larger than the other (often called Bloom join in the database literature).[20]
•	The Exim mail transfer agent (MTA) uses Bloom filters in its rate-limit feature.[21]
•	Medium uses Bloom filters to avoid recommending articles a user has previously read.[22]


Output-

Bloom Filter Test

Enter set capacity and key size
2000 2000

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
1
Enter integer element to insert
67

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
1
Enter integer element to insert
87

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
1
Enter integer element to insert
81

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
1
Enter integer element to insert
33

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
2
Enter integer element to search
67
Search result : true

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
2
Enter integer element to search
35
Search result : false

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
2
Enter integer element to search
45
Search result : false

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
2
Enter integer element to search
87
Search result : true

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
5

Size = 4

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
4

Bloom set Cleared

Do you want to continue (Type y or n) 

y

BloomFilter Operations

1. insert 
2. contains
3. check empty
4. clear
5. size
3
Empty status = true

Do you want to continue (Type y or n) 

n

