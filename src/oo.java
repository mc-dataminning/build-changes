import javax.annotation.Nullable;

public interface oo {
   alf a = new alf("recipes/root");

   oo a(String var1, an<?> var2);

   oo a(@Nullable String var1);

   cum a();

   void a(oq var1, alf var2);

   default void a(oq $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(oq $$0, String $$1) {
      alf $$2 = a(this.a());
      alf $$3 = new alf($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static alf a(dbz $$0) {
      return lp.h.b($$0.r());
   }

   static cyn a(op $$0) {
      return switch ($$0) {
         case a -> cyn.a;
         case e, f -> cyn.c;
         case c -> cyn.b;
         default -> cyn.d;
      };
   }
}
