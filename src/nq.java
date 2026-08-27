import javax.annotation.Nullable;

public interface nq {
   ajv a = new ajv("recipes/root");

   nq a(String var1, an<?> var2);

   nq a(@Nullable String var1);

   crn a();

   void a(ns var1, ajv var2);

   default void a(ns $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(ns $$0, String $$1) {
      ajv $$2 = a(this.a());
      ajv $$3 = new ajv($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ajv a(czf $$0) {
      return kt.h.b($$0.p());
   }

   static cvi a(nr $$0) {
      return switch ($$0) {
         case a -> cvi.a;
         case e, f -> cvi.c;
         case c -> cvi.b;
         default -> cvi.d;
      };
   }
}
