
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao1 {

    public static void main(String[] args) {
        Complexo[] raizX = new Complexo[2];
        Complexo[] raizY = new Complexo[2];
        
        Complexo ax = new Complexo(1, 0);
        Complexo bx = new Complexo(5, 0);
        Complexo cx = new Complexo(4, 0);
        Complexo ay = new Complexo(1, 0);
        Complexo by = new Complexo(2, 0);
        Complexo cy = new Complexo(5, 0);
        
        raizX = raizesEquacao(ax, bx, cx);
        raizY = raizesEquacao(ay, by, cy);
        
        System.out.println("x1=" + raizX[0]);
        System.out.println("x2=" + raizX[1]);
        System.out.println("y1=" + raizY[0]);
        System.out.println("y2=" + raizY[1]);
    }
    
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c){
        Complexo[] result = new Complexo[2];        
        Complexo delta = (b.prod(b)).sub((a.prod(c)).prod(4));
        Complexo[] raizDelta = delta.sqrt();
        
        result[0] = (raizDelta[0].sub(b)).div(a.prod(2));
        result[1] = (raizDelta[1].sub(b)).div(a.prod(2));
        
        return result;
    }
    
}
