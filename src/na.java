import javax.annotation.Nullable;

public interface na {
   ajc a = new ajc("recipes/root");

   na a(String var1, an<?> var2);

   na a(@Nullable String var1);

   cpl a();

   void a(nc var1, ajc var2);

   default void a(nc $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(nc $$0, String $$1) {
      ajc $$2 = a(this.a());
      ajc $$3 = new ajc($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ajc a(cwd $$0) {
      return kh.h.b($$0.l());
   }

   static csi a(nb $$0) {
      return switch ($$0) {
         case a -> csi.a;
         case e, f -> csi.c;
         case c -> csi.b;
         default -> csi.d;
      };
   }
}
