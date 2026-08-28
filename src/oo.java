import javax.annotation.Nullable;

public interface oo {
   alb a = new alb("recipes/root");

   oo a(String var1, an<?> var2);

   oo a(@Nullable String var1);

   cuf a();

   void a(oq var1, alb var2);

   default void a(oq $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(oq $$0, String $$1) {
      alb $$2 = a(this.a());
      alb $$3 = new alb($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static alb a(dbs $$0) {
      return lp.h.b($$0.r());
   }

   static cyg a(op $$0) {
      return switch ($$0) {
         case a -> cyg.a;
         case e, f -> cyg.c;
         case c -> cyg.b;
         default -> cyg.d;
      };
   }
}
