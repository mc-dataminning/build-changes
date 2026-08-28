public interface we {
   zg a();

   vt b();

   void a(vu var1);

   default void a(zf $$0, Exception $$1) throws z {
      throw zi.a($$1, $$0, this);
   }

   default vu a(wy $$0, Throwable $$1) {
      return new vu($$0);
   }

   boolean c();

   default boolean a(zf<?> $$0) {
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
