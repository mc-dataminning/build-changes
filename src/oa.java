import javax.annotation.Nullable;

public interface oa {
   akh a = new akh("recipes/root");

   oa a(String var1, an<?> var2);

   oa a(@Nullable String var1);

   csu a();

   void a(oc var1, akh var2);

   default void a(oc $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(oc $$0, String $$1) {
      akh $$2 = a(this.a());
      akh $$3 = new akh($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static akh a(dac $$0) {
      return ld.h.b($$0.q());
   }

   static cwt a(ob $$0) {
      return switch ($$0) {
         case a -> cwt.a;
         case e, f -> cwt.c;
         case c -> cwt.b;
         default -> cwt.d;
      };
   }
}
