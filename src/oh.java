import javax.annotation.Nullable;

public interface oh {
   akk a = new akk("recipes/root");

   oh a(String var1, an<?> var2);

   oh a(@Nullable String var1);

   cty a();

   void a(oj var1, akk var2);

   default void a(oj $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(oj $$0, String $$1) {
      akk $$2 = a(this.a());
      akk $$3 = new akk($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static akk a(dcf $$0) {
      return lq.g.b($$0.r());
   }

   static cxy a(oi $$0) {
      return switch ($$0) {
         case a -> cxy.a;
         case e, f -> cxy.c;
         case c -> cxy.b;
         default -> cxy.d;
      };
   }
}
