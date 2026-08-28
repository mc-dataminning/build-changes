import javax.annotation.Nullable;

public interface oo {
   ale a = new ale("recipes/root");

   oo a(String var1, an<?> var2);

   oo a(@Nullable String var1);

   cui a();

   void a(oq var1, ale var2);

   default void a(oq $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(oq $$0, String $$1) {
      ale $$2 = a(this.a());
      ale $$3 = new ale($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ale a(dbv $$0) {
      return lp.h.b($$0.r());
   }

   static cyj a(op $$0) {
      return switch ($$0) {
         case a -> cyj.a;
         case e, f -> cyj.c;
         case c -> cyj.b;
         default -> cyj.d;
      };
   }
}
