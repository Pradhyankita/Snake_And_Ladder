package com.bridgelabz;

public class snake_ladder {
    static int position=0;
    public enum Option{
        NO_PLAY,SNAKE,LADDER
    }
    static final int NO_PLAY=1;
    static final int SNAKE=2;
    static final int LADDER=3;
    static int dieRoll(){
        int dice =(int) (Math.random() *10)%6+1;
        return dice;
    }
    static int getOption(){
        return (int) (Math.random() *10)%3+1;
    }
    public static void main(String[] args){

        int dieNum=dieRoll();
       int  option=getOption();
       switch(option){
           case SNAKE:
               position-=dieNum;
               break;
           case LADDER:
               position+=dieNum;
               break;
           case NO_PLAY:
               break;
           default:

       }

    }
}
