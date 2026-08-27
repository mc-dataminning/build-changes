import javax.annotation.Nullable;

public interface mq {
   agi a = new agi("recipes/root");

   mq a(String var1, am<?> var2);

   mq a(@Nullable String var1);

   cle a();

   void a(ms var1, agi var2);

   default void a(ms $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(ms $$0, String $$1) {
      agi $$2 = a(this.a());
      agi $$3 = new agi($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static agi a(crz $$0) {
      return jy.i.b($$0.k());
   }
}
