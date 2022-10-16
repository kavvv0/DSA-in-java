import java.util.*;
public class duplicate {
    public static int dupliCate(int a[], int n){

if(n==0||n==1){
    return n;
}
int [] temp = new int[n];
int j=0;
for(int i=0;i<n-1;i++){
    if(a[i]!=a[i+1]){
    temp[j]= a[i];
    j++;
    }
}
temp[j++]= a[n-1];
for (int i = 0; i < j; i++) {
    a[i] = temp[i];
}

return j;
    }
public static void main(String[] args) {
    int a[] = { 1, 1, 2, 2, 2 };
        int n = a.length;
  
        n = dupliCate(a, n);
  
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
}
    
}