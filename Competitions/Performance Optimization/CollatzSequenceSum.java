    
	static int collatzSequenceLen(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return 1 + collatzSequenceLen(n/2);
        }
        
        return 1 + collatzSequenceLen(3*n+1);
 
    }

    static int collatzSequenceSum(int T, int A, int B) {
        int n = 0;
        int result = 0;

        //Map map = new HashMap();
        int [][] key = new int[1000][16];
            
        while (--T>=0) {
            n = (A*n+B) % 5003;
            int best_len = 0;
            int best_num = 0;
            for (int k = 0; k <= n; ++k) {
                int cur_len = 0;
                if(key[k%1000][k/1000]!=0)
                    cur_len = key[k%1000][k/1000];
                else{
                    cur_len = collatzSequenceLen(k);
                    key[k%1000][k/1000]=cur_len;
                }
                    
                if (cur_len >= best_len) {
                    best_len = cur_len;
                    best_num = k;
                }
            }
            result += best_num;
        }
        return result;
    }