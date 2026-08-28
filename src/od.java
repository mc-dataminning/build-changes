import javax.annotation.Nullable;

public interface od {
   ale a = ale.b("recipes/root");

   od a(String var1, aq<?> var2);

   od a(@Nullable String var1);

   cyo a();

   void a(of var1, ald<ddj<?>> var2);

   default void a(of $$0) {
      this.a($$0, ald.a(mg.bs, a(this.a())));
   }

   default void a(of $$0, String $$1) {
      ale $$2 = a(this.a());
      ale $$3 = ale.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, ald.a(mg.bs, $$3));
      }
   }

   static ale a(dio $$0) {
      return mf.g.b($$0.h());
   }

   static dcw a(oe $$0) {
      return switch ($$0) {
         case a -> dcw.a;
         case e, f -> dcw.c;
         case c -> dcw.b;
         default -> dcw.d;
      };
   }
}
