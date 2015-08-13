package cl.eugcom.libros.viewcontroller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import cl.eugcom.libros.model.PeriodoVO;

@ManagedBean
public class IngresoLibroViewController {
	
	//public Integer[] arrYears = {2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015}; 
	public List<Integer> arrYears ; 
	public List<String> arrMeses ; 
	
	private PeriodoVO periodo;
	
	
	private Integer mes;
	private Integer year;
	private Map<String, Integer> mapMeses;
	
	public IngresoLibroViewController(){
		arrYears =  new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		Integer thisYear = cal.get(Calendar.YEAR);
		Integer thisMonth = cal.get(Calendar.MONTH); 
		for (int j=thisYear;j>thisYear-5;j--){
			arrYears.add(new Integer(j));
		}
		cargarMeses();
		periodo = new PeriodoVO();
		periodo.setYear(thisYear);
		periodo.setGlosaMes(arrMeses.get(thisMonth));
		periodo.setMes(thisMonth);
		
		mapMeses = new HashMap<String, Integer>();
		mapMeses.put("Enero", 1);
		mapMeses.put("Febrero", 2);
		mapMeses.put("Marzo", 3);
		mapMeses.put("Abril", 4);
		mapMeses.put("Mayo", 5);
		mapMeses.put("Junio", 6);
		mapMeses.put("Julio", 7);
		mapMeses.put("Agosto", 8);
		mapMeses.put("Septiembre", 9);
		mapMeses.put("Octubre", 10);
		mapMeses.put("Noviembre", 11);
		mapMeses.put("Diciembre", 12);
		cargarMeses();
		//arrMeses =  new ArrayList<String>(Arrays.asList(mapMeses.keySet().toArray()));
		//List<String> aa = Arrays.asList(mapMeses.keySet().toArray());
		//arrMeses =  (List<String>)Arrays.asList(mapMeses.keySet().toArray()); 
		
		
	}
	
	public void cargarMeses()
	{	
		arrMeses =  new ArrayList<String>();

		arrMeses.add("Enero");
	    arrMeses.add("Febrero");
	    arrMeses.add("Marzo");
	    arrMeses.add("Abril");
	    arrMeses.add("Mayo");
	    arrMeses.add("Junio");
	    arrMeses.add("Julio");
	    arrMeses.add("Agosto");
	    arrMeses.add("Septiembre");
	    arrMeses.add("Octubre");
	    arrMeses.add("Noviembre");
	    arrMeses.add("Diciembre");
	}
	
	public List<Integer> getArrYears() {
		return arrYears;
	}
	public void setArrYears(List<Integer> arrYears) {
		this.arrYears = arrYears;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public List<String> getArrMeses() {
		return arrMeses;
	}
	public void setArrMeses(List<String> arrMeses) {
		this.arrMeses = arrMeses;
	}
	public PeriodoVO getPeriodo() {
		return periodo;
	}
	public void setPeriodo(PeriodoVO periodo) {
		this.periodo = periodo;
	}
	
}
