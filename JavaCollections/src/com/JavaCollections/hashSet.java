package com.JavaCollections;

import java.util.HashMap;
import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        System.out.println(set);

        /*
===========================
        HASHING NOTES
===========================

1) Hash Table:
--------------
Hash Table ek data structure hai jo key ko ek index me convert karta hai
aur us index par value store karta hai.

Internally ye ek ARRAY hota hai.

Formula:
index = hash(key) % arraySize

Isliye search, insert, delete average case me O(1) hota hai.


2) Hash Function:
-----------------
Hash Function ka kaam hota hai:
KEY ko INTEGER index me convert karna.

Example:
key = 200
index = 200 % 7 = 4

Ab value index 4 pe store hogi.


3) Collision:
-------------
Jab do alag keys ka same index aa jaye.

Example:
10 % 5 = 0
15 % 5 = 0

Dono index 0 pe jayenge → Collision

Collision handle karne ke tareeke:
1. Chaining (LinkedList use karte hain)
2. Open Addressing

Java HashMap chaining use karta hai.


4) Load Factor:
---------------
Load Factor = number of elements / table size

Default Load Factor = 0.75

Agar load factor 0.75 se zyada ho jaye,
toh Java rehashing karta hai (table size double).


5) HashMap:
-----------
HashMap Java Collection Framework ka part hai.
Ye key-value pair store karta hai.

- Duplicate key allowed nahi
- Duplicate value allowed
- Order maintain nahi karta
- Null key allowed (sirf ek)
- Time Complexity O(1) average


6) HashSet:
-----------
HashSet internally HashMap use karta hai.

Ye sirf unique values store karta hai.
Duplicate values allowed nahi.

Internally:
HashSet value ko HashMap ke key ke roop me store karta hai.


===========================
        CODE EXAMPLE
===========================
*/


        class HashingDemo {

            public static void main(String[] args) {

        /*
        ===========================
            HASHMAP EXAMPLE
        ===========================
        */

                HashMap<Integer, String> map = new HashMap<>();

                // put() → insert key-value pair
                map.put(10, "Ten");
                map.put(20, "Twenty");
                map.put(30, "Thirty");

                // Duplicate key insert karenge
                map.put(10, "Updated Ten");
                // Ye overwrite karega purani value ko

                // get() → value retrieve karta hai
                System.out.println(map.get(10));  // Updated Ten

                // containsKey() → check karta hai key exist karti hai ya nahi
                System.out.println(map.containsKey(20)); // true

                // remove() → key delete karta hai
                map.remove(30);

                // size() → total elements
                System.out.println(map.size());



        /*
        ===========================
            HASHSET EXAMPLE
        ===========================
        */

                HashSet<Integer> set = new HashSet<>();

                set.add(5);
                set.add(10);
                set.add(15);

                set.add(10);
                // Duplicate add karne ki koshish
                // Ye store nahi hoga (HashSet unique hota hai)

                System.out.println(set);

        /*
        ===========================
        INTERNAL WORKING SUMMARY
        ===========================

        HashMap internally:
        1) Key ka hashCode() call karta hai
        2) index calculate karta hai
        3) Us index pe store karta hai
        4) Collision ho toh LinkedList / Tree bana deta hai

        Isliye average time complexity O(1) hoti hai.
        */
            }
        }
    }
}
