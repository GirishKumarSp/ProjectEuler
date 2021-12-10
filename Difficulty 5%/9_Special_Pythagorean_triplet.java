// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//     a² + b² = c²
// For example, 3² + 4² = 9 + 16 = 25 = 5².

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.
int sum=1000;
for(int i=1;i<sum/3;i++){
  for(int j=i+1;j<sum/2;j++){
    int k =sum-i-j;
    if (i*i + j*j == k*k) {
      if(i+j+k==1000){
        System.out.printf("%d²+%d²=%d² \n",i, j, k );
        System.out.printf("%d*%d*%d=%d",i, j, k,i*j*k);
      }
    }
  }
}
//Answer
// 200²+375²=425²
// 200*375*425=31875000

//2nd method

// for(int i=1;i<1000;i++){
//     for(int j=i+1;j<1000;j++){
//         for(int k=1;k<1000;k++) {
//              if (i*i + j*j == k*k) {
//                  if(i+j+k==1000){
//                      System.out.printf("%d²+%d²=%d²",i, j, k);
//                      System.out.println();
//                      System.out.printf("%d*%d*%d=%d",i, j, k,i*j*k);
//                   }
//              }
//         }
//     }
// }
