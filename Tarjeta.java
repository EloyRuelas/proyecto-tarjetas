
public class Tarjeta
{
    private float Saldo;
    public Tarjeta()
    {
        Saldo=0;
    }
    
    /**
     *  Nos permite depositar dinero en la tarjeta.
     *  @param dinero es la variable que nos pregunta por cuanto dinero deseamos depositar.
     */
    public void depositar(float dinero)
    {
        if(dinero>0)
        {
            Saldo=Saldo+dinero;
        }
        else
        {
            System.out.println("No se puede depositar numeros negativos");
        }   
    }
    
    /**
     * Nos permite retirar dinero de la tarjeta.
     * @param dinero es la variable para decirle cuanto dinero retiraremos de la tarjeta.
     * @return Devuelve la cantidad de dinero retirada, o 0 si no tiene suficiente saldo.
     */
    public float retirar(float dinero)
    {
        if(Saldo>=dinero)
        {
            Saldo=Saldo-dinero;
            return(dinero);
        }
        else
        {   
            return 0;
        }
    }
    
    /**
     * Nos permite consultar cuanto saldo tiene la tarjeta.
     */
    public void consultar()
    {
        System.out.println("Su saldo es de :" + Saldo + "\n");
   }
}