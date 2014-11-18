
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
        Complexo[] raizesX = new Complexo[2];
        Complexo[] raizesY = new Complexo[2];
        Complexo ax = new Complexo(1, 0);
        Complexo bx = new Complexo(5, 0);
        Complexo cx = new Complexo(4, 0);
        Complexo ay = new Complexo(1, 0);
        Complexo by = new Complexo(2, 0);
        Complexo cy = new Complexo(5, 0);
        raizesX = raizesEquacao(ax, bx, cx);
        raizesY = raizesEquacao(ay, by, cy);
        System.out.println("x1=" + raizesX[0]);
        System.out.println("x2=" + raizesX[1]);
        System.out.println("y1=" + raizesY[0]);
        System.out.println("y2=" + raizesY[1]);

    }
    
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c){
        Complexo[] result = new Complexo[2];
        Complexo delta = (b.prod(b)).sub((a.prod(c)).prod(4));
        Complexo[] raizesDelta = delta.sqrt();
        result[0] = (raizesDelta[0].sub(b)).div(a.prod(2));
        result[1] = (raizesDelta[1].sub(b)).div(a.prod(2));
        return result;
    }
    
}
