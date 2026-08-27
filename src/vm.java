public interface vm {
   yo a();

   vf b();

   void a(wg var1);

   boolean c();

   default boolean a(yn<?> $$0) {
      return this.c();
   }

   default boolean d() {
      return true;
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
