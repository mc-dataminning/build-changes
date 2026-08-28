import javax.annotation.Nullable;

public interface op {
   ale a = ale.b("recipes/root");

   op a(String var1, ao<?> var2);

   op a(@Nullable String var1);

   cvn a();

   void a(or var1, ale var2);

   default void a(or $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(or $$0, String $$1) {
      ale $$2 = a(this.a());
      ale $$3 = ale.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ale a(dei $$0) {
      return lv.g.b($$0.q());
   }

   static czy a(oq $$0) {
      return switch ($$0) {
         case a -> czy.a;
         case e, f -> czy.c;
         case c -> czy.b;
         default -> czy.d;
      };
   }
}
