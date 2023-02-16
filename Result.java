
class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
    
    int left = p/2;
    
    int right = n%2==0? ((n+1)-p)/2 :(n-p)/2;
    
    if (left<=right){
        return left;
    }else{
        return right;
        //6 5 1
    }
    }

}
