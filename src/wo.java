public interface wo {
   zq a();

   wd b();

   void a(we var1);

   default void a(zp $$0, Exception $$1) throws z {
      throw zs.a($$1, $$0, this);
   }

   default we a(xi $$0, Throwable $$1) {
      return new we($$0);
   }

   boolean c();

   default boolean a(zp<?> $$0) {
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
