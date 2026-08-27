import io.netty.util.Attribute;

public interface sw {
   static void a(Attribute<sn.a<?>> $$0, vd<?> $$1) {
      sn $$2 = $$1.c();
      if ($$2 != null) {
         sn.a<?> $$3 = (sn.a<?>)$$0.get();
         sn $$4 = $$3.a();
         if ($$2 != $$4) {
            sn.a<?> $$5 = $$2.b($$3.b());
            $$0.set($$5);
         }
      }
   }
}
