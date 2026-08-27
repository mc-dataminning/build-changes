import io.netty.util.Attribute;

public interface sx {
   static void a(Attribute<so.a<?>> $$0, ve<?> $$1) {
      so $$2 = $$1.c();
      if ($$2 != null) {
         so.a<?> $$3 = (so.a<?>)$$0.get();
         so $$4 = $$3.a();
         if ($$2 != $$4) {
            so.a<?> $$5 = $$2.b($$3.b());
            $$0.set($$5);
         }
      }
   }
}
