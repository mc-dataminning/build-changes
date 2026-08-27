import javax.annotation.Nullable;

public interface lt {
   aey a = new aey("recipes/root");

   lt a(String var1, am<?> var2);

   lt a(@Nullable String var1);

   cjc a();

   void a(lv var1, aey var2);

   default void a(lv $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(lv $$0, String $$1) {
      aey $$2 = a(this.a());
      aey $$3 = new aey($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static aey a(cpw $$0) {
      return jd.i.b($$0.k());
   }
}
