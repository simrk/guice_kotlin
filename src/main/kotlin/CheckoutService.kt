import com.google.inject.Inject
import com.google.inject.Provider

class CheckoutService @Inject constructor(private val discountable: Discountable)
{
    fun checkout(shoppingCartTotal : Double) : Double
    {
        val totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discountable.getDiscount())
        println("totalAfterDiscount: $totalAfterDiscount")

        return totalAfterDiscount
    }
}