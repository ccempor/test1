package 陈乐.test3;

import java.util.*;

public class Test4 {
        public static Map<String,Integer> card = new HashMap<>();
        static {
            String[] color = {"黑桃", "红桃", "梅花", "方块"};
            String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < color.length; j++) {
                    card.put(color[j] + num[i], i);
                }
            }
            card.put("大王", 60);
            card.put("小王", 59);
        }
    public static void main(String[] args) {

        Set<String> cardSet = card.keySet();
        List<String> cardList = new ArrayList<>();
        cardList.addAll(cardSet);

        Collections.shuffle(cardList);

        List<String> qiaoFeng = new ArrayList<>();
        List<String> yangGuo = new ArrayList<>();
        List<String> xiaoLongNv = new ArrayList<>();
        List<String> diPai = new ArrayList<>();

        for (int i = 0; i < cardList.size(); i++) {
            String sentedCard = cardList.get(i);
            if (i > 50){
                diPai.add(sentedCard);
            }else {
                switch (i % 3){
                    case 0:
                        qiaoFeng.add(sentedCard);
                        break;
                    case 1:
                        yangGuo.add(sentedCard);
                        break;
                    case 2:
                        xiaoLongNv.add(sentedCard);
                        break;
                }

            }

        }
        sortCard(qiaoFeng);
        sortCard(yangGuo);
        sortCard(xiaoLongNv);
        System.out.println("乔峰："+qiaoFeng);
        System.out.println("杨过："+yangGuo);
        System.out.println("小龙女："+xiaoLongNv);
        System.out.println("底牌："+diPai);


    }

    public static void sortCard(List<String> list){
        Collections.sort(list, new Comparator<String>() {   // 采用匿名内部类的方法来使用比较器,并重写比较规则
            @Override
            public int compare(String o1, String o2) {
                return card.get(o1) - card.get(o2);
            }
        });
    }
}
