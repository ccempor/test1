package com.itheima._08斗地主游戏开发;

import java.util.*;

/*
* 斗地主游戏：
*     (1) 做牌。
*          业务逻辑：斗地主的逻辑 。
*          牌总共有54张。
*          牌分为花色： "♦","♣","♥","♠"
*          牌分为点数： "3","4","5","6","7","8","9","10","J","Q","K","A","2"
*          点数各四张。
*          大小王：    🃏  🤴 各一张
*
*     (2) 洗牌
*          把list集合中的牌打乱顺序。
*
*     (3)定义玩家
*          斗地主有三个玩家，每个玩家都会发牌，最终会剩下3张底牌。
*          乔峰：
*          杨过：
*          小龙女：
*
*     (4)发牌：
*          依次给每个人发牌，总共发出51张，剩余三张作为底牌！
*      --------------------------------------------------
*     (5) 对玩家的牌进行排序：Map集合（拓展）
*
*
*      ---------------------------------------------
*
*     (6)打牌的逻辑：需要通信和复杂的算法逻辑
*
*
* */
public class BitOnwerDemo01 {
    public static void main(String[] args){
        /* 1.做牌 */
        // 1.定义一个集合存储做出来的扑克牌
        List<String> cards = new ArrayList<>();
        // 定义牌的花色
        String[] colors = new String[]{"♦","♣","♥","♠"};
        // 定义点数
        String[] sizes = new String[]{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        // 遍历点数
        for(String ds : sizes){
            // 遍历花色
            for(String hs : colors){
                //  hs + ds : ♦3 ♣3 ♥3 ♠3
                cards.add(hs+ds);
            }
        }
        // 加入大小王
        Collections.addAll(cards, "🃏",  "🤴");
        System.out.println("原牌："+cards);
        //-------------------------------------------------------------------
        /*(2) 洗牌 */
        // 把list集合中的牌打乱顺序。
        Collections.shuffle(cards);
        System.out.println("洗牌后："+cards);
        // -------------------------------------------------------------------
        /* (3)定义玩家 */
        // 定义三个集合代表三个玩家
        List<String> qiaoFeng = new ArrayList<>();
        List<String> yangGuo = new ArrayList<>();
        List<String> xiaoLongNv = new ArrayList<>();
        // ----------------------------------------------------------------------
        /* (4) 发牌 依次给每个人发牌，总共发出51张，剩余三张作为底牌！ */
        // 牌是：cards = [♣3, ♠10, ♠Q, ♦A, ♦Q, ♠7, ♣4, ♥9, ♣5, ....
        //               0    1    2   3   4   5   6   7   8 ....
        //     %  3      0    1    2   0   1   2   0
        for(int i = 0 ; i < cards.size() - 3 ; i++) {
            // 当前牌
            String card = cards.get(i);
            // 这个牌发给谁呢？
            switch (i % 3){
                case 0:
                    // 发给乔峰
                    qiaoFeng.add(card);
                    break;
                case 1:
                    // 发给杨过
                    yangGuo.add(card);
                    break;
                case 2:
                    // 发给小龙女
                    xiaoLongNv.add(card);
                    break;
            }
        }

        /*
        *  (5) 对玩家的牌进行排序：Map集合（拓展）
        *  计算机是无法直接对牌进行排序的，原因是因为不知道大小规则。
        * */
        sortCards(qiaoFeng);       
        sortCards(yangGuo);       
        sortCards(xiaoLongNv);       

        System.out.println("乔峰："+qiaoFeng);
        System.out.println("杨过："+yangGuo);
        System.out.println("小龙女："+xiaoLongNv);
        // 算出底牌，底牌是集合的最后3张牌！
        // 截取集合最后3张牌放到lastThrees集合中去
        List<String> lastThrees = cards.subList(cards.size()-3,cards.size());
        System.out.println("底牌："+lastThrees);
    }

    // 在启动类的时候指定牌的大小规则
    private static Map<String,Integer> daxiaoGuizes = new HashMap<>();
    // daxiaoGuizes = {♦3=0,♣3=0,♥3=0,♠3=0 ,♦4=1,♣4=1,♥4=1,♠4=1 , ... }
    // "♦","♣","♥","♠"
    // "3","4","5","6","7","8","9","10","J","Q","K","A","2"   🤴  🃏
    //  0   1   2   3   4   5   6   7   8    9   10  11  12  13  14
    static{
        // 初始化静态资源的
        // 点数
        String[] colors = new String[]{"♦","♣","♥","♠"};
        // 定义点数
        String[] sizes = new String[]{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(int i = 0 ; i < sizes.length ; i++ ){
            for(String hs : colors){
                // 牌 = 大小
                daxiaoGuizes.put(hs+sizes[i],i);
            }
        }
        daxiaoGuizes.put("🃏",14);
        daxiaoGuizes.put("🤴",13);
    }

    private static void sortCards(List<String> cards) {
        // cards = [♠4, ♠8, ♠K, ♣5, ♣6, ♣7, ♣8 ...
        // 开始对牌进行排序。
        Collections.sort(cards, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1 ♠4
                // o2 ♠K
                return daxiaoGuizes.get(o1) - daxiaoGuizes.get(o2);
            }
        });
    }
}
