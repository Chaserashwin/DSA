/*  Pascal triangle will be look like this:-
    row no.
      1                         1
      2                     1       1
      3                 1       2       1
      4             1       3       3       1
      5         1       4       6       4       1
      6     1       5       10      10      5       1

   In order to find a Print a particular row in question
   eg. row=3 which is [1       2       1]

   Observing the row carefully we notice that the row no. also represents the no. of elements it contains
   like row 5 will also tells us that it contains 5 elements

   it gives us the idea in order to print the elements in a particular row we have to run a loop and with every value of [c] we can obtain a particular value 
                for(int col=1; col<=n; col++) {
                    print(fun nCr(row-1, col-1));
                }
   
   Time complexity will be O(n*r) which the interviewer will not be happy and tell us to optimise it.

    In order to optimise it we have to carefully notice about a particular row 
   eg. row no.-6  =>[1      5          10            10                  5                     1             ]
                    [1    (5)/(1)  (5*4)/(1*2)  (5*4*3)/(1*2*3)  (5*4*3*2)/(1*2*3*4)  (5*4*3*2*1)/(1*2*3*4*5)]
                    overall formaula will look like [ans*(row-col)/col]

    So, we have to create a new fuction which can help us implement this thing
                function PrintRow(int n) {
                    int ans=1;
                    print(ans);
                    for(int i=1; i<=n; i++) {
                        ans = ans*(n-i);
                        ans = ans/i;
                    }
                    return ans;
                }
    TC -> O(n)
    SC -> O(1)
*/