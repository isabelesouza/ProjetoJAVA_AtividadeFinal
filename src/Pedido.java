public class Pedido {
    public void fazerPedido(String comida) {
        if (comida.equalsIgnoreCase("Pizza")) {

            prepararPizza();
        } else if (comida.equalsIgnoreCase("Hambúrguer")) {

            prepararHamburguer();
        } else {
            System.out.println("Desculpe, não temos esse prato no cardápio.");
        }
    }

    private void prepararPizza() {
        System.out.println("Preparando pizza... Daqui a pouco seu pedido estará pronto!");
    
    }

    private void prepararHamburguer() {
        System.out.println("Preparando hambúrguer...Daqui a pouco seu pedido estará pronto!");
    }
}