import io.netty.util.Attribute;

public interface st {
   static void a(Attribute<sk.a<?>> $$0, va<?> $$1) {
      sk $$2 = $$1.c();
      if ($$2 != null) {
         sk.a<?> $$3 = (sk.a<?>)$$0.get();
         sk $$4 = $$3.a();
         if ($$2 != $$4) {
            sk.a<?> $$5 = $$2.b($$3.b());
            $$0.set($$5);
         }
      }
   }
}
