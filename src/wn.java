public interface wn {
   zp a();

   wc b();

   void a(wd var1);

   default void a(zo $$0, Exception $$1) throws z {
      throw zr.a($$1, $$0, this);
   }

   default wd a(xh $$0, Throwable $$1) {
      return new wd($$0);
   }

   boolean c();

   default boolean a(zo<?> $$0) {
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
