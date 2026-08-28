import javax.annotation.Nullable;

public interface of {
   alk a = alk.b("recipes/root");

   of a(String var1, ar<?> var2);

   of a(@Nullable String var1);

   czw a();

   void a(oh var1, alj<der<?>> var2);

   default void a(oh $$0) {
      this.a($$0, alj.a(mi.bv, a(this.a())));
   }

   default void a(oh $$0, String $$1) {
      alk $$2 = a(this.a());
      alk $$3 = alk.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, alj.a(mi.bv, $$3));
      }
   }

   static alk a(djy $$0) {
      return mh.g.b($$0.h());
   }

   static dee a(og $$0) {
      return switch ($$0) {
         case a -> dee.a;
         case e, f -> dee.c;
         case c -> dee.b;
         default -> dee.d;
      };
   }
}
