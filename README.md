# TDDDemo 

## 为什么要用TDD？


### 程序员的两个基本的技能
>- 1、写测试用例
>- 2、重构

![如何去实施TDD](http://cdn.petal.fun/image/TDD/%E5%A6%82%E4%BD%95%E5%8E%BB%E5%AE%9E%E6%96%BDTDD.jpg)

### 编写一个函数，返回一个给定值max的所有素数组成的数组

public static int[] getPrimes(int max)

任务分解

边界条件
getPrimes(0) getPrimes(-1) getPrimes(2) 应该返回什么

正常输入
getPrimes(9) getPrimes(17) getPrimes(30)

