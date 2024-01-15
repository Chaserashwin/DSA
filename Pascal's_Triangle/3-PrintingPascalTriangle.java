/*  Pascal triangle will be look like this:-
    row no.
      1                         1
      2                     1       1
      3                 1       2       1
      4             1       3       3       1
      5         1       4       6       4       1
      6     1       5       10      10      5       1

By using traditional method:-
    function PrintPascals(int n) {
        create ansList[] 
        for(row = 1->n) {
            create tempList[];
            for(col = 1->row) {
                tempList.add(nCr(row-1, col-1));
            }
            ansList.add(tempList[]);
        }
    }
It will take time complexity of O(N*N*N)

To reduce this time complexity and to optimise it we will be using the second [SpecificRow] function which will reduce its time complexity to O(N*N) from O(N*N*N)
*/