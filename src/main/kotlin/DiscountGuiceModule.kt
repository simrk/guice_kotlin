import com.google.inject.AbstractModule
import com.google.inject.Provides
import java.time.LocalTime

class DiscountGuiceModule : AbstractModule()
{
    override fun configure() {
    }

    @Provides
    fun get(): Discountable {
        val hour = LocalTime.now().hour
        println("Hour: $hour")
        return if(hour<9) {
            NightOwlDiscount()
        }else {
            EarlyBirdDiscount()
        }
    }
}