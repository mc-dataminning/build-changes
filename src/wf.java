public interface wf {
   zh a();

   vu b();

   void a(vv var1);

   default void a(zg $$0, Exception $$1) throws z {
      throw zj.a($$1, $$0, this);
   }

   default vv a(wz $$0, Throwable $$1) {
      return new vv($$0);
   }

   boolean c();

   default boolean a(zg<?> $$0) {
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
