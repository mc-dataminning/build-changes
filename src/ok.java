import javax.annotation.Nullable;

public interface ok {
   akq a = akq.b("recipes/root");

   ok a(String var1, ao<?> var2);

   ok a(@Nullable String var1);

   cuj a();

   void a(om var1, akq var2);

   default void a(om $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(om $$0, String $$1) {
      akq $$2 = a(this.a());
      akq $$3 = akq.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static akq a(dct $$0) {
      return lt.g.b($$0.r());
   }

   static cym a(ol $$0) {
      return switch ($$0) {
         case a -> cym.a;
         case e, f -> cym.c;
         case c -> cym.b;
         default -> cym.d;
      };
   }
}
