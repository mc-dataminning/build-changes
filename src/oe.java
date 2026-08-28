import javax.annotation.Nullable;

public interface oe {
   alg a = alg.b("recipes/root");

   oe a(String var1, ar<?> var2);

   oe a(@Nullable String var1);

   czj a();

   void a(og var1, alf<dee<?>> var2);

   default void a(og $$0) {
      this.a($$0, alf.a(mh.bv, a(this.a())));
   }

   default void a(og $$0, String $$1) {
      alg $$2 = a(this.a());
      alg $$3 = alg.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, alf.a(mh.bv, $$3));
      }
   }

   static alg a(djl $$0) {
      return mg.g.b($$0.h());
   }

   static ddr a(of $$0) {
      return switch ($$0) {
         case a -> ddr.a;
         case e, f -> ddr.c;
         case c -> ddr.b;
         default -> ddr.d;
      };
   }
}
