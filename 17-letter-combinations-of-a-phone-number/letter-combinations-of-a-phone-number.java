class Solution {
    public List<String> letterCombinations(String digits) {
        String[] chars = {""," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();

        if(digits == null || digits.isEmpty()){
            return result;
        }

        backtrack(chars,digits,0,new StringBuilder(),result);
        return result;
    }
    void backtrack(String[] vals,String digits, int index, StringBuilder currentPath, List<String> result){
        if(index == digits.length()){
            result.add(currentPath.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String possibilities = vals[digit];

        for(int i = 0; i < possibilities.length(); i++){
            char letter = possibilities.charAt(i);
            currentPath.append(letter);

            backtrack(vals,digits,index + 1,currentPath,result);
            currentPath.deleteCharAt(currentPath.length() - 1);
        }
    }
}