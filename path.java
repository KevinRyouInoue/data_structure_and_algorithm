public static void main(String[] args) {
    int count = 0;                      // step 1: create a new int named count
    count = helper(count);              // step 2: call helper on count
                                        // step 5: assign the returned value to count (still on the line above, but after the function call)
    System.out.println(count);          // step 6: print the value of count
}

public static int helper(int x) {
    x = x + 1;
    return x;
}