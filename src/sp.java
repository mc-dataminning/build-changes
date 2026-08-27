import io.netty.util.Attribute;

public interface sp {
   static void a(Attribute<sg.a<?>> $$0, uw<?> $$1) {
      sg $$2 = $$1.c();
      if ($$2 != null) {
         sg.a<?> $$3 = (sg.a<?>)$$0.get();
         sg $$4 = $$3.a();
         if ($$2 != $$4) {
            sg.a<?> $$5 = $$2.b($$3.b());
            $$0.set($$5);
         }
      }
   }
}
