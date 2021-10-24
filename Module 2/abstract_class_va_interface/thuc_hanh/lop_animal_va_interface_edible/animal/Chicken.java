package abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal;
import abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.Edible;
import abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
