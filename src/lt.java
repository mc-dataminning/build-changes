import javax.annotation.Nullable;

public interface lt {
   aex a = new aex("recipes/root");

   lt a(String var1, am<?> var2);

   lt a(@Nullable String var1);

   cja a();

   void a(lv var1, aex var2);

   default void a(lv $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(lv $$0, String $$1) {
      aex $$2 = a(this.a());
      aex $$3 = new aex($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static aex a(cpu $$0) {
      return jd.i.b($$0.k());
   }
}
