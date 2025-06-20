public class Main {
    public static void main(String[] args) {

        // 注：String 语法的值需要增加双引号，比如 "123"
        // 注：int 语法的值不需要增加双引号
        // 注：char 语法中不要加入 双引号 和 单引号 否则会报错
        // 注：short 数据类型可以存储从 -32768 到 32767 的整数
        // 注：printIn 输出语法 双引号不要换成单引号会报错
        /*
        byte	1 字节	存储从 -128 到 127 的整数。
        short	2 字节	存储从 -32,768 到 32,767 的整数。
        int	    4 字节	存储从 -2,147,483,648 到 2,147,483,647 的整数。
        long	8 字节	存储从 -9,223,372,036,854,775,808 到 9,223,372,036,854,775,807 的整数。
        float	4 字节	存储小数。足以存储 6 到 7 位十进制数字。
        double	8 字节	存储小数。足以存储 15 位十进制数字。
        boolean	1 比特	存储 true 值或 false 值。
        char	2 字节	存储单个字符/字母或 ASCII 值。
         */


        // 创建一个名为 name1 的 Strings 变量
        String name1 = "123";

        // 设置 int(值)
        int name2 = 123;
        // 高阶语法 int (值)
        int name3;
        name3 = 123;
        // int 加法
        int name4;
        name4 = 456;
        int name5;
        name5 = 789;
        // int 多种相同变量相加
        int name6 = 101112, name7 = 131415, name8 = 161718;
        // 一次性给 int 赋予多个变量
        int name9,name10,name11; name9 = name10 = name11 = 192021;

        // java标识符
        int myName = 60; int m =60;

        // 输出 Strings name1 变量
        System.out.println(name1);
        // 输出 int name2 值
        System.out.println(name2);
        // 输出 高阶语法 int name3 值
        System.out.println(name3);
        // 输出 int 加法
        System.out.println(name4 + name5);
        // 输出 int 多种相同变量相加
        System.out.println(name6 + name7 + name8);
        // 输出 int 多个变量相加
        System.out.println(name9 + name10 + name11);
        // 输出 java 标识符
        System.out.println(m);

        // 定义游戏量
        String gameName = "GameWatch";
        int gameId = 100001;
        float gameMb = 15.5f;
        char gamePacakeage = 8;

        // 请不要把双引号换成单引号否则会报错
        // 请不要把双引号换成单引号否则会报错
        // 请不要把双引号换成单引号否则会报错
        // 请不要把双引号换成单引号否则会报错
        // 请不要把双引号换成单引号否则会报错
        // 请不要把双引号换成单引号否则会报错
        // 请不要把双引号换成单引号否则会报错
        // 请不要把双引号换成单引号否则会报错
        System.out.println("游戏名称:" + gameName);
        System.out.println("游戏ID:" + gameId);
        System.out.println("游戏内存大小:" + gameMb);
        System.out.println("游戏包名:" + gamePacakeage);

        // 高宽
        int length = 123;
        int weight = 456;
        int zong;
        // 不要加入单引号和双引号否则会报错
        zong = length + weight;
        System.out.println("高＋宽 = " + zong);
    }
}