import javax.annotation.Nullable;

public interface od {
   akn a = new akn("recipes/root");

   od a(String var1, an<?> var2);

   od a(@Nullable String var1);

   ctl a();

   void a(of var1, akn var2);

   default void a(of $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(of $$0, String $$1) {
      akn $$2 = a(this.a());
      akn $$3 = new akn($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static akn a(day $$0) {
      return le.h.b($$0.r());
   }

   static cxm a(oe $$0) {
      return switch ($$0) {
         case a -> cxm.a;
         case e, f -> cxm.c;
         case c -> cxm.b;
         default -> cxm.d;
      };
   }
}
