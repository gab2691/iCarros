package com.config.iCarros.Controllers;

import java.util.ArrayList;
import java.util.List;

public class CountCreepyMoments {

    private String momento;
    private Integer resultado = 0;

    public CountCreepyMoments(String momento){
        this.momento = momento;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    public static Integer countCreepyMoments(List<CountCreepyMoments> countCreepyMoments ){
        Integer result = 0;
        for (CountCreepyMoments x : countCreepyMoments){
            try {

                //AB:AB
                if (x.momento.toCharArray()[0] == x.momento.toCharArray()[3] && x.momento.toCharArray()[1] == x.momento.toCharArray()[4] &&
                        x.momento.toCharArray()[1] != x.momento.toCharArray()[3]) {
                    result += x.resultado = 1;
                }

                //AA:BB && AA:AA
                if (x.momento.toCharArray()[0] == x.momento.toCharArray()[1] && x.momento.toCharArray()[3] == x.momento.toCharArray()[4] ||
                        x.momento.toCharArray()[0] == x.momento.toCharArray()[1] && x.momento.toCharArray()[0] == x.momento.toCharArray()[1]) {
                    result += x.resultado = 1;
                }

                //AB:BA
                if (x.momento.toCharArray()[0] == x.momento.toCharArray()[4] && x.momento.toCharArray()[2] == x.momento.toCharArray()[3]) {
                    result = x.resultado = 1;
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }

        }
        return result;
    }


    public static void main(String[] args) {
        ArrayList<CountCreepyMoments> countCreepyMomentsArrayList = new ArrayList<>();
        countCreepyMomentsArrayList.add(new CountCreepyMoments("11:11"));
        countCreepyMomentsArrayList.add(new CountCreepyMoments("13:13"));
        countCreepyMomentsArrayList.add(new CountCreepyMoments("14:10"));
        countCreepyMomentsArrayList.add(new CountCreepyMoments("12:34"));
        countCreepyMomentsArrayList.add(new CountCreepyMoments("10:10"));
        System.out.println(CountCreepyMoments.countCreepyMoments(countCreepyMomentsArrayList));
    }

}
