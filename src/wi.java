public interface wi {
   zk a();

   vw b();

   void a(vx var1);

   default void a(zj $$0, Exception $$1) throws aa {
      throw zm.a($$1, $$0, this);
   }

   default vx a(xc $$0, Throwable $$1) {
      return new vx($$0);
   }

   boolean c();

   default boolean a(zj<?> $$0) {
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
