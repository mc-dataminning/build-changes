import io.netty.util.Attribute;

public interface uo {
   static void a(Attribute<uf.a<?>> $$0, xd<?> $$1) {
      uf $$2 = $$1.c();
      if ($$2 != null) {
         uf.a<?> $$3 = (uf.a<?>)$$0.get();
         uf $$4 = $$3.a();
         if ($$2 != $$4) {
            uf.a<?> $$5 = $$2.b($$3.b());
            $$0.set($$5);
         }
      }
   }
}
