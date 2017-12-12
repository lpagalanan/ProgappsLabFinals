public class Solutions{

	//submited by David Brackin
	public static int wave(int n, int k, int t){
	    
	    if(t < k){
	        return t;
	    }else if(t < n){
	        return k;
	    }else {
	        return (k + n) - t;
	    }
	    
	}


	public static String div(String n){
	    int zeros = 0;
	    for(int i = n.length()-1; i >= 0; i--){
	        if(n.charAt(i) == '0'){
	            zeros++;
	        }
	        if(zeros >= 6 && n.charAt(i) == '1'){
	            return "yes";
	        }
	    }
	    return "no";
	}

	public static String broken(String n){
	    String[] friends = {"Danil", "Olya", "Slava", "Ann","Nikita"};
	    int count = 0;
	    int last;
	    for(int i = 0; i < friends.length; i++){
	        last = 0;
	        while( last != -1 ){
	            last = n.indexOf(friends[i],last);
	            
	            if(last != -1){
	                count++;
	                last += friends[i].length();
	            }
	        }
	    }
	    return count == 1? "YES":"NO";
	}

	//Submitted by Lawrence Christian Pagalanan
	public static int lazySecurityGuard(int num){
	    return 2*((int)Math.ceil(2*Math.sqrt(num)));
	}
	
    public static void mergeSort(int n, int k) {
        if(k%2==0 || k>=2*n){
            System.out.println("-1");
        }else{
            if(n==1){
                System.out.println("1");
            }else{
                int []array=new int[n];
                merge(0,n,k,array,1);
                System.out.print(array[0]);
                for (int i =1; i <n; i++) {
                    System.out.print(" "+array[i]);
                }
            }
        }
    }

    public static void merge(int start,int end,int k,int[]a,int num){
        if(k==1){
            for (int i =start; i <end; i++) {
                a[i]=num;
                num++;
            }
        }
        else{
            if(k>1 && start<end){
                k--;
                int temp1=k/2;
                int temp2=k-temp1;
                if(temp1%2==0){
                    temp1--;
                    temp2++;
                }
                int middle=(start+end)/2;
                merge(middle,end,temp2,a,num);
                merge(start,middle,temp1,a,num+end-middle);
            }
        }
    }
	
    public static int kayaking(int n) {
        Scanner sc = new Scanner(System.in);
        int w[]=new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            w[i]=sc.nextInt();
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<2*n;i++)
        {
            for(int j=i+1;j<2*n;j++)
            {
                int k=0;
                int arr[]=new int[2*n-2];
                for(int h=0;h<2*n;h++)
                {
                    if(h!=i&&h!=j){
                        arr[k++]=w[h];
                    }
                }
                Arrays.sort(arr);
                int sum=0;
                for(int h=0;h<2*n-2;h+=2)
                {
                    sum=sum+Math.abs(arr[h+1]-arr[h]);
                }

                if(sum<ans){
                    ans=sum;
                }
            }
        }
        return ans;
    }
}
