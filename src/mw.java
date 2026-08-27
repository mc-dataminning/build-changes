import javax.annotation.Nullable;

public interface mw {
   ahh a = new ahh("recipes/root");

   mw a(String var1, an<?> var2);

   mw a(@Nullable String var1);

   cnb a();

   void a(my var1, ahh var2);

   default void a(my $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(my $$0, String $$1) {
      ahh $$2 = a(this.a());
      ahh $$3 = new ahh($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ahh a(ctw $$0) {
      return kd.h.b($$0.j());
   }

   static cqa a(mx $$0) {
      return switch ($$0) {
         case a -> cqa.a;
         case e, f -> cqa.c;
         case c -> cqa.b;
         default -> cqa.d;
      };
   }
}
