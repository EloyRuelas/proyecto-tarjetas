
public class Tarjeta
{
    private float Saldo;
    public Tarjeta()
    {
        Saldo=0;
    }
    
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