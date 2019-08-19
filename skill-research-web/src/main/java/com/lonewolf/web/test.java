package com.lonewolf.web;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-09 18:15
 * @Description:
 */
public class test {

        /**
         * 中文计数
         */
        static char[] numArr = {'零','一','二','三','四','五','六','七','八','九'};
        /**
         * 阿拉伯数字
         */
        static char[] numIntArr = {'0','1','2','3','4','5','6','7','8','9'};
        /**
         * 数位
         */
        static String[] unitArr = {"","十","百","千","万","亿"};

        public static String numToChinese(int num) {
            char[] newNum = String.valueOf(num).toCharArray();
            int len = newNum.length;

            StringBuffer res = new StringBuffer();

            //以千为轮回坐标，计算轮回次数向上取整，计算数字最高数位下标
            int d = (int)Math.ceil((double) len/4)+2;
            //以千为轮回，取余数字最高数位的数字数量
            int k = len%4;
            //轮巡次数为整数，从千位取值，否则从实际取数位值
            int z = 0 == k ? 3 : k-1;
            //记录0连续出现的次数
            int m =0;

            //以千为轮回，轮回读取
            for (int j = 0; j < d; j++) {

                for (int i = 1; i < k; i++) {
                    
                }
                k = 4;
            }
            

            for(int i=0;i<len;i++) {
                int c = 0;
                //对比入参数字与给定数字，获取下标位置
                while(numIntArr[c] != newNum[i]){
                    c++;
                }

                





                //判断0连续出现次数
                m = '0' == numIntArr[c]? m+1 : 0;

                //位数为0或者连续零不读写，其他情况读数（读入参数）
                boolean flag = (i<=(len-1)&&m<=1 ) || m==0 ;
                if(flag){
                    res.append(numArr[c]);
                }

                //（为数字加上数位）
                // 以千为轮回，取余为0时，加上轮回数位
                if((len-i-1)%4==0&&i!=(len-1)){
                    //向上取整
                    res.append(unitArr[d]);
                    d--;
                    z=3;
                } else if(numIntArr[c]=='0'){
                    //数字0后，不加数位值
                    z--;
                }else{
                    res.append(unitArr[z]);
                    z--;
                }

            }

            return res.toString();
        }

        public static void main(String[] args) {
            System.out.print(numToChinese(0));
            System.out.print("\n");
            System.out.print(numToChinese(6));
            System.out.print("\n");
            System.out.print(numToChinese(46));
            System.out.print("\n");
            System.out.print(numToChinese(360));
            System.out.print("\n");
            System.out.print(numToChinese(2036));
            System.out.print("\n");
            System.out.print(numToChinese(18096));
            System.out.print("\n");
            System.out.print(numToChinese(400060));
            System.out.print("\n");
            System.out.print(numToChinese(4003405));
            System.out.print("\n");
            System.out.print(numToChinese(15698405));
            System.out.print("\n");
            System.out.print(numToChinese(649851609));
            System.out.print("\n");
            System.out.print(numToChinese(1439080051));
            System.out.print("\n");
            System.out.print(numToChinese(1439080000));
            System.out.print("\n");
        }

}
