import javax.annotation.Nullable;

public interface oe {
   ali a = ali.b("recipes/root");

   oe a(String var1, ar<?> var2);

   oe a(@Nullable String var1);

   czu a();

   void a(og var1, alh<dep<?>> var2);

   default void a(og $$0) {
      this.a($$0, alh.a(mh.bv, a(this.a())));
   }

   default void a(og $$0, String $$1) {
      ali $$2 = a(this.a());
      ali $$3 = ali.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, alh.a(mh.bv, $$3));
      }
   }

   static ali a(djw $$0) {
      return mg.g.b($$0.h());
   }

   static dec a(of $$0) {
      return switch ($$0) {
         case a -> dec.a;
         case e, f -> dec.c;
         case c -> dec.b;
         default -> dec.d;
      };
   }
}
