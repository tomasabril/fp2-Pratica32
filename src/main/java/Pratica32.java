/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * modificado por Tomás Abril
 */
public class Pratica32
{
    public static void main(String[] args) 
    {
        System.out.println(densidade(-1, 67, 3));
        
    }
    public static double densidade(double x, double media, double desvio) {
        double d = 1/(Math.sqrt(2*Math.PI)*desvio)*Math.pow(Math.E, -1.0/2*Math.pow((x-media)/desvio, 2));
        return d;
    }
}
