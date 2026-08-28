public interface wb {
   zd a();

   vp b();

   void a(vq var1);

   default void a(zc $$0, Exception $$1) throws z {
      throw zf.a($$1, $$0, this);
   }

   default vq a(wv $$0, Throwable $$1) {
      return new vq($$0);
   }

   boolean c();

   default boolean a(zc<?> $$0) {
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
