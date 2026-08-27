import javax.annotation.Nullable;

public interface mw {
   ahg a = new ahg("recipes/root");

   mw a(String var1, an<?> var2);

   mw a(@Nullable String var1);

   cms a();

   void a(my var1, ahg var2);

   default void a(my $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(my $$0, String $$1) {
      ahg $$2 = a(this.a());
      ahg $$3 = new ahg($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ahg a(ctn $$0) {
      return kd.h.b($$0.k());
   }

   static cpr a(mx $$0) {
      return switch ($$0) {
         case a -> cpr.a;
         case e, f -> cpr.c;
         case c -> cpr.b;
         default -> cpr.d;
      };
   }
}
