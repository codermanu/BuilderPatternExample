package Food;
//Create abstract classes implementing the item interface providing default functionalities.

import Interfaces.Item;
import Interfaces.Packing;
import Packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing Packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();

}
