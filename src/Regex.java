import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {


    Well well;
    Coin coin;

    //patterns

    Pattern pattern1;
    Pattern pattern2;
    Pattern pattern3;
    Pattern pattern4;
    Pattern pattern5;
    Pattern pattern6;
    Pattern pattern7;
    Pattern pattern8;
    Pattern pattern9;
    Pattern pattern10;
    Pattern pattern11;


    //matchers
    Matcher matcher1;
    Matcher matcher2;
    Matcher matcher3;
    Matcher matcher4;
    Matcher matcher5;
    Matcher matcher6;
    Matcher matcher7;
    Matcher matcher8;
    Matcher matcher9;
    Matcher matcher10;
    Matcher matcher11;
public Regex() {
    well=new Well();
    coin=new Coin();




}




    public void matcher(String input) {
        //buy
        pattern1 = Pattern.compile("\\s*(?i:buy)\\s*\\[?\\s*(\\w+)\\s*\\]?\\s*$");
        //pickup
        pattern2 = Pattern.compile("\\s*(?i:pickup)\\s*\\[?\\s*(\\d+)\\s+(\\d+)\\s*\\]?\\s*$");
        //well
        pattern3 = Pattern.compile("\\s*(?i:well)\\s*$");
        //plant x y
        pattern4 = Pattern.compile("\\s*(?i:plant)\\s*\\[?\\s*(\\d+)\\s+(\\d+)\\s*\\]?\\s*$");
        //work
        pattern5 = Pattern.compile("\\s*(?i:work)\\s*\\[?\\s*(\\w+)\\s*\\]?\\s*$");
        //cage x y
        pattern6 = Pattern.compile("\\s*(?i:cage)\\s*\\[?\\s*(\\d+)\\s+(\\d+)\\s*\\]?\\s*$");
        //turn
        pattern7 = Pattern.compile("\\s*(?i:turn)\\s*\\[?\\s*(\\d+)\\s+\\]?\\s*$");
        //truck load
        pattern8 = Pattern.compile("\\s*(?i:truck)\\s*(?i:load)\\[?\\s*(\\w+)\\s*\\]?\\s*$");
        //truck unload
        pattern9 = Pattern.compile("\\s*(?i:truck)\\s*(?i:unload)\\[?\\s*(\\w+)\\s*\\]?\\s*$");
        //truck go
        pattern10 = Pattern.compile("\\s*(?i:truck)\\s*(?i:go)\\s*$");
        ////exit
        pattern11 = Pattern.compile("\\s*(?i:exit)\\s*$");
//////////////////////////

        if(matcher1.find())
        {


            if((matcher1.group(1).equalsIgnoreCase("cat")))
            {
              Cat.buyCat(coin);

            }
            if((matcher1.group(1).equalsIgnoreCase("buffalo")))
            {
               Buffalo.buyBuffalo(coin);

            }

            if((matcher1.group(1).equalsIgnoreCase("chicken")))
            {
               Chicken.buyChicken(coin);

            }
            if((matcher1.group(1).equalsIgnoreCase("turkey")))
            {

                 Turkey.turkeyBuy(coin);

            }
            if((matcher1.group(1).equalsIgnoreCase("dog")))
            {

                  Dog.dogBuy(coin);

            }





        }
        if(matcher2.find())
        {

            int x_coordinate=Integer.parseInt(matcher2.group(1));
            int y_coordinate=Integer.parseInt(matcher2.group(2));
            for (Commodity commodity :
                    GameFieldStorage.commodityHashSet) {


                if((commodity.getXCoordinate()==x_coordinate)&&(commodity.getYCoordinate()==y_coordinate))
                {

                  //todo

                }


            }






        }

        if(matcher3.find())
        {

          well.getWater();





        }
        if(matcher4.find())
        {

            Grass grass=well.makeGrass();


        }










    }




}
