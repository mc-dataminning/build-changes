import javax.annotation.Nullable;

public interface oo {
   alc a = alc.b("recipes/root");

   oo a(String var1, ao<?> var2);

   oo a(@Nullable String var1);

   cvk a();

   void a(oq var1, alc var2);

   default void a(oq $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(oq $$0, String $$1) {
      alc $$2 = a(this.a());
      alc $$3 = alc.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static alc a(def $$0) {
      return lu.g.b($$0.q());
   }

   static czv a(op $$0) {
      return switch ($$0) {
         case a -> czv.a;
         case e, f -> czv.c;
         case c -> czv.b;
         default -> czv.d;
      };
   }
}
