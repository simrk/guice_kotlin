import com.google.inject.Guice

   fun main(args :Array<String>)
    {
        val injector = Guice.createInjector(DiscountGuiceModule())
        val instance = injector.getInstance(CheckoutService::class.java)
        instance.checkout(100.0)
    }
