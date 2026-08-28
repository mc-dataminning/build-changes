import javax.annotation.Nullable;

public interface od {
   alg a = alg.b("recipes/root");

   od a(String var1, aq<?> var2);

   od a(@Nullable String var1);

   cyz a();

   void a(of var1, alf<ddu<?>> var2);

   default void a(of $$0) {
      this.a($$0, alf.a(mg.bu, a(this.a())));
   }

   default void a(of $$0, String $$1) {
      alg $$2 = a(this.a());
      alg $$3 = alg.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, alf.a(mg.bu, $$3));
      }
   }

   static alg a(diz $$0) {
      return mf.g.b($$0.h());
   }

   static ddh a(oe $$0) {
      return switch ($$0) {
         case a -> ddh.a;
         case e, f -> ddh.c;
         case c -> ddh.b;
         default -> ddh.d;
      };
   }
}
