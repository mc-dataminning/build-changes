import javax.annotation.Nullable;

public interface od {
   akm a = new akm("recipes/root");

   od a(String var1, an<?> var2);

   od a(@Nullable String var1);

   ctj a();

   void a(of var1, akm var2);

   default void a(of $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(of $$0, String $$1) {
      akm $$2 = a(this.a());
      akm $$3 = new akm($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static akm a(daw $$0) {
      return le.h.b($$0.q());
   }

   static cxk a(oe $$0) {
      return switch ($$0) {
         case a -> cxk.a;
         case e, f -> cxk.c;
         case c -> cxk.b;
         default -> cxk.d;
      };
   }
}
