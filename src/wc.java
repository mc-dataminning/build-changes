public interface wc {
   ze a();

   vq b();

   void a(vr var1);

   default void a(zd $$0, Exception $$1) throws z {
      throw zg.a($$1, $$0, this);
   }

   default vr a(ww $$0, Throwable $$1) {
      return new vr($$0);
   }

   boolean c();

   default boolean a(zd<?> $$0) {
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
