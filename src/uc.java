import io.netty.util.Attribute;

public interface uc {
   static void a(Attribute<tt.a<?>> $$0, wk<?> $$1) {
      tt $$2 = $$1.c();
      if ($$2 != null) {
         tt.a<?> $$3 = (tt.a<?>)$$0.get();
         tt $$4 = $$3.a();
         if ($$2 != $$4) {
            tt.a<?> $$5 = $$2.b($$3.b());
            $$0.set($$5);
         }
      }
   }
}
