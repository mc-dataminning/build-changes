public interface wq {
   zs a();

   wf b();

   void a(wg var1);

   default void a(zr $$0, Exception $$1) throws z {
      throw zu.a($$1, $$0, this);
   }

   default wg a(xk $$0, Throwable $$1) {
      return new wg($$0);
   }

   boolean c();

   default boolean a(zr<?> $$0) {
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
