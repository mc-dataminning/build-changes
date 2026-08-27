import javax.annotation.Nullable;

public interface ms {
   agt a = new agt("recipes/root");

   ms a(String var1, an<?> var2);

   ms a(@Nullable String var1);

   cmc a();

   void a(mu var1, agt var2);

   default void a(mu $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(mu $$0, String $$1) {
      agt $$2 = a(this.a());
      agt $$3 = new agt($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static agt a(csx $$0) {
      return kb.h.b($$0.k());
   }

   static cpb a(mt $$0) {
      return switch ($$0) {
         case a -> cpb.a;
         case e, f -> cpb.c;
         case c -> cpb.b;
         default -> cpb.d;
      };
   }
}
