public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Арбуз", 400));
        vm.addProduct(new Product("Печеньки", 120));
        vm.addProduct(new Bread("Любятово", 40,"Белый"));
        vm.addProduct(new Yogurt("Данон", 40, "Сладкий"));

        System.out.println(vm);

    }
}