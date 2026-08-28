public interface wp {
   zr a();

   we b();

   void a(wf var1);

   default void a(zq $$0, Exception $$1) throws z {
      throw zt.a($$1, $$0, this);
   }

   default wf a(xj $$0, Throwable $$1) {
      return new wf($$0);
   }

   boolean c();

   default boolean a(zq<?> $$0) {
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
