/**
 * Created by Administrator on 2014/11/18.
 */
public class Exe {

    public static void main(String arg[]) {
       //1美元加6人民币=2美元
        Currency dollar = new Dollars("dollar", "1");
        Currency rmb = new RMB("rmb", "6");
        dollar.Add(rmb);
        System.out.println("1 dollar"+"+"+"6 RMB"+"="+dollar.getValue()+" dollar");

         //6rmb+1美元=12rmb
        Currency rmb1 = new RMB("rmb1", "6");
        Currency dollar1 = new Dollars("dollar1", "1");
        rmb1.Add(dollar1);
        System.out.println(rmb1.getValue()+"RMB");

        //  1人民币加6卢布=2人民币
        Currency rmb2 = new RMB("rmb2", "1");
        Currency rubles2 = new Rubles("rubles2", "6");
        rmb2.Add(rubles2);
        System.out.println(rmb2.getValue()+"RMB");

        // 36卢布加1美元=72卢布
        Currency rubles3 = new Rubles("rubles3", "36");
        Currency dollar3 = new Dollars("dollar3", "1");
        rubles3.Add(dollar3);
        System.out.println(rubles3.getValue()+"rubles");

    }

}
