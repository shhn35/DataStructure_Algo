# DataStructure_Algo
Some of primitive and complex Data Structures such as Queue, Stack, B-Tree, Graph as well as some famous algorithms in sort and search area are implemented with a bunch of Test scenarios.

#### Note: All algorithms (classes) have a related Test class under Test folder. Therefore, for runing the algorithms, simply run the related Test Class.

## Lists of Algorithms
### MergeToSortedArray
- A simple implimentation of merge to sorted array based on arrays of integers.
- This class is basically used in MergeSort.
### MergeSort
- Merge Sort is based on deviding an array into two sub arrays and try to sort each sub arrays by MergeToSortedArray concept. 
- To do so, the process of deviding the array into two sub arrays acontinues, in a recursive manner, until reaching to one-element arrays. Given that the single-element array an be considered as a sorted array, by using the MereToSortedArrays we can merge each sun arrays until obtaining the original array but sorted.
- The comutational complexity of this algorithms is O(n log n), however, it requiers additional storage for storing sub arrays recursively.
- log n is for deviding the array into two sub arrays.
- n is for using Merge To SOrted Array algorithm.
### Inplace MergeSort
### QuickSort
- The implemented QuickSort in based on a List<Integer>, which easily can be converted to a Generic implimentation.
- The idea of Quick Sort is to select an arbitrary element ,**pivot**, in the array, and find its final position in the eventual sorted array. Moreover, it ensurs that all emenetns befor the **pivot** is smaller that it, and also all elements after the **pivot** is greater than it.
- After puting the **pivot** in its place, it devides the array into two sub arrays. One is in the left side of **pivot** an the other is in the right side. Then, QuickSort is run again for both sub arrays recursively, unless the array get sorted.
- The computational complexity of Quick Sort, in an unsorted array, is O(n log n). However, in the worst case, the input array is sorted reversely, it would as bad as O(n^2).
- For evoiding this destructive effect, one good solution is to shuffle the input array first then try to sort it.
### QuickSearch
- Quick Search is the most frequent used algorithm for finding the kth either biggest or smallest element in an unsorted array in O(n).
- It uses the idea behind the QuickSort, and uses the Partitioning procedure to avoid investigatin all elements.
- It takes the most right element in the array as **pivot** and determines its final positions. Now, based on the position index of **pivot** and k, it should just look in to the either right or left side of **pivot**.
- This algorithm can be found in the **kthLargestElementSimpleImpl** class.
### KthElement
- This class is the more complex and comperhensive implementation of Quick Search.
- It is a Generic implimentation. Therefore, works with a List of any objects that implements the Combarable interface. 
- For instance, in the last part of its Test Cases, there are some tests which are based on a List<Students>, and it works greately.


