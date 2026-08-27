import javax.annotation.Nullable;

public interface no {
   ajt a = new ajt("recipes/root");

   no a(String var1, an<?> var2);

   no a(@Nullable String var1);

   cre a();

   void a(nq var1, ajt var2);

   default void a(nq $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(nq $$0, String $$1) {
      ajt $$2 = a(this.a());
      ajt $$3 = new ajt($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ajt a(cyw $$0) {
      return kr.h.b($$0.p());
   }

   static cuz a(np $$0) {
      return switch ($$0) {
         case a -> cuz.a;
         case e, f -> cuz.c;
         case c -> cuz.b;
         default -> cuz.d;
      };
   }
}
