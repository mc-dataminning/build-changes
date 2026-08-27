import javax.annotation.Nullable;

public interface mo {
   afw a = new afw("recipes/root");

   mo a(String var1, am<?> var2);

   mo a(@Nullable String var1);

   cke a();

   void a(mq var1, afw var2);

   default void a(mq $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(mq $$0, String $$1) {
      afw $$2 = a(this.a());
      afw $$3 = new afw($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static afw a(cqy $$0) {
      return jy.i.b($$0.k());
   }
}
