package com.journal.web.romanChange.copy; 
import java.util.Scanner;
/** 
* 
* @ClassName: RomanConverter 
* @Description: TODO
* @author GaoJean
* @date 2018年3月20日 
* 
*/
public class RomanConverter 
{
       public static void main(String[] args)
       { 
           while(true) 
           {
              System.out.println();
              System.out.print("请输入罗马数字(按Q键退出)：");   
              
              Scanner cin = new Scanner(System.in);
              String romanStr = cin.nextLine();
            
              if(romanStr.equals("q") || romanStr.equals("Q"))   //退出循环
              {
                  break;
              }
              Roman roman = null;
              try 
              {
                 roman = new Roman(romanStr);
                 System.out.println("转换后的阿拉伯数字为：" + roman.getNum());
              } 
              catch (RomanException e) 
              {
                  System.out.println(e);
              } 
           }   
           System.out.println("欢迎您再次使用^-^");
        }    
}
