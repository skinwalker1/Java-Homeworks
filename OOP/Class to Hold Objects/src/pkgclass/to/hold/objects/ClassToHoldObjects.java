
package pkgclass.to.hold.objects;

public class ClassToHoldObjects {

   
    public static void main(String[] args) {
       AnimalList Al = new AnimalList();
       Dog dog = new Dog();
       Fish fish = new Fish();
       Bird bird = new Bird();
       Animal[] thelist = {dog,fish,bird};
       for(int i = 0;i < thelist.length; i ++){
           Al.add(thelist[i]);
       }
       
       
    }
}
