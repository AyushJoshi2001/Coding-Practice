class Reverse
{
  
    public static void reverseArray(int arr[])
    {
        int n = arr.length;
        // Reverse the Array
        for(int i=0; i<=n/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}
