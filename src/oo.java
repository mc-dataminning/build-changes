import javax.annotation.Nullable;

public interface oo {
   alb a = alb.b("recipes/root");

   oo a(String var1, ao<?> var2);

   oo a(@Nullable String var1);

   cvg a();

   void a(oq var1, alb var2);

   default void a(oq $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(oq $$0, String $$1) {
      alb $$2 = a(this.a());
      alb $$3 = alb.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static alb a(ddr $$0) {
      return lu.g.b($$0.r());
   }

   static czh a(op $$0) {
      return switch ($$0) {
         case a -> czh.a;
         case e, f -> czh.c;
         case c -> czh.b;
         default -> czh.d;
      };
   }
}
