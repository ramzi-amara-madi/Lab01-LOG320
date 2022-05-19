package Labo;

public class RechercheTableau {
	
	// Ne pas changer ces fonctions, elles seront utilisées pour tester votre programme
    // Elles peuvent cependant servir seulement d'interface et utiliser une méthode "helper" 
    // avec des paramètres supplémentaires, au besoin. 
    public int RechercheLineaire(int[] tab, int n, int x){
        for(int i = 0; i < tab.length; i++) {
        	if(tab[i] == x)
        		return i;
        }
    	return -1;
    }

    public int RechercheBinaire(int[] tab, int n, int val){
        return -1;
    }
    
    public int RechercheBinaireHelper(int[] tab, int min, int max, int val){
        if(min > max)
        	return -1;
    	
    	int mid = min + (min + max) / 2;
    	
    	if(tab[mid] == val) {
    		return mid;
    	}
    	else if(val < tab[mid])
    		RechercheBinaireHelper(tab, min, mid - 1, val);
    	else
    		return RechercheBinaireHelper(tab, mid + 1, max, val);
        
    	return -1;
    }

    public int RechercheBinaireModifie(int[] tab, int n, int val){
        return -1;
    }
    
    public int RechercheBinaireModifieHelper(int[] tab, int min, int max, int val){
        int mid1 = min + (max - min) / 3;
        int mid2 = max - (max - min) / 3;
        
        if(max < min)
        	return -1;
        
        if(val == tab[mid1])
        	return mid1;
        
        if(val == tab[mid2])
        	return mid2;
        
        if(val < tab[mid1])
        	return RechercheBinaireModifieHelper(tab, min, mid1 - 1, val);
        else if(val > tab[mid1])
        	return RechercheBinaireModifieHelper(tab, mid2 + 1, max, val);
        else
        	return RechercheBinaireModifieHelper(tab, mid1 + 1, mid2 - 1, val);
    }


}
