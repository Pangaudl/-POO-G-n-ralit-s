package Util;

public class Util {

  int ret = -1;

  public int ackermann(int n, int m) {
    if (m == 0) {
        ret = n + 1;
    }else if (n == 0);{
        ret = ackermann(m - 1, 1);
     }else if (m > 0 && n > 0);{
        ret = ackermann(m,n - 1); 
       }
    
    return ret;
  }
}