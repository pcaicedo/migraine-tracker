package hello;

import java.util.HashMap;
import java.util.List;

public class Diary {
	private long chartnum;	//Unique diary identifier
	private List<String> month;	//January..December
	private int day;	//1..31
	private String headache;	//0= headache free, 1=mild, 2=moderate, 3=severe
	private String Aura;	//V = visual, S= sensory, M=motor, C = cognitive or speech, Ve = vesVbular
	private String period;	//Menstruation day
	private String lifestyle;	//E=exercise, S=sleep routine, M=meditaVon. R=relaxation. Any code you choose is good.
	private String[] treatment;	//You may use initials (Z=zomig, N=naproxen...)
	private String effectiveness;	//F=faillure, P=partial benefit, S=success, R=recurrence (pain comes back the same day). E = side effects.
	private HashMap<String, String> stableprev;	//Medicine name and doses
	private HashMap<String, String> newprev;	//Medicine name and doses
	private String notes;	//To tack anything else
	
	public long getChartnum() {
		return chartnum;
	}
	public void setChartnum(long chartnum) {
		this.chartnum = chartnum;
	}
	public List<String> getMonth() {
		return month;
	}
	public void setMonth(List<String> month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getHeadache() {
		return headache;
	}
	public void setHeadache(String headache) {
		this.headache = headache;
	}
	public String getAura() {
		return Aura;
	}
	public void setAura(String aura) {
		Aura = aura;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getLifestyle() {
		return lifestyle;
	}
	public void setLifestyle(String lifestyle) {
		this.lifestyle = lifestyle;
	}
	public String[] getTreatment() {
		return treatment;
	}
	public void setTreatment(String[] treatment) {
		this.treatment = treatment;
	}
	public String getEffectiveness() {
		return effectiveness;
	}
	public void setEffectiveness(String effectiveness) {
		this.effectiveness = effectiveness;
	}
	public HashMap<String, String> getStableprev() {
		return stableprev;
	}
	public void setStableprev(HashMap<String, String> stableprev) {
		this.stableprev = stableprev;
	}
	public HashMap<String, String> getNewprev() {
		return newprev;
	}
	public void setNewprev(HashMap<String, String> newprev) {
		this.newprev = newprev;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
