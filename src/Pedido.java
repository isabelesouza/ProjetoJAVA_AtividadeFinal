public class Pedido {

    public void fazerPedido(String comida) {
        if (comida.equals("Pizza")) {
            prepararPizza();
        } else if (comida.equals("Hambúrguer")) {

            prepararHamburguer();
        } else {
            System.out.println("Desculpe, não temos esse prato no cardápio.");
        }
    }

    private void prepararPizza() {
        System.out.println("Preparando pizza...");
    }

    private void prepararHamburguer() {
        System.out.println("Preparando hambúrguer...");
    }
}
