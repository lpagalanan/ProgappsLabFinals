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



}
