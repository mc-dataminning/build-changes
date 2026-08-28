import javax.annotation.Nullable;

public interface ov {
   alp a = alp.b("recipes/root");

   ov a(String var1, ap<?> var2);

   ov a(@Nullable String var1);

   cxc a();

   void a(ox var1, alo<dbv<?>> var2);

   default void a(ox $$0) {
      this.a($$0, alo.a(mb.bk, a(this.a())));
   }

   default void a(ox $$0, String $$1) {
      alp $$2 = a(this.a());
      alp $$3 = alp.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, alo.a(mb.bk, $$3));
      }
   }

   static alp a(dgy $$0) {
      return ma.g.b($$0.j());
   }

   static dbi a(ow $$0) {
      return switch ($$0) {
         case a -> dbi.a;
         case e, f -> dbi.c;
         case c -> dbi.b;
         default -> dbi.d;
      };
   }
}
