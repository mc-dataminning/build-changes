import javax.annotation.Nullable;

public interface ol {
   akr a = akr.b("recipes/root");

   ol a(String var1, ao<?> var2);

   ol a(@Nullable String var1);

   cul a();

   void a(on var1, akr var2);

   default void a(on $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(on $$0, String $$1) {
      akr $$2 = a(this.a());
      akr $$3 = akr.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static akr a(dcv $$0) {
      return lt.g.b($$0.r());
   }

   static cyo a(om $$0) {
      return switch ($$0) {
         case a -> cyo.a;
         case e, f -> cyo.c;
         case c -> cyo.b;
         default -> cyo.d;
      };
   }
}
