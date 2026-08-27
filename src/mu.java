import javax.annotation.Nullable;

public interface mu {
   agm a = new agm("recipes/root");

   mu a(String var1, am<?> var2);

   mu a(@Nullable String var1);

   clj a();

   void a(mw var1, agm var2);

   default void a(mw $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(mw $$0, String $$1) {
      agm $$2 = a(this.a());
      agm $$3 = new agm($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static agm a(cse $$0) {
      return kc.i.b($$0.k());
   }
}
