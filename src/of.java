import javax.annotation.Nullable;

public interface of {
   alr a = alr.b("recipes/root");

   of a(String var1, ar<?> var2);

   of a(@Nullable String var1);

   dag a();

   void a(oh var1, alq<dfb<?>> var2);

   default void a(oh $$0) {
      this.a($$0, alq.a(mi.bv, a(this.a())));
   }

   default void a(oh $$0, String $$1) {
      alr $$2 = a(this.a());
      alr $$3 = alr.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, alq.a(mi.bv, $$3));
      }
   }

   static alr a(dki $$0) {
      return mh.g.b($$0.h());
   }

   static deo a(og $$0) {
      return switch ($$0) {
         case a -> deo.a;
         case e, f -> deo.c;
         case c -> deo.b;
         default -> deo.d;
      };
   }
}
