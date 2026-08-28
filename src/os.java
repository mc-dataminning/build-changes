import javax.annotation.Nullable;

public interface os {
   alh a = alh.b("recipes/root");

   os a(String var1, ao<?> var2);

   os a(@Nullable String var1);

   cvt a();

   void a(ou var1, alh var2);

   default void a(ou $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(ou $$0, String $$1) {
      alh $$2 = a(this.a());
      alh $$3 = alh.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static alh a(deu $$0) {
      return lx.g.b($$0.j());
   }

   static czx a(ot $$0) {
      return switch ($$0) {
         case a -> czx.a;
         case e, f -> czx.c;
         case c -> czx.b;
         default -> czx.d;
      };
   }
}
