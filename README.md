# Day25-backtracking-Part5

* 491.递增子序列

因为要求子序列，所以没发排序，使用set来进行去重，

  
* 46.全排列

使用used数组去重，backtracking调用次数为O(n!)
  
* 47.全排列 II

要先对数组进行排序

去重逻辑为，如果找到重复的数字，但是前面的数字used为false，那代表前面的数字已经使用过了，那么跳过当前，如果前面为true，那么代表前面的数字正在使用，那么当前数字也要加上作为排序。
