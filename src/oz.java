import javax.annotation.Nullable;

public interface oz {
   alz a = alz.b("recipes/root");

   oz a(String var1, ap<?> var2);

   oz a(@Nullable String var1);

   cxg a();

   void a(pb var1, aly<dbz<?>> var2);

   default void a(pb $$0) {
      this.a($$0, aly.a(mb.bj, a(this.a())));
   }

   default void a(pb $$0, String $$1) {
      alz $$2 = a(this.a());
      alz $$3 = alz.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, aly.a(mb.bj, $$3));
      }
   }

   static alz a(dgz $$0) {
      return ma.g.b($$0.j());
   }

   static dbn a(pa $$0) {
      return switch ($$0) {
         case a -> dbn.a;
         case e, f -> dbn.c;
         case c -> dbn.b;
         default -> dbn.d;
      };
   }
}
