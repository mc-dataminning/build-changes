public interface wr {
   zt a();

   wg b();

   void a(wh var1);

   default void a(zs $$0, Exception $$1) throws z {
      throw zv.a($$1, $$0, this);
   }

   default wh a(xl $$0, Throwable $$1) {
      return new wh($$0);
   }

   boolean c();

   default boolean a(zs<?> $$0) {
      return this.c();
   }

   default void a(o $$0) {
      p $$1 = $$0.a("Connection");
      $$1.a("Protocol", () -> this.b().a());
      $$1.a("Flow", () -> this.a().toString());
      this.a($$0, $$1);
   }

   default void a(o $$0, p $$1) {
   }
}
