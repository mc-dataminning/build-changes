import io.netty.util.Attribute;

public interface sy {
   static void a(Attribute<sp.a<?>> $$0, vf<?> $$1) {
      sp $$2 = $$1.c();
      if ($$2 != null) {
         sp.a<?> $$3 = (sp.a<?>)$$0.get();
         sp $$4 = $$3.a();
         if ($$2 != $$4) {
            sp.a<?> $$5 = $$2.b($$3.b());
            $$0.set($$5);
         }
      }
   }
}
