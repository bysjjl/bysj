package org.primefaces.examples.view;  
  
import java.io.Serializable;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  
public class FormBean implements Serializable {  
  
    private List<String> selectedOptions;  
  
    public List<String> getSelectedOptions() {  
        return selectedOptions;  
    }  
    public void setSelectedOptions(List<String> selectedOptions) {  
        this.selectedOptions = selectedOptions;  
    }  
}