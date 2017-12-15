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
## Priority Queue
1. In priority queue,the data is arranged in a binary tree such that the root is at poisting k, left node of the element is set at 2k value and right node is set to 2k+1 value.
2. Thus when we are moving up the tree, we are setting the value of k to k/2 and while moving down we are setting it to 2k or 2k+1.
3. A binary tree is heap-ordered if the the key[k] ineachnodeis larger than or equalto the keys in that node's two children.

When a new element is being inserted in the priority queue:
```
int[] pq = new int[];
int  n = 0;
public void insert(int k){
    pg[++n] = k;
    swim(n);
}

public void swim(n){
    int k = n;
    if(n==1){
        return;
    }else{
       while(k>1){
           if(pq[k]>pq[k/2]){
               exchange(pq[k],pq[k/2]);
           }
           k=k/2;
       }
    }
}

public void del(){
    
    int max = pq[1];
    exchange(1,n--);
    pq[n+1] = null;
    sink(1);
    return max;
}

public void sink(n){
    int k =n; 
    while(2k < n){
        j = 2k;
        if(j<n && (pq[j] > pq[j+1])
            j++;
        if(pq[k] < pq[j]){
            exchange(k,j);
            k=j;
        }            
    }    
}
```
## Binary Search Tree[BST]
A binary search tree is a binary tree where each node has a value and satisfies the restriction that each node is larger than the keys in the left sub tree and less than keys in right sub tree.

Each node in BST contains a key, value, link to left node, link to right node and node count.

