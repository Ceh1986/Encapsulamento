package pacote01;

public class carro {
	 
	public class Carro {
	    private String marca;
	    private String modelo;
	    private double velMax = 180;
	    private double velAtual = 0;
	    private boolean estado;
	    private int tanque = 50;
	    
	    public String getMarca() {
	    	return marca;
	    }
	    
	    public String getModelo() {
	    	return modelo;
	    }
	    
	    public boolean getLigarCarro() {
	    	return estado;
	    }
	    
	    
	    public void setMarca(String marca) {
	    	this.marca = marca;
	    }
	    
	    public void setModelo(String modelo) {
	    	this.modelo = modelo;
	    }
	    
	    public void LigarCarro() {
	    	this.estado = true;
	    	System.out.println("Carro Ligado");
	    }
	    
	    public void ligarCarro() {
	    	this.estado = false;
	    	System.out.println("Carro Desligado");
	    }
	 
	    
	    public void ligar() {
	        System.out.println("Ligando...");
	        estado=true;
	        System.out.println("Ligado!");
	        if(estado==true) {
	            System.out.println("Carro Ligado!");
	 
	        }
	    }
	    
	    public void desligar() {
	        System.out.println("Ligando...");
	        estado=false;
	        System.out.println("Ligado!");
	        if(estado==false) {
	            System.out.println("Carro desligado!");
	 
	        }
	    }
	    
	    public void acelerar(double aceleracao) {
	 
	        if(estado==false) {
	            System.out.println("Ligue o carro primeiro!");
	            } else {
	 
	        if(this.velAtual<this.velMax) {
	            this.velAtual+=aceleracao;  
	            System.out.println("Carro acelerado!");
	            System.out.println("Velocidade atual é: "+this.velAtual);
	            if(velAtual>=180) {
	                this.velAtual = velMax;
	                System.out.println("Carro acelerado!");
	                System.out.println("Velocidade atual é: "+this.velAtual);
	                System.out.println("Velocidade Maxima atingida!");
	 
	            }
	            
	        }else {
	            System.out.println("Velocidade atual é: "+this.velAtual);
	            System.out.println("Velocidade Maxima atingida!");
	                        
	        }
	        
	            }
	        
	    }
	        
	        
	    public void frear(double frenagem) {
	        if (estado == false) {
	            System.out.println("Ligue o carro primeiro!");
	        } else {
	            if (velAtual - frenagem >= 0) {
	                velAtual -= frenagem;                
	                System.out.println("Carro freado! Velocidade atual é: " + velAtual);
	            } else {
	                velAtual = 0;
	                System.out.println("Carro parado! Velocidade atual é: " + velAtual);
	            		}
	    
	        	}
	
	    									}
	    
	}
	
}
	            
	     