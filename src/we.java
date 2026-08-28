public interface we {
   zg a();

   vs b();

   void a(vt var1);

   default void a(zf $$0, Exception $$1) throws aa {
      throw zi.a($$1, $$0, this);
   }

   default vt a(wy $$0, Throwable $$1) {
      return new vt($$0);
   }

   boolean c();

   default boolean a(zf<?> $$0) {
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
