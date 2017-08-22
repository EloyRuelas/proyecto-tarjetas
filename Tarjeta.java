
public class Tarjeta
{
    private float Saldo;
    public Tarjeta()
    {
        Saldo=0;
    }
    
    public void depositar(float dinero)
    {
        Saldo=Saldo+dinero;
    }
    
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
    
    public void consultar()
    {
        System.out.println("Su saldo es de :" + Saldo + "\n");
   }
}