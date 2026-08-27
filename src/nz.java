import javax.annotation.Nullable;

public interface nz {
   akf a = new akf("recipes/root");

   nz a(String var1, an<?> var2);

   nz a(@Nullable String var1);

   cry a();

   void a(ob var1, akf var2);

   default void a(ob $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(ob $$0, String $$1) {
      akf $$2 = a(this.a());
      akf $$3 = new akf($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static akf a(czt $$0) {
      return lc.h.b($$0.p());
   }

   static cvw a(oa $$0) {
      return switch ($$0) {
         case a -> cvw.a;
         case e, f -> cvw.c;
         case c -> cvw.b;
         default -> cvw.d;
      };
   }
}
