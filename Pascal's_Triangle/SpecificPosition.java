// Pascal triangle will be look like this:-
//  row no.
//    0                         1
//    1                     1       1
//    2                 1       2       1
//    3             1       3       3       1
//    4         1       4       6       4       1
//    5     1       5       10      10      5       1

// In order to find a particular position in question
// eg. row=3, col=3 which is [3]

// there is a formula for finding particular position through row and col
// function nCr(row-1, col-1) = nCr => n! / r!*(n-r)!
// eg. for 10C2 => (10*9*8)*(7)!  /  (3*2*1)*(7)!
//              => (10*9*8) / (3*2*1)
//              => (10/1) * (9/2) * (8/3)
//              which means that the loop will run till [r] 

/*               function(row, col) {
                   long long res=1;    // --> In order to prevent data overflow
                   for(int i=0; i<r; i++) {
                       res = res*(n-i);
                       res = res/(i+1);
                   }
                   return res;
                 }
*/

// As the orginal parameters to find a particular position in Pascal triangle is function nCr(row-1, col-1);
// so, if we send the parameters then we will be easily able to find the position.