import javax.annotation.Nullable;

public interface oe {
   alg a = alg.b("recipes/root");

   oe a(String var1, ar<?> var2);

   oe a(@Nullable String var1);

   czg a();

   void a(og var1, alf<deb<?>> var2);

   default void a(og $$0) {
      this.a($$0, alf.a(mh.bu, a(this.a())));
   }

   default void a(og $$0, String $$1) {
      alg $$2 = a(this.a());
      alg $$3 = alg.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, alf.a(mh.bu, $$3));
      }
   }

   static alg a(djg $$0) {
      return mg.g.b($$0.h());
   }

   static ddo a(of $$0) {
      return switch ($$0) {
         case a -> ddo.a;
         case e, f -> ddo.c;
         case c -> ddo.b;
         default -> ddo.d;
      };
   }
}
