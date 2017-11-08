/**
 * This basic calendar return the date (dd-mm-yy), 
 * allow to change the date by 
 * user input or advance it one dia.
 * 
 * @author (Daniel Carmenes Alvarez) 
 * @version (2017/10/27)
 */
public class CalendarioBasico
{
    // Save the dia.
    private DisplayDosCaracteres dia;
    // Save the mes.
    private DisplayDosCaracteres mes;
    // Save the ano.
    private DisplayDosCaracteres ano;
    
    /**
     * Constructor for objects of class CalendarioBasico.
     */
    public CalendarioBasico()
    {
        dia = new DisplayDosCaracteres (31);
        mes = new DisplayDosCaracteres (13);
        ano = new DisplayDosCaracteres (100);
    }

    /**
     * Returns date in format (dd-mm-yy) with 8 characters. 
    */
    public String obtenerFecha ()
    {
        // Create a text chain like: '1dd-1mm-1yy'.
        return dia.getTextoDelDisplay() + "-" 
            + mes.getTextoDelDisplay() + "-" 
            + ano.getTextoDelDisplay();
    }
    
    /**
     * Set a specific date.
     * Note: There are no control methods to validate data entry.
     */
    public void fijarFecha (int setDay, int setMonth, int setYear) 
    {
        dia.setValorAlmacenado(setDay);
        mes.setValorAlmacenado(setMonth);
        ano.setValorAlmacenado(setYear);
    }    
    /**
     * Add one dia to the date.
     * 
     * Who needs a T.A.R.D.I.S.?
     */
    public void avanzarFecha ()
    {
        // Check if adding a dia changes the mes or ano. 
            if (dia.getValorAlmacenado() == 30) {
                 mes.incrementaValorAlmacenado();
                    if (mes.getValorAlmacenado() == 1){
                        ano.incrementaValorAlmacenado();
                    }
            }
            dia.incrementaValorAlmacenado();
    }
}    
