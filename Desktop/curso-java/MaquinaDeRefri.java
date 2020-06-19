public class MaquinaDeRefri{
    private double credito, temp;
    private Refrigerante lista[];

    public MaquinaDeRefri (){
        this.credito = 0.0;
        lista = new Refrigerante[4];
        lista[0] = new Refrigerante("Coca Cola", 2.50, 5);
        lista[1] = new Refrigerante("Guarana", 2.35, 5);
        lista[2] = new Refrigerante("Soda", 2.20, 5);
        lista[3] = new Refrigerante("Fanta Laranja", 2.40, 5);
    }
    public void inserirCredito(double credito){
        this.credito = this.credito + credito;
    }
    public double solicitarTroco(){
        if (this.credito > 0){
            double troco;
            troco = this.credito;
            this.credito = 0.0;
            return troco;
        }
        else {
            return this.credito;
        }
    }
    public int comprarRefri(int num){
        if (lista[num].getQtde() > 0){
            if (lista[num].getPreco() > this.credito){
                return 0;
            }
            else{
            lista[num].setQtde(lista[num].getQtde() -1);
            return 1;
        }
        }
        else {
            return 2;
        }
    }

}