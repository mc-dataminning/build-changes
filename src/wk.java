public interface wk {
   zm a();

   vz b();

   void a(wa var1);

   default void a(zl $$0, Exception $$1) throws z {
      throw zo.a($$1, $$0, this);
   }

   default wa a(xe $$0, Throwable $$1) {
      return new wa($$0);
   }

   boolean c();

   default boolean a(zl<?> $$0) {
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
