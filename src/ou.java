import javax.annotation.Nullable;

public interface ou {
   alj a = alj.b("recipes/root");

   ou a(String var1, ap<?> var2);

   ou a(@Nullable String var1);

   cwi a();

   void a(ow var1, alj var2);

   default void a(ow $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(ow $$0, String $$1) {
      alj $$2 = a(this.a());
      alj $$3 = alj.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static alj a(dfl $$0) {
      return lz.g.b($$0.j());
   }

   static dao a(ov $$0) {
      return switch ($$0) {
         case a -> dao.a;
         case e, f -> dao.c;
         case c -> dao.b;
         default -> dao.d;
      };
   }
}
