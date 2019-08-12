package com.lonewolf.web;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-09 18:15
 * @Description:
 */
public class test {
        static char[] numArr = {'零','一','二','三','四','五','六','七','八','九'};
        static char[] numIntArr = {'0','1','2','3','4','5','6','7','8','9'};
        static String[] unitArr = {"零","十","百","千","万","亿"};

        public static String numToChinese(int num) {
            char[] newNum = String.valueOf(num).toCharArray();
            int len = newNum.length;

            StringBuffer res = new StringBuffer();

            int k = len%4;
            int z = 3;
            if(k!=0){
                z = k-1;
            }
            int m =0;
            int d = (int)Math.ceil((double) len/4)+2;
            for(int i=0;i<len;i++) {
                int c = 0;
                while(numIntArr[c] != newNum[i]){
                    c++;
                }
                if(numIntArr[c]=='0'){
                    m++;
                }else{
                    m=0;
                }

                if((i!=(len-1)&&m<=1)||m==0){
                    res.append(numArr[c]);
                }

                if((len-i-1)%4==0&&i!=(len-1)){
                    //向上取整
                    res.append(unitArr[d]);
                    d--;
                    z=3;
                }else if(z!=0 && numIntArr[c]!='0'){
                    res.append(unitArr[z]);
                    z--;
                }else{
                    z--;
                }

            }

            return res.toString();
        }

        public static void main(String[] args) {
            System.out.print(numToChinese(2036));
            System.out.print("\n");
            System.out.print(numToChinese(46));
            System.out.print("\n");
            System.out.print(numToChinese(360));
            System.out.print("\n");
            System.out.print(numToChinese(18096));
            System.out.print("\n");
            System.out.print(numToChinese(40006));
            System.out.print("\n");
            System.out.print(numToChinese(4023405));
            System.out.print("\n");
            System.out.print(numToChinese(1569840564));
            System.out.print("\n");
            System.out.print(numToChinese(649851));
            System.out.print("\n");
            System.out.print(numToChinese(64390851));
            System.out.print("\n");
        }

}
