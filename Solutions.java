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

	public static int QuasiPalindrome (int number, int temp, int holder, int numberReverse){
        number = 0;
        temp = 0;
        holder = 0;
        numberReverse = 0;

        Scanner kbd = new Scanner(System.in);
        number = kbd.nextInt();

        temp = number;
        while(number > 0) {
            holder = number % 10;
            numberReverse = (numberReverse *10) + holder;
            number /= 10;
        }
        
        while(temp % 10 == 0){
        	temp /= 10;
        }
        
        if(numberReverse == temp){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public int Fraction(int number, int numerator, int denominator) {

    public static void main(String[] args){
    	Scanner kbd = new Scanner(System.in);
    	
    	number = Integer.parseInt(kbd.nextLine());
    	numerator = (number-1) / 2;
    	denominator = (number+1) / 2;
    	
    	if(numerator + denominator != number){
    		denominator++;
    	}
    	
    	for(int i = 1; i < 9; i++){
    		if(numerator % i == 0 && denominator % i == 0){
    			numerator /= i;
    			denominator /= i;
    		}
    		if(numerator % 2 == 0 && denominator % 2 == 0){
    			numerator--;
    			denominator++;
    		}
    	} 	
    	System.out.println(numerator);
    	System.out.println(denominator);
    }

    public int FairGame(int array[], int com[], int sto, int n, int x) {
        Scanner kbd = new Scanner(System.in);
        array[] = new int[101];
        com[] = new int[100];
        sto = 0;
        n = kbd.nextInt();
        x;

        for (int i = 0; i < n; i++) {
            x = kbd.nextInt();
            if(++array[x]==1){
                com[sto++]=x;
            }
        }
        if (sto == 2 && array[com[0]] == array[com[1]]) {
            System.out.println("YES");
            System.out.println(com[0]+" "+com[1]);


        } else {
            System.out.println("NO");

        }
}

}
