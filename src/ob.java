import javax.annotation.Nullable;

public interface ob {
   ald a = ald.b("recipes/root");

   ob a(String var1, aq<?> var2);

   ob a(@Nullable String var1);

   cxu a();

   void a(od var1, alc<dcl<?>> var2);

   default void a(od $$0) {
      this.a($$0, alc.a(me.br, a(this.a())));
   }

   default void a(od $$0, String $$1) {
      ald $$2 = a(this.a());
      ald $$3 = ald.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, alc.a(me.br, $$3));
      }
   }

   static ald a(dho $$0) {
      return md.g.b($$0.i());
   }

   static dby a(oc $$0) {
      return switch ($$0) {
         case a -> dby.a;
         case e, f -> dby.c;
         case c -> dby.b;
         default -> dby.d;
      };
   }
}
