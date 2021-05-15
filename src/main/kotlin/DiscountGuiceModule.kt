import com.google.inject.AbstractModule

class DiscountGuiceModule : AbstractModule()
{
    override fun configure() {
        bind(Discountable::class.java).to(EarlyBirdDiscount::class.java)
    }
}