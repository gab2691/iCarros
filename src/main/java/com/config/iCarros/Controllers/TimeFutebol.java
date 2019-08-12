package com.config.iCarros.Controllers;


import java.util.ArrayList;
import java.util.List;

public class TimeFutebol {

	private Integer ID;
	private Integer vitoria;
	private Integer empates;
	private Integer total = 0;

	public Integer getVitoria() {
		return vitoria;
	}

	public void setVitoria(Integer vitoria) {
		this.vitoria = vitoria;
	}

	public Integer getEmpates() {
		return empates;
	}

	public void setEmpates(Integer empates) {
		this.empates = empates;
	}


	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}


	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public Integer getChampionPoints(List<TimeFutebol> timeFutebolList){
		Integer result = 0;
		try {
			for (TimeFutebol x : timeFutebolList) {
				x.setTotal(x.getTotal() + (x.getVitoria() * 3) + x.getEmpates());
				if (x.getTotal() > result) {
					result = x.getTotal();
				}
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		List<TimeFutebol>timeFutebolList = new ArrayList<>();
		TimeFutebol timeFutebol = new TimeFutebol();
		timeFutebol.setVitoria(3);
		timeFutebol.setEmpates(1);
		timeFutebol.setID(1);

		timeFutebolList.add(timeFutebol);

		TimeFutebol timeFutebo2 = new TimeFutebol();
		timeFutebo2.setID(2);
		timeFutebo2.setVitoria(3);
		timeFutebo2.setEmpates(3);

		timeFutebolList.add(timeFutebo2);

		System.out.println(timeFutebol.getChampionPoints(timeFutebolList));
	}

}
