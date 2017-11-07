int castleTowers(int n, vector <int> ar) {
        
        int max = 0;
        int count = 0;
    
        for(int i = 0; i < ar.size(); i++) {
              if(ar[i] > max) {
                max = ar[i];
                count = 1;  
              } else if(ar[i]==max){
                    count++;  
              }
        }

        return count;
}
