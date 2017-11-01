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
## Insertion Sort
1. This sort is bit faster than Selection Sort.
2. It is in-place sort algorithm as well.
3. This sorting algorithm mimics the way a person sorts the cards ih his hands.

Pseudo-Code
```
for(int i =0 ;i < array.length ;i ++){
    j=i+1;
    while (j>= 0){
        if(array[j]>array[j--]){
            exchange(j,j--);
        }
        j--;
    }
}
```
## Shell Sort
1. Insertion sort works well if the elements are nearly sorted.
2. Shell Sort works by shuffling the array and making it nearly sorted.

Pseudo-code
```
int size = array.length;

// calculate the split
int h = 1;
while (h < size/3){
    h = 3*h + 1;
}
while (h >=1){
    for (int i=h; i<size;i++){
        int j =i;
        while(j< size){
            if(array[j]>array[j-i]){
                exchange(j,j-i);
            }
            j++;
        }    
    }
    h= h/3;
}

```
## Merge Sort
1. One of the first divide and conquer type of algortihm.
2. Uses recursion
3. Input is continously split into smaller individual elements that are sorted and merged back in.
```
sort(array, lo, hi){
    int mid = lo + (hi-lo)/2;
    sort(array,lo,mid);
    sort(array,mid+1,hi);
    merge(array, lo, mid, hi);
}

merge (array, lo, mid, hi){
    int i = lo;
    int j = mid+1;
    for(int i =0; i<array.length; i++){
        array1[i] = array[i];
    }
    for(int k=lo; k<hi; k++){
        if(j>hi){
            array[k] = array1[i];
            i++;
        }
        if(i>mid){
            array[k] = array1[j];
            j++;
        }
        if(array1[i] < array1[j]){
            array[k] = array1[i];
            i++;
        } else{
            array[k] = array1[j];
            j++;
        }
    }
}
```