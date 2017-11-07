    static boolean isAnagram(String a, String b) {
        // Complete the function
        HashMap map = new HashMap();
        for(int i=0; i<a.length();i++){
            char c = Character.toLowerCase(a.charAt(i));
            Object o = map.get(c);
            map.put(c, (o!=null)?(int)o+1:1);
        }
        
        for(int j=0; j<b.length();j++){
            char c = Character.toLowerCase(b.charAt(j));
            Object o = map.get(c);
            if(o==null)
                return false;
            if((int)o-1>0){
                map.put(c, (Object)((int)o-1));                            
            }else{
                map.remove(c);            
            }
        }
        
        //debug
        //System.out.println(map.toString());
        if(map.isEmpty())
            return true;
        
        return false;
    }