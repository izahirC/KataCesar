package cenfotec.katas.ec;


	public class EncriptaCesar {
	    private String alfabeto;
	    private String alfabetoCambiado;
	    private int clave;

	    public EncriptaCesar() {
	        clave = 0;
	        alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        alfabetoCambiado = alfabeto.substring(0) +
	                            alfabeto.substring(0,0);
	        alfabeto = alfabeto + alfabeto.toLowerCase();
	        alfabetoCambiado = alfabetoCambiado + alfabetoCambiado.toLowerCase();
	    }
	    
	    public EncriptaCesar(int laLlave) {
	        clave = laLlave;
	        alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        alfabetoCambiado = alfabeto.substring(laLlave) +
	                            alfabeto.substring(0,laLlave);
	        alfabeto = alfabeto + alfabeto.toLowerCase();
	        alfabetoCambiado = alfabetoCambiado + alfabetoCambiado.toLowerCase();
	    }
	    
	    private char transformarLetra(char c, String de, String para) {
	        int idx = de.indexOf(c);
	        if (idx != -1) {
	            return para.charAt(idx);
	        }
	        return c;
	    }
	    
	    public char encriptarLetra(char c) {
	        return transformarLetra(c, alfabeto, alfabetoCambiado);
	    }
	    
	    public char decifrarLetra(char c) {
	        return transformarLetra(c, alfabetoCambiado, alfabeto);
	    }
	    
	    private String transformar(String entrada, String from, String to){
	        StringBuilder sb = new StringBuilder(entrada);
	        for (int i = 0; i < sb.length(); i++) {
	            char c = sb.charAt(i);
	            c = transformarLetra(c, from, to);
	            sb.setCharAt(i, c);
	        }
	        return sb.toString();
	    }
	    
	    public String encriptar(String entrada) {
	        return transformar(entrada, alfabeto, alfabetoCambiado);
	    }
	    
	    public String decifrar(String entrada) {
	        return transformar(entrada, alfabetoCambiado, alfabeto);
	    }
	    
	    public String toString() {
	        return "" + clave;
	    }
	
	} 
