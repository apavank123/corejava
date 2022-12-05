class CountGivenNu {
 
    static int countDigit(long n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
    public static void main(String[] args)
    {
        long n = 3452894;
        System.out.print("Number of digits : "
                         + countDigit(n));
    }
}