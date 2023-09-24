//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int m = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> list =  new ArrayList<>();
        int flag =0;
        int freq[] = new int[100005];
        for(int i=0; i<m; i++)
        {
            freq[arr[i]]++;
        }
        int k = freq.length;
        for(int i=0; i<k; i++)
        {
            if(freq[i] > 1)
            {
                list.add(i);
                flag =1;
            }
        }
        if(flag == 0)
        {
            list.add(-1);
            return list;
        }
        return list;
     
    }
}
