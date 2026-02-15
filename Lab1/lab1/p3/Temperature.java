package lab1.p3;

public class Temperature {
    private double value;
    private char scale; 

 
    public Temperature() {                
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value) {   
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {      
        this.value = 0.0;
        this.scale = normalizeScale(scale);
    }

    public Temperature(double value, char scale) { 
        this.value = value;
        this.scale = normalizeScale(scale);
    }

   
    public double getCelsius() {
        if (scale == 'C') return value;
        return 5.0 * (value - 32.0) / 9.0;
    }

   
    public double getFahrenheit() {
        if (scale == 'F') return value;
        return 9.0 * value / 5.0 + 32.0;
    }


    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = normalizeScale(scale);
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = normalizeScale(scale);
    }

  
    public char getScale() {
        return scale;
    }

    private char normalizeScale(char s) {
        s = Character.toUpperCase(s);
        if (s != 'C' && s != 'F') return 'C'; // "graceful" fallback
        return s;
    }

    @Override
    public String toString() {
        return "Temperature{" + value + " " + scale + "}";
    }
}
