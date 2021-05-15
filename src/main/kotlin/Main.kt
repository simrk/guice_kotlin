import com.google.inject.Guice

   fun main(args :Array<String>)
    {
        val injector = Guice.createInjector(DiscountGuiceModule())
        val checkoutService = injector.getInstance(CheckoutService::class.java)
        checkoutService.checkout(100.0)
    }
