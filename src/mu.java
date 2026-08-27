import javax.annotation.Nullable;

public interface mu {
   ahd a = new ahd("recipes/root");

   mu a(String var1, an<?> var2);

   mu a(@Nullable String var1);

   cmm a();

   void a(mw var1, ahd var2);

   default void a(mw $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(mw $$0, String $$1) {
      ahd $$2 = a(this.a());
      ahd $$3 = new ahd($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ahd a(cth $$0) {
      return kd.h.b($$0.k());
   }

   static cpl a(mv $$0) {
      return switch ($$0) {
         case a -> cpl.a;
         case e, f -> cpl.c;
         case c -> cpl.b;
         default -> cpl.d;
      };
   }
}
