package day02;

/**
 *
 * 基本数据类型（primitive type）：
 * 整型
 * 浮点型
 * 表示Unicode编码字符单元的 字符类型char
 * 布尔型
 *
 */

public class VariableStatement {
    public static void main(String[] args){
        /**
         * 整型数据
         * 整型有4种，类型名-占用字节数，byte-1 short-2 int-4 long-8
         * java没有任何无符号类型（unsigned）
         */
        int a = 1;
        int b = 2;
        int c = a + b;
        int d;
        d = 4;
        //带有下划线'_'的数字字面量
        int millions = 1_000_000;
        System.out.println("c=="+c+" d="+d);
        System.out.println("millions = "+millions);

        /**
         * 浮点型
         * float类型，4字节后面要加'F'后缀，精度6~7位有效数字
         * double类型，8字节，15位有效数字
         *
         * java中所有浮点数值计算都遵循IEEE 754规范，溢出的三种表示错误情况的数值
         * 1、正无穷大
         * 2、负无穷大
         * 3、NaN（不是一个数字）
         * 例如：一个正数除以0的结果为正无穷大。计算0/0或者负数的平方根结果为NaN
         *
         * 警告浮点数值不适合适用于禁止出现舍入误差的金融计算中。
         * 例如打印2.0-1.1，得到的结果是0.89999999999，而不是期望的0.9，因为数值在计算机中采用二进制，无法准确表达1/10
         * 如果需要禁止舍入误差的计算，需要使用BigDecimal类。
         */
        float floats = 1.123456F;
        double doub = 1.123456789012345;
        System.out.println("floats = "+floats+" doub = "+doub);

        int condition1 = 1;
        int condition2 = 2;


        




    }
}

/**
 */