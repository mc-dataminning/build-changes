import javax.annotation.Nullable;

public interface my {
   aiy a = new aiy("recipes/root");

   my a(String var1, an<?> var2);

   my a(@Nullable String var1);

   cou a();

   void a(na var1, aiy var2);

   default void a(na $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(na $$0, String $$1) {
      aiy $$2 = a(this.a());
      aiy $$3 = new aiy($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static aiy a(cvm $$0) {
      return kf.h.b($$0.j());
   }

   static crr a(mz $$0) {
      return switch ($$0) {
         case a -> crr.a;
         case e, f -> crr.c;
         case c -> crr.b;
         default -> crr.d;
      };
   }
}
