/*

Most optimal way to sort the array containing 0|1|2 is by using the ["Dutch National Flag Algorithm"]

Explaination of this Algorithm:-
we use 3 pointers here to use this Algo...

        [0...low-1]    -> 0  (extreamly left)
        [low...mid-1]  -> 1
        [high+1...n-1] -> 2  (extreamly right)

        |-----------------------------------------------------------------|
        |                                                                 |
        |        0            low          mid          high+1            |
        |        |             |            |             |               |
        |        |             |            |             |               |
        |       [000000000]   [11111111]   [120210210]   [22222222]       |
        |                |            |             |            |        |
        |                |            |             |            |        |
        |              low-1        mid-1         high          n-1       |
        |                                                                 |
        |         (sorted)     (sorted)     (unsorted)    (sorted)        |
        |                                                                 |
        |-----------------------------------------------------------------|

        Now to sort the unsorted array we will be using these pointers like:
        -> low and mid is pointed at the start of the array
        -> high is pointed at the end of the array
        So, to sort an array
                    if(a[mid] == 0)  { swap(a[low], a[mid]), low++, mid++ }
                    if(a[mid] == 1)  { mid++ }
                    if(a[mid] == 2)  { swap(a[high], a[mid]), high-- }


*/