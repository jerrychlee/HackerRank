
    public class Node{
        int i;
        int j;
        String str;
        Node(String str, int i, int j){
            this.i=i;
            this.j=j;
            this.str = new String(str);    
        }
    }

    public int minimumLength(String text, ArrayList < String > keys) {

        Scanner in = new Scanner(System.in);
        ArrayList<Node> wordsList = new ArrayList<Node>();
        ArrayList < String > keywords = new ArrayList<String>(keys);
            
        int answer = 10000000;
        text += " $";
        for(int i = 0; i < text.length(); i++) {
            String word = "";
            if(i > 0 && text.charAt(i - 1) != ' ')
                continue;
            for(int j = i; j < text.length(); j++) {
                if(text.charAt(j) == ' ') {
                    for(int k=0; k<keywords.size(); k++){
                      if(word.equals(keywords.get(k))){
                        wordsList.add(new Node(word, i, j));
                        break;  
                      }
                    }    
                    word = "";
                    break;
                }
                else {
                    word += text.charAt(j);   
                }
            }
        }

        for(int i=0;i<wordsList.size();i++){
            
            /* debug
            System.out.print(wordsList.get(i).str + " ");
            System.out.print("("+wordsList.get(i).i + ", ");
            System.out.println(wordsList.get(i).j + ")");            
            */
            
            int start = wordsList.get(i).i;
            int end = 0;
            
            keywords = new ArrayList<String>(keys);
            
            for(int j=i;j<wordsList.size();j++){
                
                String curStr = wordsList.get(j).str;
                
                for(int k=0; k<keywords.size(); k++){
                    if(curStr.equals(keywords.get(k))) {
                        keywords.remove(k);
                        end = wordsList.get(j).j;
                    }
                }

                if(keywords.isEmpty()){
                    answer = Math.min(answer, end-start);
                }
                
            }
        }

        if(answer == 10000000)
            answer = -1;

        return answer;
    }

