import com.google.inject.Inject
import com.google.inject.Provider

class CheckoutService @Inject constructor(private val discountable: Provider<Discountable>)
{
    fun checkout(shoppingCartTotal : Double) : Double
    {
        val totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discountable.get().getDiscount())
        println("totalAfterDiscount: $totalAfterDiscount")

        return totalAfterDiscount
    }
}