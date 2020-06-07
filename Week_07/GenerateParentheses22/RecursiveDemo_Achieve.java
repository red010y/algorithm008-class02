package GenerateParentheses22;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路
 * 合法条件：
 * 左括号随时可加，只要不超标
 * 右括号前面必须有左括号，左括号数>右括号
 *
 *
 * 如果左，右括号都达到了要求，就添加
 * 如果左括号小于要求，就不断的递归加左括号
 * 如果左括号大于右括号，就不断的递归加右括号
 * 这样会把每种情况都考虑到
 */
public class RecursiveDemo_Achieve {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        recursive(0,0,n,result,"");
        return result;
    }

    private void recursive(int l, int r, int n, ArrayList<String> result, String s) {
        if (s.length()==2*n){
            result.add(s);
            return;
        }
        if (l<n)recursive(l+1,r,n,result,s+"(");
        if (l>r)recursive(l,r+1,n,result,s+")");
    }

}
