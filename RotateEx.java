import java.util.Arrays;

class RotatedM{
    public static void RotatedMatrix(int arr[][]){
//Transpose the 2D Array
        int n=arr.length;
        int m= arr[0].length;
        for(int i=0; i< m; i++){
            for(int j=i; j<n; j++){
// Ham yaha j ko i se isliye start kar rahe hain taki jo element pehle hi swap ho chuka hai,
// usko dobara swap na karna pade. Example ke liye, jab i = 0 hoga, tab j loop 5 baar chalega.
// Jab i = 0 aur j = 0 hoga, to a[i][j] aur a[j][i] swap honge. Lekin yaha i aur j dono 0 hain,
// isliye pehla element (1) wahi rahega. Jab j ka value 1 ho jayega, to i = 0 hi rahega lekin
// j = 1 ho jayega, aur a[0][1] swap hoga a[1][0] ke sath. Isse 2 aur 4 swap honge ->
// {1,4,3} {2,5,6} {7,8,9}. Jab j = 2 ho jayega, to 3 aur 7 ke beech swap hoga.
// Jab i ka value 1 ho jayega, agar hum j ko firse 0 se shuru karte, to a[0][1] aur
// a[1][0] ko dubara swap karna padta, jo pehle hi ho chuka hai. Isliye hum j ko i se shuru karte hain,
// yaani j = i se.
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;


            }
        }
        //To swap left and right side element
        for(int i=0;i<m;i++){
            int leftIndex=0;
            int rightIndex=n-1;

            while(leftIndex<rightIndex){
                int temp=arr[i][leftIndex];
                arr[i][leftIndex]=arr[i][rightIndex];
                arr[i][rightIndex]=temp;
                leftIndex++;
                rightIndex--;
            }
        }
    }
}

public class RotateEx {
    public static void main(String[] args) {

        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        RotatedM.RotatedMatrix(arr);


        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}
