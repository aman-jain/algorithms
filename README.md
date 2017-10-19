# Simple Algorithms and Data Structures

## Selection Sort

1. This is the most simplest sort of sort that uses in-place exchange of elements to be sorted and has quadractic speed for sorting.
2. In this algorithm, the smallest element is found out and placed in its right position.

Pusedo-Code:
```
for(i=0 to array.length){
    for(j=i+1 to j < array.length){
        if (array[j] < array[i]){
            minIndex = j;
        }
    }
    exchange(i,minIndex);
}
```

