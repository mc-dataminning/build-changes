import javax.annotation.Nullable;

public interface ou {
   all a = all.b("recipes/root");

   ou a(String var1, ap<?> var2);

   ou a(@Nullable String var1);

   cwb a();

   void a(ow var1, all var2);

   default void a(ow $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(ow $$0, String $$1) {
      all $$2 = a(this.a());
      all $$3 = all.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static all a(dfe $$0) {
      return lz.g.b($$0.j());
   }

   static dah a(ov $$0) {
      return switch ($$0) {
         case a -> dah.a;
         case e, f -> dah.c;
         case c -> dah.b;
         default -> dah.d;
      };
   }
}
