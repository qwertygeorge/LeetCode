package leetcode;


/**
 * 二维数组
 */
public class LeetCode6_1 {
    public static void main(String args[]){
        System.out.println(convert("PAYPALISHIRING",3));
    }
    public static String convert(String s, int numRows) {
        if(s.isEmpty()){
            return s;
        }
        char[] sc= s.toCharArray();
        char[][] result = new char[numRows][s.length()/2+1];
        int flag = 0;
        int row = 0;
        int col = 0;
        result[0][0] = sc[0];
        for(int i = 1 ; i < s.length() ;i++){
            if(flag == 0){//向下
                row++;
                result[row][col] = sc[i];
            }else{//向右上
                row--;
                col++;
                result[row][col] = sc[i];
            }
            if(row == 0){
                flag = 0;
            }else if(row == numRows-1){
                flag = 1;
            }
        }
        int count = 0;
        for(int i = 0 ; i < numRows ;i++){
            for(int j = 0 ; j < s.length()/2+1; j++){
                if(result[i][j]!='\0'){
                    sc[count++] = result[i][j];
                }
            }
        }
        return String.valueOf(sc);
    }
}
