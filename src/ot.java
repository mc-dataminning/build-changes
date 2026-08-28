import javax.annotation.Nullable;

public interface ot {
   ali a = ali.b("recipes/root");

   ot a(String var1, ap<?> var2);

   ot a(@Nullable String var1);

   cvx a();

   void a(ov var1, ali var2);

   default void a(ov $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(ov $$0, String $$1) {
      ali $$2 = a(this.a());
      ali $$3 = ali.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ali a(dfa $$0) {
      return ly.g.b($$0.j());
   }

   static dad a(ou $$0) {
      return switch ($$0) {
         case a -> dad.a;
         case e, f -> dad.c;
         case c -> dad.b;
         default -> dad.d;
      };
   }
}
