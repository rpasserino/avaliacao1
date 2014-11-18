package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Complexo {
    private double real;
    private double img;

    public Complexo() {
    }

    public Complexo(double real, double img) {
        this.real= real;
        this.img = img;
    }

    public double getReal(){
        return real;
    }

    public double getImg(){
        return img;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }
    
    public Complexo sub(Complexo c){
        return new Complexo(real - c.real, img - c.img);
    }

    public Complexo prod(double n){
        return new Complexo(real*n,img*n);
    }

    public Complexo prod(Complexo c){
        return new Complexo(real*c.real - img*c.img, img - c.img);
    }
    
    public  Complexo div(Complexo c){
        return new Complexo((real*c.real+img*c.img)/(c.real*c.real+c.img*c.img),(c.real*img-real*c.img)/(c.real*c.real+c.img*c.img));
    }
    
    // implementar sqrt()
    public Complexo[] sqrt() {
        Complexo[] raiz = new Complexo[2];
        double r1,r2,rd=0, p=(Math.sqrt(real*real+img*img));
        if(real>0)
            rd=Math.atan(img/real);
        else if(real<0)
            rd=Math.atan(img/real)+Math.PI;        
        else if(real==0 && img==0)
            rd=0;
        else if(real==0 &&img>0)
            rd=Math.PI/2;
        else if(real==0 && img<0)
            rd=3*Math.PI/2;
        r1=rd/2;
        r2=rd/2+Math.PI;
        raiz[0] = new Complexo(p*Math.cos(r1), p*Math.sin(r1));
        raiz[1] = new Complexo(p*Math.cos(r2), p*Math.sin(r2));
        return raiz;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
            && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }

    private double sqrt(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
