//        输入一行数字到nums数组里
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        String [] strs = str.split(" ");
//        int[] nums =  new int[strs.length];
//        for(int i=0;i<nums.length;i++){
//        nums[i] = Integer.parseInt(strs[i]);
//
//    输入一个二维数组到matrix[][]
//import java.util.Scanner;
//import java.util.Stack;
//public class solution{
//    public static void main(String[] args){
//        System.out.println("二维数组的列数：");
//        Scanner scan=new Scanner(System.in);
//        int r=scan.nextInt();
//        int c=scan.nextInt();
//        int[][]matrix=new int[r][c];
//        scan.nextLine();//用来跳过行列后的回车符
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                matrix[i][j]=scan.nextInt();
//                System.out.print(matrix[i][j]+",");
//            }
//            System.out.println("");
//        }
//    }

//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
//判断数组中是否含有该整数。 
//
// 
//
// 示例: 
//
// 现有矩阵 matrix 如下： 
//
// [
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
// 
//
// 给定 target = 5，返回 true。 
//
// 给定 target = 20，返回 false。 
//
// 
//
// 限制： 
//
// 0 <= n <= 1000 
//
// 0 <= m <= 1000 
//
// 
//
// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/ 
// Related Topics 数组 双指针 
// 👍 139 👎 0

import java.util.Scanner;

public class ErWeiShuZuZhongDeChaZhaoLcof{
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String [] strs = str.split(", ");
        int[][]matrix =new int [1000][1000];
        while(in.hasNextLine()){

        }
        boolean res = solution.findNumberIn2DArray(matrix,5);
        System.out.println(res);
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
static class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if((matrix==null||matrix.length==0)||(matrix.length==1&&matrix[0].length==0))
            return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while(i<=matrix.length-1&&j>=0){
            if(target == matrix[i][j])
                return true;
            else if(target < matrix[i][j]){
                j--;
            }

            else{
                i++;
            }

        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}