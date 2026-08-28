public interface wg {
   zi a();

   vu b();

   void a(vv var1);

   default void a(zh $$0, Exception $$1) throws aa {
      throw zk.a($$1, $$0, this);
   }

   default vv a(xa $$0, Throwable $$1) {
      return new vv($$0);
   }

   boolean c();

   default boolean a(zh<?> $$0) {
      return this.c();
   }

   default void a(p $$0) {
      q $$1 = $$0.a("Connection");
      $$1.a("Protocol", () -> this.b().a());
      $$1.a("Flow", () -> this.a().toString());
      this.a($$0, $$1);
   }

   default void a(p $$0, q $$1) {
   }
}
