/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms.ehu.es.model;

/**
 *
 * @author paula.carracedorebor
 */
public class Params {
    
    private String inputFile;
    private String outputFolder;

    private double temp;
    private double time;
    private double load;
	
    private double minTemp;
    private double maxTemp;
    private double stepTemp;
	
    private double minTime;
    private double maxTime;
    private double stepTime;
	
    private double minLoad;
    private double maxLoad;
    private double stepLoad;
	
    private double quiral;
    private boolean scanVars;
    private boolean scanSol;
    private boolean scanCat;
    private boolean scanNuc;
    private boolean scanSub;
	
    private boolean predict;
	
    private String idReaction;
    private String contentProd;
    private String contentSubs;
    private String contentCat;
    private String contentSolv;
    private String contentNuc;
	
	public double getTemp() {
		return temp;
	}
	
	public Params(String inputFile, String outputFolder,double temp, double time, double load, double minTemp, double maxTemp, double stepTemp, double minTime, double maxTime, 
               double stepTime, double minLoad, double maxLoad, double stepLoad, double quiral, boolean scanVars, boolean scanSol, boolean scanCat, boolean scanNuc, boolean scanSub, 
               boolean predict, String idReaction, String contentProd, String contentSubs, String contentCat, String contentSolv, String contentNuc)
        {
            this.inputFile = inputFile;
            this.outputFolder = outputFolder;
            this.temp = temp;
            this.time = time;
            this.load = load;
            
            this.minTemp = minTemp;
            this.maxTemp = maxTemp;
            this.stepTemp = stepTemp;
            
            this.minTime = minTime;
            this.maxTime = maxTime;
            this.stepTime = stepTime;
            
            this.minLoad = minLoad;
            this.maxLoad = maxLoad;
            this.stepLoad = stepLoad;
            
            this.quiral = quiral;
            this.scanVars = scanVars;
            this.scanSol = scanSol;
            this.scanCat = scanCat;
            this.scanSub = scanSub;
            
            this.predict = predict;
            this.idReaction = idReaction;
            this.contentProd = contentProd;
            this.contentSubs = contentSubs;
            this.contentCat = contentCat;
            this.contentSolv = contentSolv;
            this.contentNuc = contentNuc;
        }
        
	public Params()
	{
		this.time = 0.5;
		this.temp = 70;
		this.load = 2;
		
		this.maxTemp = 70;
		this.minTemp = -78;
		this.stepTemp = 20;
		
		this.maxTime = 72;
		this.minTime = 0.5;
		this.stepTime = 5;
		
		this.maxLoad = 5;
		this.minLoad = 2;
		this.stepLoad = 1;
	}
        
    public String getInputFile() {
	return inputFile;
    }

    public void setInputFile(String inputFile) {
    	this.inputFile = inputFile;
    }
	
    public String getOutputFolder() {
	return outputFolder;
    }

      public void setOutputFolder(String outputFolder) {
    	this.outputFolder = outputFolder;
        }

  	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getTime() {
		return time;
	}
	
	
	public void setTime(double time) {
		this.time = time;
	}
	public double getLoad() {
		return load;
	}
	
	
	public void setLoad(double load) {
		this.load = load;
	}
	
	
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	
	
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	
	public double getStepTemp() {
		return stepTemp;
	}
	public void setStepTemp(double stepTemp) {
		this.stepTemp = stepTemp;
	}
	
	
	public double getMinTime() {
		return minTime;
	}
	public void setMinTime(double minTime) {
		this.minTime = minTime;
	}
	
	
	public double getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(double maxTime) {
		this.maxTime = maxTime;
	}
	
	
	public double getStepTime() {
		return stepTime;
	}
	public void setStepTime(double stepTime) {
		this.stepTime = stepTime;
	}
	
	
	public double getMinLoad() {
		return minLoad;
	}
	public void setMinLoad(double minLoad) {
		this.minLoad = minLoad;
	}
	
	
	public double getMaxLoad() {
		return maxLoad;
	}
	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}
	
	
	public double getStepLoad() {
		return stepLoad;
	}
	public void setStepLoad(double stepLoad) {
		this.stepLoad = stepLoad;
	}
	
	
	public double getQuiral() {
		return quiral;
	}
	public void setQuiral(double quiral) {
		this.quiral = quiral;
	}	
		
	public boolean isScanVars() {
		return scanVars;
	}


	public void setScanVars(boolean scanVars) {
		this.scanVars = scanVars;
	}


	public boolean isScanSol() {
		return scanSol;
	}


	public void setScanSol(boolean scanSol) {
		this.scanSol = scanSol;
	}


	public boolean isScanCat() {
		return scanCat;
	}


	public void setScanCat(boolean scanCat) {
		this.scanCat = scanCat;
	}


	public boolean isScanNuc() {
		return scanNuc;
	}


	public void setScanNuc(boolean scanNuc) {
		this.scanNuc = scanNuc;
	}


	public boolean isScanSub() {
		return scanSub;
	}


	public void setScanSub(boolean scanSub) {
		this.scanSub = scanSub;
	}


	public String getIdReaction() {
		return idReaction;
	}

	public void setIdReaction(String idReaction) {
		this.idReaction = idReaction;
	}


	public String getContentProd() {
		return contentProd;
	}
	public void setContentProd(String contentProd) {
		this.contentProd = contentProd;
	}
	
	
	public String getContentSubs() {
		return contentSubs;
	}
	public void setContentSubs(String contentSubs) {
		this.contentSubs = contentSubs;
	}
	
	
	public String getContentCat() {
		return contentCat;
	}
	public void setContentCat(String contentCat) {
		this.contentCat = contentCat;
	}
	
	
	public String getContentSolv() {
		return contentSolv;
	}
	public void setContentSolv(String contentSolv) {
		this.contentSolv = contentSolv;
	}
	
	
	public String getContentNuc() {
		return contentNuc;
	}
	public void setContentNuc(String contentNuc) {
		this.contentNuc = contentNuc;
	}


	public boolean isPredict() {
		return predict;
	}


	public void setPredict(boolean predict) {
		this.predict = predict;
	}
	
	
    
}
