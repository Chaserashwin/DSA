/*
    Suppose we have two sorted arrays :-
    arr1[n] = {1,3,5,7}      arr2[m] = {0,2,6,8,9}
    we can sort them using another array of 
    arr3[n+m] = {0,1,2,3,5,6,7,8,9}

    Explaination:-
    arr1[n] = {1,3,5,7}      arr2[m] = {0,2,6,8,9}
               |                        |
               |                        |
              left                    right

    arr3[n+m] = {_,_,_,_,_,_,_,_,_}
                 |
                 |
               index
    
    Main logic:-
    while(left <= n && right <= m) {
        if(arr1[left] <= arr2[right]) {
            arr3[index] = arr1[left];
            left++; index++;
        }
        else {
            arr3[index] = arr1[right];
            right++; index++;
        }
    }
    //if traversal of arr2 gets completed
    while(left < n) {
        arr3[index++] = arr1[left++];
    }
    //if traversal of arr1 gets completed
    while(right < m) {
        arr3[index++] = arr2[right++];
    }

    //to put back into the initial arrays
    for(int i=0; i<n+m; i++) {
        if(left <= n) {
            arr1[left++] = arr3[i];
        }
        else {
            arr2[i-n] = arr3[i];
        }
    }

 */