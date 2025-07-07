package Clases;
public class Local extends GestionExpediente{
    private GestionExpediente ListaExpedienteREGULAR = new GestionExpediente();
    private GestionExpediente ListaExpedientePRIORIDAD = new GestionExpediente();
    
    public void Ingresar(Expediente Expediente){
        if(Expediente.getPrioridad()==1){
            ListaExpedientePRIORIDAD.encolar(Expediente);
        }else{
            ListaExpedienteREGULAR.encolar(Expediente);
        }
    }
    
    public void MostrarColas(){
        String colas="Cola Prioritaria: "+
                this.ListaExpedientePRIORIDAD.MostrarLista()+
                "\n\nCola Regular: "+
                this.ListaExpedienteREGULAR.MostrarLista();
        System.out.println(colas);
    }

    @Override
    public String MostrarLista() {
        return super.MostrarLista();
    }
    
    @Override
    public String FinTramite(Expediente Expediente) {
        return super.FinTramite(Expediente);
    }
    
    @Override
    public Object desencolar() {
        return super.desencolar();
    }
    
    @Override
    public void encolar(Object pElemento) {
        super.encolar(pElemento);
    }
}
