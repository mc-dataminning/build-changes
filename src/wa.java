public interface wa {
   zc a();

   vq b();

   void a(wu var1);

   default void a(zb $$0, Exception $$1) throws y {
      throw ze.a($$1, $$0, this);
   }

   boolean c();

   default boolean a(zb<?> $$0) {
      return this.c();
   }

   default void a(o $$0) {
      p $$1 = $$0.a("Connection");
      $$1.a("Protocol", () -> this.b().a());
      $$1.a("Flow", () -> this.a().toString());
      this.a($$1);
   }

   default void a(p $$0) {
   }
}
