public interface wu {
   zw a();

   wk b();

   void a(xo var1);

   default void a(zv $$0, Exception $$1) throws y {
      throw zy.a($$1, $$0, this);
   }

   boolean c();

   default boolean a(zv<?> $$0) {
      return this.c();
   }

   default void a(o $$0) {
      p $$1 = $$0.a("Connection");
      $$1.a("Protocol", () -> this.b().a());
      $$1.a("Flow", () -> this.a().toString());
      this.a($$1);
   }

   default void a(p $$0) {
   }
}
