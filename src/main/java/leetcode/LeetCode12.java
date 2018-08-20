package leetcode;

public class LeetCode12 {
    public static void main(String args[]) {
        System.out.println(intToRoman(2689));
    }

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        String[] one = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] ten = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundred = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousand = new String[]{"","M","MM","MMM"};
        result.append(thousand[num/1000]).append(hundred[num%1000/100]).append(ten[num%100/10]).append(one[num%10]);
        return result.toString();
    }

    /**
     * 这个方法比较有算法的想法 但是也就那样
     */
    public String intToCharacter(int n,int i){//n表示特定的输入，i表示个位十位百位或者千位
        String str1,str2,str3;//拿0~9之间的数举例，str1表示I，str2表示V，str3表示X
        String str="";//这个函数返回特定位上的罗马数字表示形式
        if(1==i){            //下面if语句是判断n是哪一位上的,依次用罗马数字表示1、5、10
            str1="I";        //个位上的数
            str2="V";
            str3="X";
        }
        else if(2==i){
            str1="X";       //十位上的数
            str2="L";
            str3="C";
        }else if(3==i){
            str1="C";       //百位上的数
            str2="D";
            str3="M";
        }else{
            str1="M";     //千位上的数，因为最大数到3999，所以str2和str3为空
            str2="";
            str3="";
        }
        switch(n){         //switch对各数字进行组合以个位上的数举例如下
            case 0:break;           //空
            case 1:str+=str1;break;    //I
            case 2:str+=str1+str1;break;  //II
            case 3:str+=str1+str1+str1;;break;//III
            case 4:str+=str1+str2;break;     //IV
            case 5:str+=str2;break;           //V
            case 6:str+=str2+str1;break;      //VI
            case 7:str+=str2+str1+str1;break;    //VII
            case 8:str+=str2+str1+str1+str1;break;    //VIII
            case 9:str+=str1+str3;break;          //IX
        }
        return str;
    }

    /**
     * 挺好的解法
     */
    String intToRoman3(int num) {
        if(num <= 0) return "";
        String ret = "";
        int[]  number = new int[]{1000, 900, 500, 400, 100,90, 50, 40, 10, 9, 5, 4, 1};
        String[]  flags= new String[]{"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i = 0; i < 13 && num > 0; i++){
            if(num < number[i]) continue;
            // cout<< i << " " << number[i] << " - " <<flags[i] << endl;
            while(num >= number[i]){
                num-= number[i];
                ret += flags[i];
            }

        }
        return ret;
    }
}
